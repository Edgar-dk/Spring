//package com.sias.Affairs.Config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * @author shkstart
// * @create 2022-01-16 15:48
// */
//
//
///*
//* 配置类的方式去代替XML
//* */
//@Configuration//配置类的标志
//@ComponentScan(basePackages = "com.sias")//对哪一个包下扫描
//@EnableTransactionManagement//开启事务
//public class TxConfig {
//
//
//    //创建数据库连接池的链接方式
//    @Bean
//    public DruidDataSource getDruidDataSource(){
//        DruidDataSource dataSource=new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/root");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//
////    JdbcTemplate对象的配置
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
//        JdbcTemplate jdbcTemplate=new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//
//
//    @Bean
//    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
//        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }
//
//
//}
