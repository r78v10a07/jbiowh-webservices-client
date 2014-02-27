package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.gene.genome.entities.GenePTT;
import org.jbiowhpersistence.datasets.gene.genome.entities.GenePTTs;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the GenePTTClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 26, 2014
 */
public class GenePTTClientTest {

    public GenePTTClientTest() {
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
     * Test of findProteinByPTTFileName_XML method, of class GenePTTClient.
     */
    @Test
    public void testFindProteinByPTTFileName_XML() {
        System.out.println("findProteinByPTTFileName_XML");
        String id = "NC_000948";
        String[] ids = {"Q9R3K2_BORBU", "Q9R2Q2_BORBU", "Q9R2Q0_BORBU", "Q9R3E0_BORBU"};
        int count = 0;
        int expResult = ids.length;
        GenePTTClient instance = new GenePTTClient();
        Proteins result = instance.findProteinByPTTFileName_XML(id);
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
     * Test of findGeneByPTTFileName_XML method, of class GenePTTClient.
     */
    @Test
    public void testFindGeneByPTTFileName_XML() {
        System.out.println("findGeneByPTTFileName_XML");
        String id = "NC_000948";
        long[] ids = {1194468,1194469,1194470,1194471,1194442};
        GenePTTClient instance = new GenePTTClient();
        GeneInfoes result = instance.findGeneByPTTFileName_XML(id);
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
     * Test of findGenePTTByPTTFileName_XML method, of class GenePTTClient.
     */
    @Test
    public void testFindGenePTTByPTTFileName_XML() {
        System.out.println("findGenePTTByPTTFileName_XML");
        String id = "NC_000948";
        GenePTTClient instance = new GenePTTClient();
        long[] ids = {11497090, 11497091, 11497092, 11497093};
        GenePTTs result = instance.findGenePTTByPTTFileName_XML(id);
        int count = 0;
        int expResult = ids.length;
        for (GenePTT g : result.getGenePTTs()) {
            for (long s : ids) {
                if (g.getProteinGi() == s) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findRange_XML method, of class GenePTTClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        GenePTTClient instance = new GenePTTClient();
        int expResult = 10;
        GenePTTs result = instance.findRange_XML(from, to);
        instance.close();        
        assertEquals(expResult, result.getGenePTTs().size());
    }
}
