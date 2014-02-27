/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.protein.entities.Proteins;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsf;
import org.jbiowhpersistence.datasets.protgroup.pirsf.entities.Pirsfs;

/**
 * Jersey REST client generated for REST resource:PirsfFacadeREST [pirsf]<br>
 * USAGE:
 * <pre>
 *        PirsfClient client = new PirsfClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author roberto
 */
public class PirsfClient extends AbstractClientFacade {

    public PirsfClient() {
        super("pirsf");
    }

    public PirsfClient(String BASE_URI) {
        super("pirsf", BASE_URI);
    }

    public Proteins findProteinByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("pirsfnumber/{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Pirsfs findByName_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("pirsfnumber/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Pirsfs.class);
    }

    public Proteins findProtein_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/protein", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Proteins.class);
    }

    public Pirsfs findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Pirsfs.class);
    }

    public Pirsf find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Pirsf.class);
    }

    public void close() {
        client.close();
    }

}
