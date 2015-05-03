package org.apache.tomcat.maven.api.impl;

import org.apache.tomcat.maven.api.FHIRService;
import org.springframework.stereotype.Service;

import edu.asu.BMI591.halbert.Patient;

@Service( "fhirService#default" )
public class DefaultFHIRService
implements FHIRService
{
public Patient getPatient( String pid ) {
Patient pat = new Patient();
// assign id and some other fields
return pat;
}
}