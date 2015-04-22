package edu.asu.bmi.cda;
/**
 * Homework 6
 *
 */

import java.io.FileOutputStream;
import java.util.Set;
import java.util.List;

public class Example
{
    public static void main(String[] args) throws Exception {
        Ontology df = new Ontology();
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
        df.addOwlObjectProperty("subtypeOf", "Bulk air compressor", "Air compressor, device");
        df.addOwlObjectProperty("subtypeOf", "Air compressor, device", "Device");

        //save ontology
        df.saveOntology();

        ReasonerHelper reason = new ReasonerHelper();
        reason.makeInferences( df.getPopulatedOnt());
    }
}
