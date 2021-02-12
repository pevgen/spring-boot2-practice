package ml.pevgen.springboot2practice.starterexample1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="example")
@Data
public class SimplestProperties {
    private String name = "defaultName";
}
