package com.transportdemo.project.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Journey {
    private String name;
    private String category;
    private String categoryCode;
    private Number number;
    private String operator;
    private Location to;
    private Stop passList;
    private Integer capacity1st;
    private Integer capacity2nd;
}
