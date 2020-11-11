package com.edgarmtz00.multipledatabases.models.oficina;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OficinaMapper implements RowMapper<Oficina> {
    @Override
    public Oficina mapRow(ResultSet rs, int RowNum) throws SQLException{
        return new Oficina(rs.getString("nombre"), rs.getLong("id"));
    }
}
