package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBank;
import org.jbiowhpersistence.datasets.drug.drugbank.entities.DrugBanks;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;

/**
 * Jersey REST client generated for REST resource:DrugBankFacadeREST
 * [drugbank]<br>
 * USAGE:
 * <pre>
 *        DrugBankClient client = new DrugBankClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class DrugBankClient extends AbstractClientFacade {

    public DrugBankClient() {
        super("drugbank");
    }

    public DrugBankClient(String BASE_URI) {
        super("drugbank", BASE_URI);
    }

    public Proteins findProteinAsCarriers_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/proteinascarriers", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findAllProtein_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/allprotein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinAsEnzyme_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/proteinasenzyme", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinAsTransportersById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/proteinastransporters", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public DrugBanks findById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public Proteins findProtein_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinAsEnzymeById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/proteinasenzyme", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findAllProteinById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/allprotein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinAsCarriersById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/proteinascarriers", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinAsTransporters_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/proteinastransporters", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Proteins findProteinById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public DrugBanks findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBanks.class);
    }

    public DrugBank find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DrugBank.class);
    }

    public void close() {
        client.close();
    }

}
