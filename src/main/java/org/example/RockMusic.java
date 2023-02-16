package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bring Me The Horizon - Sleepwalking";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization");
    }

    //For "prototype" beans destroy method is not called
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destruction");
    }
}
