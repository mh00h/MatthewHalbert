package edu.asu.bmi.cda;

/**
 * Homework 6
 *
 */

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.apibinding.OWLManager;

public class App 
{
    public static void main( String[] args )
    {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(
                // the relative path to your file, where "/" corresponds to src/main/resources
                this.getClass().getResourceAsStream( "/test.owl" )
        );
        OWLDataFactory factory = manager.getOWLDataFactory();
        manager.saveOntology( ontology, System.err );
    }
}
