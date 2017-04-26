package pro.wildflymsg.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

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