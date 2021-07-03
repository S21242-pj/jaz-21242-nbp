package com.example.demo.model;

import com.example.demo.config.RestTemplateConfig;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

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

    public DatabaseEntrace(String currencyName, Integer firstDate, Integer lastDate, double avgCurrency) {
        this.currencyName = currencyName;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.avgCurrency = avgCurrency;
        this.searchDates = RestTemplateConfig.getDate();
        this.searchTime = RestTemplateConfig.getTime();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Integer getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Integer firstDate) {
        this.firstDate = firstDate;
    }

    public Integer getLastDate() {
        return lastDate;
    }

    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }

    public Double getAvgCurrency() {
        return avgCurrency;
    }

    public void setAvgCurrency(Double avgCurrency) {
        this.avgCurrency = avgCurrency;
    }

    public LocalDate getSearchDates() {
        return searchDates;
    }

    public void setSearchDates(LocalDate searchDates) {
        this.searchDates = searchDates;
    }

    public LocalTime getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(LocalTime searchTime) {
        this.searchTime = searchTime;
    }

   /* public String createDate() {
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("yyyy.mm.dd HH");
        return df.format(d);
    }*/

}
