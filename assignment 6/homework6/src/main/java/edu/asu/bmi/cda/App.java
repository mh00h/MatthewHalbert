package edu.asu.bmi.cda;

/**
 * Homework 6
 *
 */

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.apibinding.OWLManager;

import java.io.FileOutputStream;
import java.util.Set;

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

public class App
{
    static final String BMI591 = "http://edu.asu.bmi/cad591/matthew/skos/ext#";
    static final String SKOS = "http://www.w3.org/2004/02/skos/core#";
    static final String BMIVOCAB = "http://edu.asu.bmi/cad591/matthew/skos/ext/bmiVocabulary#";


    //why is this named the way it is?
    public OWLOntology getOntology ( ) throws Exception {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(
                // the relative path to your file, where "/" corresponds to src/main/resources
                this.getClass().getResourceAsStream( "/owl.owl" )
        );
        OWLDataFactory factory = manager.getOWLDataFactory();
        return(ontology);
    }

    public void saveOntology ( String ontology ) throws Exception {
        manager.saveOntology( ontology, System.err );
    }
    public void getOWLNamed ( String name ) throws Exception{
        String BMI591 = "http://edu.asu.bmi/cad591/matthew/skos/ext#";

        // instantiates OR looks up an individual with the given IRI
        OWLNamedIndividual ind = factory.getOWLNamedIndividual(IRI.create( BMI591 + name ) );
    }

    public void InstantiateRelationship (String property, String subject, String theobject) throws Exception{
        // instantiates a relationship between two individuals
            OWLObjectPropertyAssertionAxiom opa = factory.getOWLObjectPropertyAssertionAxiom(
            factory.getOWLObjectProperty( IRI.create( property ) ), // the property
            factory.getOWLNamedIndividual( IRI.create( subject ) ), // the subject
            factory.getOWLNamedIndividual( IRI.create( theobject ) ) // the object
        );
    }

    public void InstantiateAttribute (String property, String namedIndividual) throws Exception {
        // instantiates a data property (“attribute”) of an individual
        OWLDataPropertyAssertionAxiom oda = factory.getOWLDataPropertyAssertionAxiom(
            factory.getOWLDataProperty( IRI.create( property ) ),
            factory.getOWLNamedIndividual( IRI.create( namedIndividual ) ),
            value
        );
    }

    public void AddAxioms( String ontology, String ind, String opa, String oda ){
        //explicitly add it all to the ontology

        manager.addAxiom( ontology, factory.getOWLDeclarationAxiom( ind ) );
        manager.addAxiom( ontology, opa );
        manager.addAxiom( ontology, oda );
    }

    public void addCodedConcept(IRI id, String code, List<String> Labels, List<IRI> parents, OWLOntology ontology) throws Exception {
        OWLOntology ontology = getOntology();
        OWLDataFactory factory = manager.getOWLDataFactory();

        OWLNamedIndividual ind = factory.getOWLNamedIndividual(id);

        manager.saveOntology(ontology, System.err);
    }

    public void addRelationship(IRI subject, IRI property, IRI object,
            OWLOntology ontology) {

    }

}

