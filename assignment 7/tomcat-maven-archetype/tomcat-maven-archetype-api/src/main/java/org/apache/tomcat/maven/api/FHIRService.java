@Path( "FHIRService" )
public interface FHIRService
{
@Path( "Patient/{pid}" )
@GET
@Produces( { "application/xml" } )
Patient getPatient( @PathParam( "pid" ) String pid );
}
