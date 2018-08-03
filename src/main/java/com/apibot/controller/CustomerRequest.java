package com.apibot.controller;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CustomerRequest {

    @Size(min = 1, max = 20)
    @Getter
    @Setter
    private String lastName;

    @Size(min = 1, max = 20)
    @Getter
    @Setter
    private String firstName;
}
