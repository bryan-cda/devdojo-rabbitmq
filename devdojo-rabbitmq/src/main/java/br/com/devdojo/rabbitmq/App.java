package br.com.devdojo.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

import javax.annotation.PostConstruct;

import static java.util.TimeZone.getTimeZone;
import static java.util.TimeZone.setDefault;

@EnableRetry
@SpringBootApplication
public class App {
    public static final String UTC = "UTC";
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @PostConstruct
    void init(){
        setDefault(getTimeZone(UTC));
    }

}