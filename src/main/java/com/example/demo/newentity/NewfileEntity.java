package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
@Id
@GeneratedValue(strategy=Generation)
private Long id;
@NotBlank(message = "should not contain spaces")
private String name;
@NotBlank(message = "No blank allowed")
@Email(message = "Invalid Format")
private String email;
}