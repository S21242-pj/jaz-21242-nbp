package com.example.demo.controller;


import com.example.demo.service.NbpService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class NbpRestController {

    private final NbpService nbpService;

    public NbpRestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

 /*   @GetMapping("/waluty/{currencyName}")
    @ApiOperation(value = "getCurrency", notes = "Method return avgCurrency(model/DatabaseEntrace) and save data to db")
    // Przypomniajka : sprawdź pod koniec ROOT/RATE
    public ResponseEntity<Double> getCurrency(@PathVariable String currencyName,
                                              @RequestParam String firstDate,
                                              @RequestParam String lastDate){

    }*/


}
