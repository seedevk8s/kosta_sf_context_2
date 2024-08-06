package com.config;

import com.kosta.Parrot;
import org.springframework.context.annotation.Bean;

public class ProjectConfig2 {

    @Bean(name = "왕관")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("왕관앵무");
        return p;
    }

    @Bean(value = "사랑")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("사랑앵무");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("러브버드");
        return p;
    }

}
