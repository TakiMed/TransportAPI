package com.transportdemo.project;
import com.transportdemo.project.entities.Location;
import com.transportdemo.project.entities.Stations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoprojectApplication {
    final Logger log = LoggerFactory.getLogger(DemoprojectApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoprojectApplication.class, args);
    }


/*
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Stations stations = restTemplate.getForObject(
                    "http://transport.opendata.ch/v1/locations?query=Basel",
                    Stations.class);
            log.info(stations.toString());
        };
    }*/
}