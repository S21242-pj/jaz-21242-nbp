package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Database {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "id number", required = true, dataType = "Long")
    private Long Id;

    @ApiModelProperty(notes = "currency name", required = true, dataType = "String")
    private String currency;




}
