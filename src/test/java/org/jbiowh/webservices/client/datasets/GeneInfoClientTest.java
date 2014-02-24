/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.disease.omim.entities.OMIM;
import org.jbiowhpersistence.datasets.disease.omim.entities.OMIMs;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the GeneInfoClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 24, 2014
 */
public class GeneInfoClientTest {

    public GeneInfoClientTest() {
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
     * Test of findByGeneID_XML method, of class GeneInfoClient.
     */
    @Test
    public void testFindByGeneID_XML() {
        System.out.println("findByGeneID_XML");
        String id = "57514";
        GeneInfoClient instance = new GeneInfoClient();
        String expResult = "ARHGAP31";
        GeneInfo result = instance.findByGeneID_XML(id);
        instance.close();
        assertEquals(expResult, result.getSymbol());
    }

    /**
     * Test of findOMIMByGeneID_XML method, of class GeneInfoClient.
     */
    @Test
    public void testFindOMIMByGeneID_XML() {
        System.out.println("findOMIMByGeneID_XML");
        String id = "57514";
        GeneInfoClient instance = new GeneInfoClient();
        long[] ids = {100300, 610911};
        int count = 0;
        int expResult = ids.length;
        OMIMs result = instance.findOMIMByGeneID_XML(id);
        instance.close();
        for (OMIM o : result.getOmims()) {
            for (long s : ids) {
                if (o.getOmimId() == s) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findProteinByGeneID_XML method, of class GeneInfoClient.
     */
    @Test
    public void testFindProteinByGeneID_XML() {
        System.out.println("findProteinByGeneID_XML");
        String id = "2947819";
        GeneInfoClient instance = new GeneInfoClient();
        String expResult = "040R_FRG3G";
        Proteins result = instance.findProteinByGeneID_XML(id);
        instance.close();
        assertEquals(expResult, result.getProteins().get(0).getProteinNameDirected());
    }

    /**
     * Test of findRange_XML method, of class GeneInfoClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "3";
        GeneInfoClient instance = new GeneInfoClient();
        GeneInfoes result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(3, result.getGeneInfoes().size());
    }
}
