package com.edgarmtz00.multipledatabases.repositories;

import com.edgarmtz00.multipledatabases.models.oficina.Oficina;
import com.edgarmtz00.multipledatabases.models.oficina.OficinaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OficinaRepository {
    @Autowired
    @Qualifier("jdbctemplateOficina")
    private JdbcTemplate jdbcTemplate;

    public List<Oficina> getAll() {
        return jdbcTemplate.query("select * from Oficina", new OficinaMapper());
    }
}
