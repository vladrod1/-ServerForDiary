package org.example.diaryserverspringboot.Configuration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import javax.sql.DataSource;
import java.util.Properties;

//Класс конфигурации сервера
@org.springframework.context.annotation.Configuration
@EnableWebMvc
@ComponentScan("org.example.diaryserverspringboot")
@EnableTransactionManagement
public class Configuration {
    private static final String URL = "jdbc:postgresql://localhost:5432/school";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "161534";

    //Бин для подключения к базе данных Postgresql
    @Bean
    public DataSource dataSource(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try{
            comboPooledDataSource.setDriverClass("org.postgresql.Driver");
            comboPooledDataSource.setJdbcUrl(URL);
            comboPooledDataSource.setUser(LOGIN);
            comboPooledDataSource.setPassword(PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
        }
        return comboPooledDataSource;
    }
    //Бин для создания SessionFactory
    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("org.example.diaryserverspringboot.entity");

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.show_sql", "true");

        sessionFactoryBean.setHibernateProperties(properties);

        return sessionFactoryBean;
    }

}
