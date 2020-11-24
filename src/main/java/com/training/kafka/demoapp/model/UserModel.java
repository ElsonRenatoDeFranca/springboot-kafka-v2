package com.training.kafka.demoapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserModel {
    private String name;
    private String dept;
    private Long salary;
}
