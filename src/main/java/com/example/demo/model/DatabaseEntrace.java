package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@Entity
public class DatabaseEntrace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Number ID", required = true, dataType = "Long")
    private Long Id;

    @ApiModelProperty(notes = "Currency name", required = true, dataType = "String")
    private String currencyName;

    @ApiModelProperty(notes = "First search date", required = true, dataType = "Integer")
    private Integer firstDate;

    @ApiModelProperty(notes = "Last search date", required = true, dataType = "Integer")
    private Integer lastDate;

    @ApiModelProperty(notes = "Average prise from searched date range", required = true, dataType = "Double")
    private Double avgCurrency;

    @ApiModelProperty(notes = "Search dates")
    private LocalDate searchDates;

    @ApiModelProperty(notes = "Search time")
    private LocalTime searchTime;

    public DatabaseEntrace() {
    }



    public String createDate() {
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("yyyy.mm.dd HH");
        return df.format(d);
    }


}
