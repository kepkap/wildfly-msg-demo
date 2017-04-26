package pro.wildflymsg.demo;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import pro.wildflymsg.demo.rest.HelloWorldController;


/**
 * Created by kepkap
 * on 26/04/2017.
 */
public class App {

    public static void main(final String... args) throws Exception {

        Swarm swarm = new Swarm();

        swarm.start();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addResource(DemoApplication.class);
        deployment.addResource(HelloWorldController.class);

        swarm.deploy(deployment);
    }
}
