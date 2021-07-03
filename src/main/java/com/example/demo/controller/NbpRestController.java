package com.example.demo.controller;


import com.example.demo.service.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class NbpRestController {

    private final NbpService nbpService;

    public NbpRestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

//    @GetMapping("/GET")
//    public ResponseEntity

}
