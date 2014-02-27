/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBanks;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.protein.entities.Protein;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsfs;

/**
 * Jersey REST client generated for REST resource:ProteinFacadeREST
 * [protein]<br>
 * USAGE:
 * <pre>
 *        ProteinClient client = new ProteinClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class ProteinClient extends AbstractClientFacade {

    public ProteinClient() {
        super("protein");
    }

    public ProteinClient(String BASE_URI) {
        super("protein", BASE_URI);
    }

    public DrugBanks findDrugBankAsEnzymeByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/drugbankasenzyme", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public GeneInfoes findGeneInfo_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public DrugBanks findDrugBank_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/drugbank", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public DrugBanks findDrugBankByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/drugbank", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public DrugBanks findAllDrugBank_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/alldrugbank", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public DrugBanks findDrugBankAsTransportersByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/drugbankastransporters", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public DrugBanks findDrugBankAsCarriersByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/drugbankascarriers", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public Pirsfs findPirsf_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/pirsf", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Pirsfs.class);
    }

    public Proteins findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public GeneInfoes findGeneInfoByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public DrugBanks findDrugBankAsTransporters_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/drugbankastransporters", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public Proteins findByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Pirsfs findPirsfByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/pirsf", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Pirsfs.class);
    }

    public DrugBanks findDrugBankAsEnzyme_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/drugbankasenzyme", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public Proteins findByAccession_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("accession/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public DrugBanks findAllDrugBankByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}/alldrugbank", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public Protein find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Protein.class);
    }

    public DrugBanks findDrugBankAsCarriers_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/drugbankascarriers", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public void close() {
        client.close();
    }

}
