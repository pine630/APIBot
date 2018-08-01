package com.apibot.api;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CustomerRequest {

    @NotEmpty
    @Size(min=1, max=50)
    @Getter
    @Setter
    private String lastName;

    @NotEmpty
    @Size(min=1, max=50)
    @Getter
    @Setter
    private String firstName;
}
