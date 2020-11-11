package com.edgarmtz00.multipledatabases.models.persona;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    private String nombre;
    private int edad;
    private Long id;

    public Persona(String nombre, int edad, Long id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Long getId() {
        return id;
    }
}
