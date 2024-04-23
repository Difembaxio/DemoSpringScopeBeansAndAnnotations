package com.example.DemoSpringScopeBeansAndAnnotations;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceA {
    private AnnoSingleton annoSingleton;
    private AnnoPrototype annoPrototype;
    private JavaSingleton javaSingleton;
    private JavaPrototype javaPrototype;

    public ServiceA() {
        log.info("Создание ServiceA");
    }

    @Autowired
    public void setAnnoSingleton(AnnoSingleton annoSingleton) {
        log.info("Внедрение annoSingleton в ServiceA ");
        this.annoSingleton = annoSingleton;
    }

    @Autowired
    public void setAnnoPrototype(AnnoPrototype annoPrototype) {
        log.info("Внедрение annoPrototype в ServiceA ");
        this.annoPrototype = annoPrototype;
    }

    @Autowired
    public void setJavaSingleton(JavaSingleton javaSingleton) {
        log.info("Внедрение javaSingleton в ServiceA ");
        this.javaSingleton = javaSingleton;
    }

    @Autowired
    public void setJavaPrototype(JavaPrototype javaPrototype) {
        log.info("Внедрение javaPrototype в ServiceA ");
        this.javaPrototype = javaPrototype;
    }

}
