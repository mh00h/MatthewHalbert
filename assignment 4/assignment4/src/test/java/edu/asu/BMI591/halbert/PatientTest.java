package org.hl7.fhir.model;
//package edu.asu.BMI591.halbert;

import org.hl7.fhir.model.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Patient (2.2.1)
 */

public class PatientTest {

    //@Test
    public void PatientGettersShouldEqualSettersValues (){
        //Generate new FHIR element, the basis for all other elements
        Patient MyPatient = new Patient();
        //MyPatient = getExtension().add(Id);
        //MyPatient.Id.setValue("thisIsAnIDvalue");
        //assertEquals("Patient id's must be the same", MyPatient.Id.getValue(), "thisIsAnIDvalue");
    }
}
