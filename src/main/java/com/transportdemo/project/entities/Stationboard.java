package com.transportdemo.project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.transportdemo.project.enums.Transportation;
import com.transportdemo.project.enums.Type;
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
public class Stationboard {

    private Location station;
    private String id;
    private List<Transportation> transportations;
    @JsonFormat(pattern = "YYYY-MM-DD hh:mm")
    private Date datetime;
    private Type type;

}
