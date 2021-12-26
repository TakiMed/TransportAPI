package com.transportdemo.project.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Section {

    private Journey journey;
    private Double walk;
    private Stop departure;
    private Stop arrival;

}
