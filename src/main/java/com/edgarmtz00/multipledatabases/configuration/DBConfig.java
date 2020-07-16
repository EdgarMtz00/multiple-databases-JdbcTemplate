package com.edgarmtz00.multipledatabases.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration

public class DBConfig {
    @Primary
    @Bean("datasourcePersona")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource personaDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean("jdbctemplatePersona")
    public JdbcTemplate createPersonaJdbcTemplate(@Autowired @Qualifier("datasourcePersona") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "datasourceOficina")
    @ConfigurationProperties(prefix = "oficina.datasource")
    public DataSource oficinaDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbctemplateOficina")
    public JdbcTemplate createOficinaJdbcTemplate(@Autowired @Qualifier("datasourceOficina") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
