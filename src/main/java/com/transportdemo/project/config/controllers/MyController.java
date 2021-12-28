package com.transportdemo.project.config.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.transportdemo.project.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping(value = "/locations")
    public ResponseEntity<List<String>> getAllLocations(@RequestParam(value = "input") String input)
            throws JsonProcessingException {
        List<String> list = this.myService.retrieveAllLocationNames(input);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping(value = "/getDuration")
    public ResponseEntity<Integer> getTimeInSeconds(@RequestParam(value = "from") String from,
                                                    @RequestParam(value = "to") String to){
        Integer shortestRouteTime= null;
        try {
            shortestRouteTime = this.myService.getTime(from, to);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(shortestRouteTime, HttpStatus.OK);
    }
}
