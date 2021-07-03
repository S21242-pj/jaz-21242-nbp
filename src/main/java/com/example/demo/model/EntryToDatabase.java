package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
public class EntryToDatabase {

    @ApiModelProperty(notes = "Date + hours when avg price was taken", required = true, dataType = "String")
    private final String createDate = createDate();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Number ID", required = true, dataType = "Long")
    private Long Id;
    @ApiModelProperty(notes = "Currency name", required = true, dataType = "String")
    private String currency;
    @ApiModelProperty(notes = "Days number", required = true, dataType = "Integer")
    private Integer daysNumber;
    @ApiModelProperty(notes = "Average prise from number of days", required = true, dataType = "Double")
    private Double avgPrices;

    public EntryToDatabase() {
    }

    public EntryToDatabase(String currency, Integer daysNumber, Double avgPrices) {
        this.currency = currency;
        this.daysNumber = daysNumber;
        this.avgPrices = avgPrices;
    }

    public String createDate() {
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("yyyy.mm.dd HH");
        return df.format(d);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(Integer daysNumber) {
        this.daysNumber = daysNumber;
    }

    public Double getAvgPrices() {
        return avgPrices;
    }

    public void setAvgPrices(Double avgPrices) {
        this.avgPrices = avgPrices;
    }

    public String getCreateDate() {
        return createDate;
    }
}
