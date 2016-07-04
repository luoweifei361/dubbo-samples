package dubbo.provider.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动入口
 * 
 * @author luoweifei
 *
 */
@ImportResource("classpath:dubbo-provider-beans.xml")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(dubbo.provider.demo.ProviderApp.class, args);
    }

}
