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
