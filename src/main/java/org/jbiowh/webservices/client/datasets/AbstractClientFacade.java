package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * This class is an Abstract Client Facade 
 *
 * $Author$ $LastChangedDate$ $LastChangedRevision$
 *
 * @since Feb 24, 2014
 */
public abstract class AbstractClientFacade {

    protected WebTarget webTarget;
    protected Client client;
    protected String BASE_URI = "http://net.icgeb.org/jbiowh-webservices/webservices";

    public AbstractClientFacade(String path) {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public AbstractClientFacade(String path, String BASE_URI) {
        this.BASE_URI = BASE_URI;
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public <T> T findBySearch_XML(Class<T> responseType, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("search/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public Integer count_XML() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("count");
        return resource.request("text/plain").get(Integer.class);
    }

    public WebTarget getWebTarget() {
        return webTarget;
    }

    public void setWebTarget(WebTarget webTarget) {
        this.webTarget = webTarget;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getBASE_URI() {
        return BASE_URI;
    }

    public void setBASE_URI(String BASE_URI) {
        this.BASE_URI = BASE_URI;
    }

}
