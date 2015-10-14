package dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ImportResource("classpath:dubbo-consumer-beans.xml")
@PropertySources(@PropertySource({ "classpath:application.properties" }))
@EnableConfigurationProperties
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }

}
