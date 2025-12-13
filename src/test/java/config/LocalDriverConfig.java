package config;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${deviceHost}.properties",
})
public interface LocalDriverConfig extends Config {
    @Key("os_version")
    String osVersion();

    @Key("device")
    String device();
}
