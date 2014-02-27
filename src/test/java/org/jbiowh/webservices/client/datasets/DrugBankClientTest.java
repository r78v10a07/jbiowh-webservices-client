package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBanks;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the DrugBankClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 27, 2014
 */
public class DrugBankClientTest {

    public DrugBankClientTest() {
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
     * Test of findProteinAsTransportersById_XML method, of class
     * DrugBankClient.
     */
    @Test
    public void testFindProteinAsTransportersById_XML() {
        System.out.println("findProteinAsTransportersById_XML");
        String id = "DB00451";
        DrugBankClient instance = new DrugBankClient();
        Proteins result = instance.findProteinAsTransportersById_XML(id);
        instance.close();
        String[] ids = {"SO1C1_HUMAN", "SO1B1_HUMAN", "MDR1_HUMAN", "MOT8_HUMAN"};
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
     * Test of findById_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindById_XML() {
        System.out.println("findById_XML");
        String id = "DB00009";
        DrugBankClient instance = new DrugBankClient();
        DrugBanks result = instance.findById_XML(id);
        instance.close();
        String expResult = "Alteplase";
        assertEquals(expResult, result.getDrugBanks().get(0).getName());
    }

    /**
     * Test of findProteinAsEnzymeById_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindProteinAsEnzymeById_XML() {
        System.out.println("findProteinAsEnzymeById_XML");
        String id = "DB00130";
        DrugBankClient instance = new DrugBankClient();
        Proteins result = instance.findProteinAsEnzymeById_XML(id);
        instance.close();
        String[] ids = {"GLSK_HUMAN", "TGM7_HUMAN", "F13A_HUMAN", "PYR1_HUMAN"};
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
     * Test of findAllProteinById_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindAllProteinById_XML() {
        System.out.println("findAllProteinById_XML");
        String id = "DB00394";
        DrugBankClient instance = new DrugBankClient();
        Proteins result = instance.findAllProteinById_XML(id);
        instance.close();
        String[] ids = {"GCR_HUMAN", "CBG_HUMAN", "CP3A5_HUMAN"};
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
     * Test of findProteinAsCarriersById_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindProteinAsCarriersById_XML() {
        System.out.println("findProteinAsCarriersById_XML");
        String id = "DB08231";
        DrugBankClient instance = new DrugBankClient();
        Proteins result = instance.findProteinAsCarriersById_XML(id);
        instance.close();
        String[] ids = {"ALBU_HUMAN", "FABPI_HUMAN", "APOM_HUMAN"};
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
     * Test of findProteinById_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindProteinById_XML() {
        System.out.println("findProteinById_XML");
        String id = "DB00004";
        DrugBankClient instance = new DrugBankClient();
        Proteins result = instance.findProteinById_XML(id);
        instance.close();
        String[] ids = {"IL2RG_HUMAN", "IL2RB_HUMAN", "IL2RA_HUMAN"};
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
     * Test of findRange_XML method, of class DrugBankClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        DrugBankClient instance = new DrugBankClient();
        int expResult = 10;
        DrugBanks result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getDrugBanks().size());
    }

}
