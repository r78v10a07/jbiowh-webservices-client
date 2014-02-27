package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.taxonomy.entities.Taxonomies;
import org.jbiowhpersistence.datasets.taxonomy.entities.Taxonomy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the TaxonomyClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 26, 2014
 */
public class TaxonomyClientTest {

    public TaxonomyClientTest() {
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
     * Test of findGeneInfoByTaxId_XML method, of class TaxonomyClient.
     */
    @Test
    public void testFindGeneInfoByTaxId_XML() {
        System.out.println("findGeneInfoByTaxId_XML");
        String taxid = "197";
        TaxonomyClient instance = new TaxonomyClient();
        long[] ids = {1343080, 1343081, 1343082, 3979052, 4083180, 16028252};
        int count = 0;
        int expResult = ids.length;
        GeneInfoes result = instance.findGeneInfoByTaxId_XML(taxid);
        instance.close();
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
     * Test of findByTaxId_XML method, of class TaxonomyClient.
     */
    @Test
    public void testFindByTaxId_XML() {
        System.out.println("findByTaxId_XML");
        String taxid = "9906";
        TaxonomyClient instance = new TaxonomyClient();
        String expResult = "Bos javanicus";
        Taxonomy result = instance.findByTaxId_XML(taxid);
        instance.close();
        assertEquals(expResult, result.getTaxonomySynonym());
    }

    /**
     * Test of findRange_XML method, of class TaxonomyClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        int expResult = 10;
        TaxonomyClient instance = new TaxonomyClient();
        Taxonomies result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getTaxonomys().size());
    }

    /**
     * Test of findProteinByTaxId_XML method, of class TaxonomyClient.
     */
    @Test
    public void testFindProteinByTaxId_XML() {
        System.out.println("findProteinByTaxId_XML");
        String taxid = "11";
        TaxonomyClient instance = new TaxonomyClient();
        String[] ids = {"O66264_9CELL", "P96316_9CELL", "P77843_9CELL"};
        int count = 0;
        int expResult = ids.length;
        Proteins result = instance.findProteinByTaxId_XML(taxid);
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

}
