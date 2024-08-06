package com.kosta;

import com.config.ProjectConfig;
import com.config.ProjectConfig2;
import com.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

/*        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());*/

/*        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());*/

/*        Parrot p = context.getBean("사랑", Parrot.class);
        System.out.println(p.getName());*/

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}