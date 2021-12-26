package com.transportdemo.project.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import java.util.*;


@Service
public class MyService {
    private final RestTemplate restTemplate;

    public MyService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
// https://transport.opendata.ch/v1/locations?query=all

    public List<String> retrieveAllLocationNames(String input) throws JsonProcessingException {
        List<String> locationList = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        input = input==null ? "" : input;
        String url = "https://transport.opendata.ch/v1/locations?query=" + input;
        String json = restTemplate.getForEntity(url, String.class).getBody();
        JsonNode jsonNode = mapper.readTree(json).get("stations");
        Iterator<JsonNode> iterator = jsonNode.iterator();
        while (iterator.hasNext()){
            locationList.add(iterator.next().get("name").textValue());
        }
        return locationList;
    }

    public  Integer getTime(String from, String to) throws IOException {
        String url = "http://transport.opendata.ch/v1/connections?from="+from+"&to="+to;
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder str = new StringBuilder(); //mutable
        String json = restTemplate.getForEntity(url, String.class).getBody();
        JsonNode jsonNode = mapper.readTree(json).get("connections");
        Iterator<JsonNode> iterator = jsonNode.iterator();
        Integer min = Integer.MAX_VALUE;
        while (iterator.hasNext()){
            str.append(iterator.next().get("duration").textValue());
            min = Math.min(min, retrieveTimeFromDurationString(str));
            str.delete(0,11);
        }
        return min;
    }




    public Integer retrieveTimeFromDurationString(StringBuilder str) {
        Integer time = Integer.parseInt(str.substring(0,2))*86400 // days
                + Integer.parseInt(str.substring(3,5))*3600  // hours
                + Integer.parseInt(str.substring(6,8))*60  // minuts
                + Integer.parseInt(str.substring(9,11));
        return time;
    }
}
