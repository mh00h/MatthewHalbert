package edu.asu.bmi.cda;

/**
 * Homework 6
 *
 */

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.apibinding.OWLManager;

import java.io.FileOutputStream;
import java.util.Set;
import java.util.List;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class Ontology
{
    static final String BMI591 = "http://edu.asu.bmi/cad591/matthew/skos/ext#";
    static final String SKOS = "http://www.w3.org/2004/02/skos/core#";
    static final String BMIVOCAB = "http://edu.asu.bmi/cad591/matthew/skos/ext/bmiVocabulary#";

    OWLOntology ontology;
    OWLOntologyManager manager;
    OWLDataFactory factory;

    public OWLOntology getOntology ( ) throws Exception {
        manager = OWLManager.createOWLOntologyManager();
        ontology = manager.loadOntologyFromOntologyDocument(
                // the relative path to your file, where "/" corresponds to src/main/resources
                this.getClass().getResourceAsStream( "/test.owl" )
        );
        factory = manager.getOWLDataFactory();
        return(ontology);
    }

    public void addOWLObjectProperty(String property, String subjectIndividual, String object) {
        // instantiates a relationship between two individuals
        OWLObjectPropertyAssertionAxiom opa = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create( property ) ), // the property
            factory.getOWLNamedIndividual( IRI.create( subjectIndividual ) ), // the subject
            factory.getOWLNamedIndividual( IRI.create( object ) ) // the object
        );
        //add the axiom to the manager
        manager.addAxiom(ontology, opa);
    }

    // instantiates a data property (“attribute”) of an individual
    public void addOWLDataProperty( String property,String individual, String value ) {
        OWLDataPropertyAssertionAxiom oda = factory.getOWLDataPropertyAssertionAxiom(
            factory.getOWLDataProperty( IRI.create(property) ),
            factory.getOWLNamedIndividual( IRI.create(individual) ),
            value);
        //stage the axiom to the manager
        manager.addAxiom( ontology, oda );
    }

    public void saveOntology() throws Exception {
        manager.saveOntology(ontology, System.err);
        //anything else need to go here?
    }

    //now it is time to add coded concepts
    public void addCodedConcept( String name, String code ) {
        //create a named individual from the IRI
        OWLNamedIndividual ind = factory.getOWLNamedIndividual(IRI.create( BMI591 + name ));
        //add the name and code
        addOWLObjectProperty(SKOS+"inScheme", BMI591+ name, BMI591+"bmiVocabulary");
        addOWLDataProperty(SKOS+"inScheme", BMI591+ name, code);
        //add the axiom linking ontology to ind
        //a bit hazy on how this line works
        manager.addAxiom( ontology, factory.getOWLDeclarationAxiom( ind ) );
    }

    public static OWLOntology getPopulatedOntology(OWLOntology ontology) {
        return ontology;
    }

	public boolean checkRelationship(String string, String string2,
			String string3) {
		// TODO Auto-generated method stub
		return false;
	}
}

