package com.edgarmtz00.multipledatabases.models.persona;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {
    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException{
        return new Persona(rs.getString("nombre"), rs.getInt("edad"), rs.getLong("id"));
    }
}
