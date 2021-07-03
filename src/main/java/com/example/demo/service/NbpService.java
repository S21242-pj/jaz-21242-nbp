package com.example.demo.service;

import com.example.demo.model.DatabaseEntrace;
import com.example.demo.repository.NbpRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Currency;

@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public DatabaseEntrace saveDataRangeAndCurrency(String currencyName, Integer firstDate, Integer lastDate, double avgCurrency){
        DatabaseEntrace databaseEntrace = new DatabaseEntrace(currencyName, firstDate, lastDate, avgCurrency);
        return curRep.save
    }


}
