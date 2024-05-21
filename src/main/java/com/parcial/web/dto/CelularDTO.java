package com.parcial.web.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

public class CelularDTO {

    private Long id;
    private String marca;
    private String serial;
    private LocalDate fechaCompra;
    private int anoLanzamiento;
    private double precio;
    private String sistemaOperativo;
    private String gama;

}
