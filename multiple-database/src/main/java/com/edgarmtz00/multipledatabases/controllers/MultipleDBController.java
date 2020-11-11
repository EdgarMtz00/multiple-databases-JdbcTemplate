package com.edgarmtz00.multipledatabases.controllers;

import com.edgarmtz00.multipledatabases.models.oficina.Oficina;
import com.edgarmtz00.multipledatabases.models.persona.Persona;
import com.edgarmtz00.multipledatabases.repositories.OficinaRepository;
import com.edgarmtz00.multipledatabases.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MultipleDBController {
    @Autowired
    private OficinaRepository oficinaRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/persona/oficina")
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        List<Persona> personas = personaRepository.getAll();
        List<Oficina> oficinas = oficinaRepository.getAll();

        for ( Persona persona:personas) {
            sb.append(persona.getNombre()).append(", ").append(persona.getEdad()).append("\n");
        }
        for ( Oficina oficina:oficinas) {
            sb.append(oficina.getNombre()).append(", ").append(oficina.getId()).append("\n");
        }
        return sb.toString();
    }
}
