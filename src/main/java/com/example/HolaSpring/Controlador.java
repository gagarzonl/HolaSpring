/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador {
    
    @GetMapping("/")
    public String mensaje(){
        System.out.println("Mensaje exitoso");
        return"Hola, esta es una prueba con Sprint Boot con G35";
    }
    
}
