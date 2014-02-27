/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.disease.omim.entities.OMIM;
import org.jbiowhpersistence.datasets.disease.omim.entities.OMIMs;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;

/**
 * Jersey REST client generated for REST resource:OMIMFacadeREST [omim]<br>
 * USAGE:
 * <pre>
 *        OMIMClient client = new OMIMClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class OMIMClient extends AbstractClientFacade {

    public OMIMClient() {
        super("omim");
    }

    public OMIMClient(String BASE_URI) {
        super("omim", BASE_URI);
    }

    public GeneInfoes findGeneInfo_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public OMIM findById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(OMIM.class);
    }

    public GeneInfoes findGeneInfoById_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("id/{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public OMIMs findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(OMIMs.class);
    }

    public OMIM find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(OMIM.class);
    }

    public void close() {
        client.close();
    }

}
