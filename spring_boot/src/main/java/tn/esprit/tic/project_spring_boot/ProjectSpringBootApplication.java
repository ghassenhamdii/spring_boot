package tn.esprit.tic.project_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class ProjectSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringBootApplication.class, args);
    }

}
