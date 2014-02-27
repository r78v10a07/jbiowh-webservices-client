package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.ontology.entities.Ontologies;
import org.jbiowhpersistence.datasets.ontology.entities.Ontology;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the OntologyClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 24, 2014
 */
public class OntologyClientTest {

    public OntologyClientTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findGeneInfoByGOId_XML method, of class OntologyClient.
     */
    @Test
    public void testFindGeneInfoByGOId_XML() {
        System.out.println("findGeneInfoByGOId_XML");
        String id = "GO:0000001";
        OntologyClient instance = new OntologyClient();
        long[] ids = {36309, 53567, 3253202, 3253304};
        GeneInfoes result = instance.findGeneInfoByGOId_XML(id);
        instance.close();
        int count = 0;
        int expResult = ids.length;
        for (GeneInfo g : result.getGeneInfoes()) {
            for (long s : ids) {
                if (g.getGeneID() == s) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findProteinByGOId_XML method, of class OntologyClient.
     */
    @Test
    public void testFindProteinByGOId_XML() {
        System.out.println("findProteinByGOId_XML");
        String id = "GO:0000001";
        String[] ids = {"A7UWZ2_NEUCR", "PP2C1_YEAST", "GEM1_NEUCR", "TPM1_YEAST"};
        OntologyClient instance = new OntologyClient();
        int count = 0;
        int expResult = ids.length;
        Proteins result = instance.findProteinByGOId_XML(id);
        instance.close();
        for (Protein p : result.getProteins()) {
            for (String s : ids) {
                if (s.equals(p.getProteinNameDirected())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findByGOId_XML method, of class OntologyClient.
     */
    @Test
    public void testFindByGOId_XML() {
        System.out.println("findByGOId_XML");
        String id = "GO:00000%25";
        String[] ids = {"GO:0000001", "GO:0000002", "GO:0000003", "GO:0000005"};
        OntologyClient instance = new OntologyClient();
        int count = 0;
        int expResult = ids.length;
        Ontologies result = instance.findByGOId_XML(id);
        instance.close();
        for (Ontology p : result.getOntologies()) {
            for (String s : ids) {
                if (s.equals(p.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findRange_XML method, of class GeneInfoClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "3";
        OntologyClient instance = new OntologyClient();
        Ontologies result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(3, result.getOntologies().size());
    }
}
