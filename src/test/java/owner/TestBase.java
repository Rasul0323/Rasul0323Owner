package owner;

import com.codeborne.selenide.Configuration;
import owner.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void SettingRunParameters() {

        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();

        if (config.getRemoteWebDriver()) {
            Configuration.remote = config.getRemoteUrl();
        }
    }
}
