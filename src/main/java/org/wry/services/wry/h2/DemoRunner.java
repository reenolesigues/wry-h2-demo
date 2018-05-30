package org.wry.services.wry.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DemoRunner 
{
    public static void main( String[] args ) {
    	SpringApplication springApplication = new SpringApplication(DemoRunner.class);
    	springApplication.addListeners(new ApplicationPidFileWriter("app.pid"));
    	springApplication.run(args);
    }
    
}
