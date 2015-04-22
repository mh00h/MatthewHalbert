package edu.asu.bmi.cda;

import org.junit.Test;
import static org.junit.Assert.*;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * Unit test for simple App.
 */
public class OntologyTest {
    //@Test
    public void AncestorsEqualDescendents() throws Exception {
        String BMI591 = "http://edu.asu.bmi/cad591/varun/skos/ext#";
        String SKOS = "http://www.w3.org/2004/02/skos/core#";

        Ontology df = new Ontology();

        assertFalse( df.checkRelationship( BMI591+"Antibacterial floor mat", BMI591+"subTypeOf",BMI591+"Floor mat"));
        
        df.getOntology();

        //define some coded concepts
        df.addCodedConcept("Floor mat", "705620005");
        df.addCodedConcept("Antibacterial floor mat", "462691007");
        //add an object property
        df.addOWLObjectProperty("subTypeOf","Antibacterial floor mat", "Floor mat" );
        
        //the remainder of the floor mats available
        df.addCodedConcept("Floor mat", "reusable", "469764004");
        df.addOWLObjectProperty("subTypeOf", "Floor mat", "reusable", "Floor mat" );

        df.addCodedConcept("Floor mat", "single-use", "469934001");
        df.addOWLObjectProperty("subTypeOf", "Floor mat", "single-use", "Floor mat" );

        //air compressor
        df.addCodedConcept("Device","49062001");
        df.addCodedConcept("Air compressor, device","39590006");
        df.addCodedConcept("Bulk air compressor", "467864004");
        df.addOWLObjectProperty("subtypeOf", "Bulk air compressor", "Air compressor, device");
        df.addOWLObjectProperty("subtypeOf", "Air compressor, device", "Device");

        //save ontology
        df.saveOntology();

        ReasonerHelper reason = new ReasonerHelper();
        reason.makeInferences( df.getPopulatedOnt());
        
        //**********why do I need this here twice?
        OWLOntology popOntology = df.getPopulatedOntology(df.getOntology());
        
        ReasonerHelper reason = new ReasonerHelper();
        reason.makeInferences( popOntology );

        assertTrue( df.checkRelationship( BMI591+"Antibacterial floor mat", BMI591+"subTypeOf",BMI591+"Floor mat"));
    }
}
