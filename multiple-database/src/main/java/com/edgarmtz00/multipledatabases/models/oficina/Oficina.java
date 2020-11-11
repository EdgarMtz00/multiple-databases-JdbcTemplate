package com.edgarmtz00.multipledatabases.models.oficina;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Oficina {
    private String nombre;
    private Long id;

    public Oficina(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }
}
