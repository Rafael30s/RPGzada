package br.com.newone.configs;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnetionConfig {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/rpgzada";
    private static final String USER = "root";
    private static final String PASSWORD = "bandtec";
    private static JdbcTemplate jdbcTemplate;


    public static JdbcTemplate getConnection() {
        if (jdbcTemplate == null) {
            BasicDataSource dataSource = new BasicDataSource();

            dataSource.setDriverClassName(DRIVER);
            dataSource.setUrl(URL);

            dataSource.setUsername(USER);
            dataSource.setPassword(PASSWORD);

            jdbcTemplate = new JdbcTemplate(dataSource);
        }
        return jdbcTemplate;
    }


}
