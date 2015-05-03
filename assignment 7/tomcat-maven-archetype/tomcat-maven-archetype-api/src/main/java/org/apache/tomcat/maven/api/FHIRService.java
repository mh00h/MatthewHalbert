package org.apache.tomcat.maven.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.asu.BMI591.halbert.Patient;

@Path( "FHIRService" )
public interface FHIRService
{
@Path( "Patient/{pid}" )
@GET
@Produces( { "application/xml" } )
Patient getPatient( @PathParam( "pid" ) String pid );
}
