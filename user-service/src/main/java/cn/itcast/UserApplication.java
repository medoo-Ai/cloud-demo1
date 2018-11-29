package cn.itcast;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @auther SyntacticSugar
 * @data 2018/11/28 0028下午 10:18
 *@EnableDiscoveryClient  进行服务发现
 *       在 user-service端注册 eureka 服务客户端、并配置依赖
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.itcast.mapper")
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
