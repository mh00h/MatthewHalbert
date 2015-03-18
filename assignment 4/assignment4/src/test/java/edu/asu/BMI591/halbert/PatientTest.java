package org.hl7.fhir.model;
//package edu.asu.BMI591.halbert;

//import org.hl7.fhir.model.*;
import org.hl7.fhir.model.*;

//import org.hl7.fhir.model.impl.String;
//import org.hl7.fhir.model.impl.Coding;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Unit test for Patient (2.2.1)
 */

public class PatientTest {

    //@Test
    public void PatientGettersShouldEqualSettersValues (){
        //Generate new FHIR element, the basis for all other elements
        Patient MyPatient = new Patient();
        //
        //specify patient's gender
        //
            //gender requires a CodableConcept to be passed to it. So first...
            //create male and m strings for coding obect
            
            String male = new String();
            male.setValue("MALE");

            Code m = new Code();
            m.setValue("M");
            //create a Coding object, which will contain the gender concept
            //create a CodeableConcept entry (male, female) that can be attached to Coding
            CodeableConcept cc = new CodeableConcept();
            Coding co = new Coding();
            co.setDisplay(male);
            co.setCode(m);
            cc.getCodings().add(co);
            //add gender attribute to MyPatient
            MyPatient.setGender(cc);

        //
        //set patient's id number
        //
            //create an identifier that we can pass into MyPatient
            //why do we have to go the round about way of inputting string like this?
            Identifier patientIdentifier = new Identifier();
            String patientID = new String();
            patientID.setValue("someIDvalue");
            patientIdentifier.setValue(patientID);
            //save identifier to MyPatient
            MyPatient.getIdentifiers().add(patientIdentifier);

        //
        //set patient's name
        //
            //names follow the same pattern as identifiers
            //set HumanName: make HumanName
            HumanName patientName = new HumanName();
            //create the familyname variable and append it to the HumanName
            String familyName = new String();
            familyName.setValue("Halbert");

            patientName.setText(familyName);
            patientName.getFamilies().add(familyName);
            //create the given name variable and append it to HumanName
            String patientHumanName_given = new String();
            patientHumanName_given.setValue("Halbert");

            patientName.getGivens().add(patientHumanName_given);
            //save HumanName to MyPatient
            MyPatient.getNames().add(patientName);

        //
        //set birthday
        //
            DateTime dt = new DateTime();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            Date birthDate = sdf.parse("01/01/2001 01:01");
            dt.setValue(birthDate);

            MyPatient.setBirthDate(dt);


        //
        //deceasedBoolean
        //
            Boolean deceased = new Boolean();
            deceased.setValue(true);
            MyPatient.setDeceasedBoolean(deceased);

        //
        //deceasedDate
        //
            
            DateTime dt2 = new DateTime();
            SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            Date deceasedDate = sdf2.parse("01/01/2011 01:01");
            dt2.setValue(deceasedDate);
            MyPatient.setDeceasedDateTime(dt2);

        //
        //multipleBirthBoolean
        //
            Boolean mb = new Boolean();
            mb.setValue(true);
            MyPatient.setMultipleBirthBoolean(mb);






        assertEquals("Patient id's must be the same", MyPatient.getIdentifiers().get(0).getValue().getValue(), "someIDvalue");
    }

    public void XmlRoundRobin (){
        //
        JAXBContext c = JAXBContext.newInstance( Patient.class.getPackage().getName() );
        Unmarshaller um = c.createUnmarshaller();
        
        InputStream is = new FileInputStream(new File("src/main/resources/patient-example.xml"));
        Patient p = (Patient) um.unmarshal( is );
    }
}

