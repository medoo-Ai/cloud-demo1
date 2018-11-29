package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @auther SyntacticSugar
 * @data 2018/11/28 0028下午 10:55
 *@EnableDiscoveryClient  进行服务发现
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
