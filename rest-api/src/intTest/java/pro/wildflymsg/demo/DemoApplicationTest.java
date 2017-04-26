package pro.wildflymsg.demo;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.wildfly.swarm.it.AbstractIntegrationTest;

/**
 * Created by kepkap
 * on 26/04/2017.
 */
@RunWith(Arquillian.class)

public class DemoApplicationTest extends AbstractIntegrationTest {

    @Drone
    WebDriver browser;

    @Test
    public void testIt() {
        browser.navigate().to("http://localhost:8080/");
        assertThat(browser.getPageSource()).contains("Howdy at ");
    }

    @Test
    public void testExceptionMapping() {
        browser.navigate().to("http://localhost:8080/bad");
        assertThat(browser.getPageSource()).contains("This is our exception page!");
    }

}