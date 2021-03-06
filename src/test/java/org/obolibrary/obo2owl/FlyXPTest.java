package org.obolibrary.obo2owl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.semanticweb.owlapi.model.OWLOntology;

@SuppressWarnings("javadoc")
public class FlyXPTest extends OboFormatTestBasics {

    @Test
    public void testConvertXPs() throws Exception {
        OWLOntology owlOnt = convertOBOFile("http://obo.cvs.sourceforge.net/*checkout*/obo/obo/ontology/anatomy/gross_anatomy/animal_gross_anatomy/fly/fly_anatomy_XP.obo");
        assertNotNull(owlOnt);
    }

    private OWLOntology convertOBOFile(String fn) throws Exception {
        return convert(parseOBOURL(fn), "flyxp");
    }
}
