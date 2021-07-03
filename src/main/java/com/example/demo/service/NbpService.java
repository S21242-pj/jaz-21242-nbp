package com.example.demo.service;

import com.example.demo.repository.NbpRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

}
