package com.transportdemo.project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.transportdemo.project.enums.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Connection {

    private Location from;
    private Location to;
    @JsonFormat(pattern = "dd'd'hh:mm:ss")
    private Date duration;
    private Service service;
    private List<Product> products;
    private Integer capacity1st;
    private Integer capacity2nd;
    private List<Section> sections;



}
