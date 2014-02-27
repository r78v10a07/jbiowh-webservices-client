/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.taxonomy.entities.Taxonomies;
import org.jbiowhpersistence.datasets.taxonomy.entities.Taxonomy;

/**
 * Jersey REST client generated for REST resource:TaxonomyFacadeREST
 * [taxonomy]<br>
 * USAGE:
 * <pre>
 *        TaxonomyClient client = new TaxonomyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class TaxonomyClient extends AbstractClientFacade {

    public TaxonomyClient() {
        super("taxonomy");
    }

    public TaxonomyClient(String BASE_URI) {
        super("taxonomy", BASE_URI);
    }

    public GeneInfoes findGeneInfoByTaxId_XML(String taxid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("taxid/{0}/geneinfo", new Object[]{taxid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public Taxonomy findByTaxId_XML(String taxid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("taxid/{0}", new Object[]{taxid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Taxonomy.class);
    }

    public Proteins findProteinById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public GeneInfoes findGeneInfoById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public Taxonomies findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Taxonomies.class);
    }

    public Taxonomy find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Taxonomy.class);
    }

    public Proteins findProteinByTaxId_XML(String taxid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("taxid/{0}/protein", new Object[]{taxid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public void close() {
        client.close();
    }

}
