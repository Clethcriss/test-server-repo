package com.codecool.bbbt.huntapped.backend.controller;

import com.codecool.bbbt.huntapped.backend.model.Brewery;
import com.codecool.bbbt.huntapped.backend.repository.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/brewery")
public class BreweryController {

    @Autowired
    private BreweryRepository breweryRepository;

    @GetMapping("/{id}")
    public Brewery getBrewery(@PathVariable("id") Long id) {
        return breweryRepository.findBreweryById(id);
    }
}
