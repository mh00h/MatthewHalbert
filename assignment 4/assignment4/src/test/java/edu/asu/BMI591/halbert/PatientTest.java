package org.hl7.fhir.model;
//package edu.asu.BMI591.halbert;

//import org.hl7.fhir.model.*;
import org.hl7.fhir.model.impl.*;

//import org.hl7.fhir.model.impl.StringImpl;
//import org.hl7.fhir.model.impl.CodingImpl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Patient (2.2.1)
 */

public class PatientTest {

    //@Test
    public void PatientGettersShouldEqualSettersValues (){
        //Generate new FHIR element, the basis for all other elements
        Patient MyPatient = new PatientImpl();
        //
        //specify patient's gender
        //
            //gender requires a CodableConcept to be passed to it. So first...
            //create male and m strings for coding obect
            String male = new StringImpl();
            male.setValue("MALE");

            String m = new StringImpl();
            m.setValue("M");
            //create a Coding object, which will contain the gender concept
            Coding co_gender = new CodingImpl()
                //add codes to the co
                //how do these work exactly?
                .withDisplay(male)
                .withCode(m)
            ;
            //create a CodeableConcept entry (male, female) that can be attached to Coding
            CodeableConcept cc_gender = new CodeableConceptImpl();
            cc_gender.getCodings().add(co_gender);
            //add gender attribute to MyPatient
            MyPatient.setGender(cc_gender);

        //
        //set patient's id number
        //
            //create an identifier that we can pass into MyPatient
            //why do we have to go the round about way of inputting string like this?
            Identifier patientIdentifier = new IdentifierImpl();
            String patientID = new StringImpl();
            patientID.setValue("someIDvalue");
            patientIdentifier.setValue(patientID);
            //save identifier to MyPatient
            MyPatient.getIdentifier().add(patientIdentifier);

        //
        //set patient's name
        //
            //names follow the same pattern as identifiers
            //set HumanName: make HumanNameImpl
            HumanName patientHumanName = new HumanNameImpl();
            //create the familyname variable and append it to the HumanName
            String patientHumanName_family = new StringImpl();
            patientHumanName_family.setValue("Halbert");

            patientHumanName.getFamily().add(patientHumanName_family);
            //create the given name variable and append it to HumanName
            String patientHumanName_given = new StringImpl();
            patientHumanName_given.setValue("Halbert");

            patientHumanName.getGiven().add(patientHumanName_given);
            //save HumanName to MyPatient
            MyPatient.getName().add(patientHumanName);

        //
        //set birthday
        //
            MyPatient.setBirthDate(dateTime.setValue(new DateImpl(sdf.parse("01/01/2001 01:01"))));

        //
        //deceased
        //
            MyPatient.setDeceasedBoolean(new BooleanImpl().withValue(true));

        //
        //deceasedBoolean
        //
            MyPatient.sedeceasedDateTime(dateTime.setValue(new DateImpl(sdf.parse("01/01/2006 01:01"))));

        //
        //multipleBirthBoolean
        //
            MyPatient.multipleBirthBoolean(new BooleanImpl().withValue(false));






        assertEquals("Patient id's must be the same", MyPatient.getIdentifier().get(0).getValue().getValue(), "someIDvalue");
    }

    public void XmlRoundRobin (){
        //
        JAXBContext c = JAXBContext.newInstance( Patient.class.getPackage().getName() );
        Unmarshaller um = c.createUnmarshaller();
        
        InputStream is = new FileInputStream(new File("src/main/resources/patient-example.xml"));
        Patient p = (Patient) um.unmarshal( is );
    }
}

