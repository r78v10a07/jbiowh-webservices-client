/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.gene.gene.entities.GeneInfoes;
import org.jbiowhpersistence.datasets.gene.genome.entities.GenePTT;
import org.jbiowhpersistence.datasets.gene.genome.entities.GenePTTs;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;

/**
 * Jersey REST client generated for REST resource:GenePTTFacadeREST
 * [geneptt]<br>
 * USAGE:
 * <pre>
 *        GenePTTClient client = new GenePTTClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class GenePTTClient extends AbstractClientFacade {

    public GenePTTClient() {
        super("geneptt");
    }

    public GenePTTClient(String BASE_URI) {
        super("geneptt", BASE_URI);
    }

    public Proteins findProteinByPTTFileName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public GenePTTs findGenePTTByFileNameRange_XML(String id, String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}/{1}/{2}", new Object[]{id, from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GenePTTs.class);
    }

    public Proteins findProteinByFileNameRange_XML(String id, String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}/{1}/{2}/protein", new Object[]{id, from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public GeneInfoes findGeneByPTTFileName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}/geneinfo", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public GenePTTs findGenePTTByPTTFileName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GenePTTs.class);
    }

    public Proteins findProtein_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public GeneInfoes findGeneByFileNameRange_XML(String id, String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("chromosome/{0}/{1}/{2}/geneinfo", new Object[]{id, from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GeneInfoes.class);
    }

    public GenePTTs findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GenePTTs.class);
    }

    public GenePTT find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(GenePTT.class);
    }

    public void close() {
        client.close();
    }

}
