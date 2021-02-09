package br.com.newone.configs;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnetionConfig {


    private static JdbcTemplate jdbcTemplate;

    private ConnetionConfig() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // exemplo para MySql: "com.mysql.cj.jdbc.Driver"
        dataSource.setUrl("jdbc:mysql://localhost:3306/RPGzada");
        // exemplo para MySql: "jdbc:mysql://localhost:3306/meubanco"
        dataSource.setUsername("root");
        dataSource.setPassword("bandtec");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }




}
