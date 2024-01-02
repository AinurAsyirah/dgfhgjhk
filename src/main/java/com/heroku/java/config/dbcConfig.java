package com.heroku.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class dbcConfig {

    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/d5o47ut27ivedq");
        dataSource.setUsername("dwaqzftdrhbnrs");
        dataSource.setPassword("f4ddd08cfe661b77378cfbceeee2bd247c69c96b23113c32de63f42114f74fec");
        return dataSource;
    }

    public JdbcTemplate jdbc(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    
}
