package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("RemoteWebDriver")
    @DefaultValue("true")
    Boolean getRemoteWebDriver();

    @Key("remoteUrl")
    String getRemoteUrl();

}
