package com.parcial.web.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.web.dto.CelularDTO;
import com.parcial.web.services.CelularService;

@RestController
@CrossOrigin
@RequestMapping("/parcial/celulares")
public class CelularController {
    CelularService celularService;

    public CelularController(CelularService celularService) {
        this.celularService = celularService;
    }

    // GET CELULAR /get/{id}
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO getCelular(@PathVariable Long id) {
        return celularService.getCelular(id);
    }

    // GET ALL CELULARES /get
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CelularDTO> getAllCelulares() {
        return celularService.getAllCelulares();
    }

    // CREATE CELULAR /post
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO createCelular(@RequestBody CelularDTO celularDTO) {
        return celularService.createCelular(celularDTO);
    }

    // UPDATE CELULAR /put
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CelularDTO updateCelular(@RequestBody CelularDTO celularDTO) {
        return celularService.updateCelular(celularDTO);
    }

    // DELETE CELULAR /delete/{id}
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCelular(@PathVariable Long id) {
        celularService.deleteCelular(id);
    }
}
