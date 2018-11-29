package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @auther SyntacticSugar
 * @data 2018/11/28 0028下午 11:00
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    /**
     * 注入  springCloud 的DiscoveryClient
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("{id}")
    public User get(@PathVariable("id")Long id){

        // 从eureka 中取出一个服务
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instances.get(0);
        //  从服务中 获取 port 以及host 组成url 、 进行查询
        String url = String.format("http://%s:%s/user/%s", serviceInstance.getHost(), serviceInstance.getPort(), id);
//        String url="http://localhost:8081/user/"+id;
//        return  restTemplate.getForObject(url, User.class, id);
        return   restTemplate.getForObject(url,User.class );
    }
}
