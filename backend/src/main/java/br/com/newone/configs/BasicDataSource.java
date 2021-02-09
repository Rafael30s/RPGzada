package br.com.newone.configs;

public class BasicDataSource {
    BasicDataSource dataSource = new BasicDataSource();

    public BasicDataSource getDataSource() {
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        // exemplo para MySql: "com.mysql.cj.jdbc.Driver"
//        dataSource.setUrl("jdbc:sqlserver://meubanco.database.windows.net/meubanco");
//        // exemplo para MySql: "jdbc:mysql://localhost:3306/meubanco"
//        dataSource.setUsername("meulogin");
//        dataSource.setPassword("minhasenha");
      return dataSource;
    }



}
