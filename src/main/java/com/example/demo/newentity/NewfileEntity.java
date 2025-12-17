package com.example.demo.newentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class NewfileEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotBlank(message = "should not contain spaces")
private String name;
@NotBlank(message = "No blank allowed")
@Email(message = "Invalid Format")
private String email;
}