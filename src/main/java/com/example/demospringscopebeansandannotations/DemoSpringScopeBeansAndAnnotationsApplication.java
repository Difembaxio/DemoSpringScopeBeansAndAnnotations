package com.example.demospringscopebeansandannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoSpringScopeBeansAndAnnotationsApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(
        DemoSpringScopeBeansAndAnnotationsApplication.class, args);
    context.start();
    System.out.println("---------------------------------------");
    User user = context.getBean(User.class);
    user.userDetails();
    System.out.println("---------------------------------------");
    context.close();

    /*
    ServiceA serviceA = context.getBean(ServiceA.class);
    ServiceB serviceB = context.getBean(ServiceB.class);
    serviceA.setAnnoSingleton(new AnnoSingleton());
    serviceA.setAnnoPrototype(new AnnoPrototype());
    serviceA.setJavaSingleton(new JavaSingleton());
    serviceA.setJavaPrototype(new JavaPrototype());

    serviceB.setAnnoSingleton(new AnnoSingleton());
    serviceB.setAnnoPrototype(new AnnoPrototype());
    serviceB.setJavaSingleton(new JavaSingleton());
    serviceB.setJavaPrototype(new JavaPrototype());

    */
  }
}
