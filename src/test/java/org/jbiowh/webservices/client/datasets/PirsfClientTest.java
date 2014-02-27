package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsfs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the PirsfClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 26, 2014
 */
public class PirsfClientTest {

    public PirsfClientTest() {
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
     * Test of findProteinByName_XML method, of class PirsfClient.
     */
    @Test
    public void testFindProteinByName_XML() {
        System.out.println("findProteinByName_XML");
        String id = "PIRSF000002";
        PirsfClient instance = new PirsfClient();
        Proteins result = instance.findProteinByName_XML(id);
        instance.close();
        String[] ids = {"Q5SIX9_THET8", "Q5F9U7_NEIG1", "A1IQW9_NEIMA", "A0B2B6_BURCH"};
        int count = 0;
        int expResult = ids.length;
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
     * Test of findByName_XML method, of class PirsfClient.
     */
    @Test
    public void testFindByName_XML() {
        System.out.println("findByName_XML");
        String id = "PIRSF038885";
        PirsfClient instance = new PirsfClient();
        String expResult = "cytochrome b";
        Pirsfs result = instance.findByName_XML(id);
        instance.close();
        assertEquals(expResult, result.getPirsfs().get(0).getName());
    }

    /**
     * Test of findRange_XML method, of class PirsfClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        PirsfClient instance = new PirsfClient();
        int expResult = 10;
        Pirsfs result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getPirsfs().size());
    }
}
