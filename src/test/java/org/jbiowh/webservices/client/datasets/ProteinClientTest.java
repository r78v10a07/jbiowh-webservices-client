package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBank;
import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBanks;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfo;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsf;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsfs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This Class is the ProteinClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 26, 2014
 */
public class ProteinClientTest {

    public ProteinClientTest() {
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
     * Test of findDrugBankAsEnzymeByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindDrugBankAsEnzymeByName_XML() {
        System.out.println("findDrugBankAsEnzymeByName_XML");
        String id = "CP17A_HUMAN";
        ProteinClient instance = new ProteinClient();
        String[] ids = {"DB00396", "DB04630", "DB01424", "DB02901"};
        int count = 0;
        int expResult = ids.length;
        DrugBanks result = instance.findDrugBankAsEnzymeByName_XML(id);
        instance.close();
        for (DrugBank d : result.getDrugBanks()) {
            for (String s : ids) {
                if (s.equals(d.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findDrugBankByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindDrugBankByName_XML() {
        System.out.println("findDrugBankByName_XML");
        String id = "THRB_HUMAN";
        ProteinClient instance = new ProteinClient();
        String[] ids = {"DB02351", "DB06854", "DB06996", "DB06929"};
        int count = 0;
        int expResult = ids.length;
        DrugBanks result = instance.findDrugBankByName_XML(id);
        instance.close();
        for (DrugBank d : result.getDrugBanks()) {
            for (String s : ids) {
                if (s.equals(d.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findDrugBankAsTransportersByName_XML method, of class
     * ProteinClient.
     */
    @Test
    public void testFindDrugBankAsTransportersByName_XML() {
        System.out.println("findDrugBankAsTransportersByName_XML");
        String id = "LAT1_HUMAN";
        ProteinClient instance = new ProteinClient();
        String[] ids = {"DB00451", "DB01235", "DB01042", "DB00279"};
        int count = 0;
        int expResult = ids.length;
        DrugBanks result = instance.findDrugBankAsTransportersByName_XML(id);
        instance.close();
        for (DrugBank d : result.getDrugBanks()) {
            for (String s : ids) {
                if (s.equals(d.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findDrugBankAsCarriersByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindDrugBankAsCarriersByName_XML() {
        System.out.println("findDrugBankAsCarriersByName_XML");
        String id = "FABPL_HUMAN";
        ProteinClient instance = new ProteinClient();
        String[] ids = {"DB02659", "DB02074", "DB02216", "DB04224"};
        int count = 0;
        int expResult = ids.length;
        DrugBanks result = instance.findDrugBankAsCarriersByName_XML(id);
        instance.close();
        for (DrugBank d : result.getDrugBanks()) {
            for (String s : ids) {
                if (s.equals(d.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findRange_XML method, of class ProteinClient.
     */
    @Test
    public void testFindRange_XML() {
        System.out.println("findRange_XML");
        String from = "1";
        String to = "10";
        ProteinClient instance = new ProteinClient();
        int expResult = 10;
        Proteins result = instance.findRange_XML(from, to);
        instance.close();
        assertEquals(expResult, result.getProteins().size());
    }

    /**
     * Test of findGeneInfoByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindGeneInfoByName_XML() {
        System.out.println("findGeneInfoByName_XML");
        String id = "040R_%";
        long[] ids = {2947819, 4156350};
        ProteinClient instance = new ProteinClient();
        GeneInfoes result = instance.findGeneInfoByName_XML(id);
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
     * Test of findByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindByName_XML() {
        System.out.println("findByName_XML");
        String id = "040R_%";
        String[] ids = {"Q6GZT6", "Q197C0"};
        int count = 0;
        int expResult = ids.length;
        ProteinClient instance = new ProteinClient();
        Proteins result = instance.findByName_XML(id);
        instance.close();
        for (Protein d : result.getProteins()) {
            for (String s : ids) {
                if (s.equals(d.getProteinFirstAccessionNumber())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findPirsfByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindPirsfByName_XML() {
        System.out.println("findPirsfByName_XML");
        String id = "ILVB_ARATH";
        String[] ids = {"PIRSF500108", "PIRSF001370"};
        int count = 0;
        int expResult = ids.length;
        ProteinClient instance = new ProteinClient();
        Pirsfs result = instance.findPirsfByName_XML(id);
        instance.close();
        for (Pirsf d : result.getPirsfs()) {
            for (String s : ids) {
                if (s.equals(d.getpIRSFnumber())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }

    /**
     * Test of findByAccession_XML method, of class ProteinClient.
     */
    @Test
    public void testFindByAccession_XML() {
        System.out.println("findByAccession_XML");
        String id = "Q197A%25";
        String[] ids = {"057L_IIV3", "VF391_IIV3", "054L_IIV3", "053L_IIV3"};
        int count = 0;
        int expResult = ids.length;
        ProteinClient instance = new ProteinClient();
        Proteins result = instance.findByAccession_XML(id);
        instance.close();
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
     * Test of findAllDrugBankByName_XML method, of class ProteinClient.
     */
    @Test
    public void testFindAllDrugBankByName_XML() {
        System.out.println("findAllDrugBankByName_XML");
        String id = "CP17A_HUMAN";
        String[] ids = {"DB00396", "DB05812", "DB00396", "DB04630"};
        int count = 0;
        int expResult = ids.length;
        ProteinClient instance = new ProteinClient();
        DrugBanks result = instance.findAllDrugBankByName_XML(id);
        instance.close();
        for (DrugBank d : result.getDrugBanks()) {
            for (String s : ids) {
                if (s.equals(d.getId())) {
                    count++;
                    break;
                }
            }
        }
        assertEquals(expResult, count);
    }
}
