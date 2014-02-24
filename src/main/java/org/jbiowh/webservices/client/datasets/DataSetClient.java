package org.jbiowh.webservices.client.datasets;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import org.jbiowhpersistence.datasets.dataset.entities.DataSet;
import org.jbiowhpersistence.datasets.dataset.entities.DataSets;

/**
 * Jersey REST client generated for REST resource:DataSetFacadeREST
 * [dataset]<br>
 * USAGE:
 * <pre>
 * DataSetClient client = new DataSetClient();
 * Object response = client.XXX(...);
 * // do whatever with response
 * client.close();
 * </pre>
 *
 * @author roberto
 */
public class DataSetClient extends AbstractClientFacade {

    public DataSetClient() {
        super("dataset");
    }

    public DataSetClient(String BASE_URI) {
        super("dataset", BASE_URI);
    }

    public DataSets findNotStatus_XML(String status) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("nostatus/{0}", new Object[]{status}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSets findName_XML(String name) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("name/{0}", new Object[]{name}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSets findStatus_XML(String status) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("status/{0}", new Object[]{status}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSets findAll_XML() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSets findNotName_XML(String name) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("noname/{0}", new Object[]{name}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSets findRange_XML(String from, String to) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSets.class);
    }

    public DataSet find_XML(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(DataSet.class);
    }

    public void close() {
        client.close();
    }

}
