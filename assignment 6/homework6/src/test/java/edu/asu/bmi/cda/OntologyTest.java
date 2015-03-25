package edu.asu.bmi.cda;

import org.junit.Test;
import org.junit.Assert.assertFalse;

/**
 * Unit test for simple App.
 */
public class OntologyTest {
    //@Test
    public void AncestorsEqualDescendents() throws Exception {
        String BMI591 = "http://edu.asu.bmi/cad591/varun/skos/ext#";
        String SKOS = "http://www.w3.org/2004/02/skos/core#";

        Ontology df = new Ontology();
        df.getPopulatedOnt();

        assertFalse(db.checkRelationship( BMI591+"Antibacterial floor mat", BMI591+"subTypeOf",BMI591+"Floor mat"));
        ReasonerHelper reason = new ReasonerHelper();
        reason.makeInferences( df.getPopulatedOnt());

    }
}
