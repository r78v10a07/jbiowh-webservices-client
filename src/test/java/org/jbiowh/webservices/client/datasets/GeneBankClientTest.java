/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.gene.genebank.entities.GeneBank;
import org.jbiowhpersistence.datasets.gene.genebank.entities.GeneBanks;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the GeneBankClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Mar 20, 2014
 */
public class GeneBankClientTest {

    public GeneBankClientTest() {
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
     * Test of findRange_XML method, of class GeneBankClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        GeneBankClient instance = new GeneBankClient();
        int expResult = 10;
        GeneBanks result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getGeneBanks().size());
    }

    /**
     * Test of findByLocusName_XML method, of class GeneBankClient.
     */
    @Test
    public void testFindByLocusName_XML() {
        System.out.println("findByLocusName_XML");
        String id = "CP002312";
        GeneBankClient instance = new GeneBankClient();
        String expResult = "Borrelia burgdorferi JD1";
        GeneBank result = instance.findByLocusName_XML(id);
        instance.close();
        assertEquals(expResult, result.getSource());
    }

    /**
     * Test of findProteinByLocusName_XML method, of class GeneBankClient.
     */
    @Test
    public void testFindProteinByLocusName_XML() {
        System.out.println("findProteinByLocusName_XML");
        String id = "CP002312";
        GeneBankClient instance = new GeneBankClient();
        Proteins result = instance.findProteinByLocusName_XML(id);
        instance.close();
        String[] ids = {"E4S0L7_BORBJ", "E4S116_BORBJ", "E4S2J3_BORBJ", "E4S0P8_BORBJ"};
        int count = 0;
        int expResult = ids.length;
        for (Protein d : result.getProteins()) {
            for (String s : ids) {
                if (s.equals(d.getProteinNameDirected())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findGeneInfoByLocusName_XML method, of class GeneBankClient.
     */
    @Test
    public void testFindGeneInfoByLocusName_XML() {
        System.out.println("findGeneInfoByLocusName_XML");
        String id = "CP002312";
        GeneBankClient instance = new GeneBankClient();
        GeneInfoes result = instance.findGeneInfoByLocusName_XML(id);
        long[] ids = {12381078, 12381229, 12380931, 12381110};
        int count = 0;
        int expResult = ids.length;
        for (GeneInfo d : result.getGeneInfoes()) {
            for (long s : ids) {
                if (s == d.getGeneID()) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }
}
