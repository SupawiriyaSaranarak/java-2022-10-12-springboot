package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main (String[] data){
        System.out.println("Java Spring Boot");
        ApplicationContext context; // box that keep bean
        context = SpringApplication.run(SetUp.class);
        String[] all = context.getBeanDefinitionNames();
        for (int i = 0; i < all.length; i++) {
            System.out.println("bean: "+ all[i]);
        }
    }
}

@SpringBootApplication // use to create bean
class SetUp {
//    @Bean("captain")
//    Player create1() {
//        return new Player();
//    }
}
//class Player {
//    String name;
//    int number;
//}

@RestController
class Sample {
    @RequestMapping("/show-sample") 
    double showSample () {
        return 123.4567;
    }
    
    @GetMapping("/show-detail")
    String showDetail () {
        return "Welcome to Spring Boot";
    }
}