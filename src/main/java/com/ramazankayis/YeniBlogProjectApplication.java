package com.ramazankayis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//security: inactive
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
public class YeniBlogProjectApplication {

    public static void main(String[] args) {

        //devtool active-passive
        System.setProperty("spring.devtools.restart.enabled","false");

        //JOptionPanel AWT active passsive
        System.setProperty("java.awt.headless", "false"); //Disables headless

        SpringApplication.run(YeniBlogProjectApplication.class, args);
    }

}
