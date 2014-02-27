package org.jbiowh.webservices.client.datasets;

import org.jbiowhpersistence.datasets.dataset.entities.DataSets;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This Class is the DataSetClient Test
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate:$ $LastChangedRevision:$
 *
 * @since Feb 24, 2014
 */
public class DataSetClientTest {

    public DataSetClientTest() {
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
     * Test of findAll_XML method, of class DataSetClient.
     */
    @Test
    public void testFindAll_XML() {
        System.out.println("findAll_XML");
        DataSetClient instance = new DataSetClient();
        DataSets result = instance.findAll_XML();
        instance.close();
    }
}
