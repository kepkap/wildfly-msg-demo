package pro.wildflymsg.demo;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;


/**
 * Created by kepkap
 * on 26/04/2017.
 */
public class App {

    public static void main(final String... args) throws Exception {
        // Instantiate the container
        final Container container = new Container();
        final JAXRSArchive deployment = ShrinkWrap.create( JAXRSArchive.class );
        deployment.addResource( MyApplication.class );
        deployment.addResource( MyRest.class );
        deployment.addResource( CORSFilter.class );
        container.start();
        container.deploy(deployment);
    }
}
