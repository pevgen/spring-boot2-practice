package ml.pevgen.springboot2practice.starterexample1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SimplestProperties.class)
@Slf4j
public class SimplestAutoConfiguration {

    private final SimplestProperties simplestProperties;

    public SimplestAutoConfiguration(SimplestProperties simplestProperties) {
        this.simplestProperties = simplestProperties;
    }

    @Bean
    public String stringBean() {
        log.info("Created 'String' bean with property 'def name': [{}]", simplestProperties.getName());
        return "test prop starter : " + simplestProperties.getName();
    }
}
