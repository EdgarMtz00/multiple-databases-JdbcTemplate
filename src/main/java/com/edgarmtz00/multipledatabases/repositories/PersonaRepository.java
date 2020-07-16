package com.edgarmtz00.multipledatabases.repositories;

import com.edgarmtz00.multipledatabases.models.persona.Persona;
import com.edgarmtz00.multipledatabases.models.persona.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaRepository {
    @Autowired
    @Qualifier("jdbctemplatePersona")
    private JdbcTemplate jdbcTemplate;

    public List<Persona> getAll() {
        return jdbcTemplate.query("select * from Persona", new PersonaMapper());
    }
}
