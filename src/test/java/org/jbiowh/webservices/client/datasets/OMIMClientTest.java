package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.disease.omim.entities.OMIM;
import org.jbiowhpersistence.datasets.disease.omim.entities.OMIMTI;
import org.jbiowhpersistence.datasets.disease.omim.entities.OMIMs;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the OMIMClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 26, 2014
 */
public class OMIMClientTest {

    public OMIMClientTest() {
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
     * Test of findById_XML method, of class OMIMClient.
     */
    @Test
    public void testFindById_XML() {
        System.out.println("findById_XML");
        String id = "104300";
        OMIMClient instance = new OMIMClient();
        String data = null;
        String expResult = "#104300 ALZHEIMER DISEASE; AD";
        OMIM result = instance.findById_XML(id);
        instance.close();
        for (OMIMTI t : result.getOmimTI()) {
            if (t.getTi().equals(expResult)) {
                data = t.getTi();
                break;
            }
        }
        assertEquals(expResult, data);
    }

    /**
     * Test of findGeneInfoById_XML method, of class OMIMClient.
     */
    @Test
    public void testFindGeneInfoById_XML() {
        System.out.println("findGeneInfoById_XML");
        String id = "104300";
        long[] ids = {2, 323, 351, 642, 1636, 3077};
        OMIMClient instance = new OMIMClient();
        GeneInfoes result = instance.findGeneInfoById_XML(id);
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
     * Test of findRange_XML method, of class OMIMClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        OMIMClient instance = new OMIMClient();
        int expResult = 10;
        OMIMs result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getOmims().size());
    }
}
