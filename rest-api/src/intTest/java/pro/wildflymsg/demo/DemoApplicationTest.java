package pro.wildflymsg.demo;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by kepkap
 * on 26/04/2017.
 */
@RunWith(Arquillian.class)

public class DemoApplicationTest {

    @Drone
    WebDriver browser;


    @Test
    public void testHelloWorld() {
        browser.navigate().to("http://localhost:8080/helloWorld");
        assertThat(browser.getPageSource()).contains("Hello World!");
    }

}