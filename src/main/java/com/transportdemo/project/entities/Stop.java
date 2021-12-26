package com.transportdemo.project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stop {
    private Location station;
    @JsonFormat(pattern = "hh:mm:ss")
    private Date arrival;
    @JsonFormat(pattern = "hh:mm:ss")
    private Date departure;

    private Date delay;
    private Integer platform;
    private Prognosis prognosis;

}
