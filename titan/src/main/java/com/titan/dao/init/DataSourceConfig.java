package com.titan.dao.init;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


/**
 * @author syline on 2017/11/24
 * @version 1.0
 */
@Configuration
@MapperScan(basePackages = DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "mainSqlSessionFactory")
public class DataSourceConfig<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);
    static final String PACKAGE = "com.titan.**.mapper";
    static final String MAPPER_LOCATION = "classpath:mybatis/coin/*.xml";
    static final String CONFIG_LOCATION = "classpath:mybatis/mybatis-config.xml";
    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "mainDataSource")
    @ConfigurationProperties(prefix = "coin.datasource", ignoreUnknownFields = false)
    public DataSource mainDataSource() {
        LOGGER.info("init main coin datasource");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "mainCoin")
    public DataSourceTransactionManager coinTransactionManager() {
        LOGGER.info("init coin transaction");
        return new DataSourceTransactionManager(mainDataSource());
    }

    @Bean(name = "mainSqlSessionFactory")
    public SqlSessionFactory cashboxSqlSessionFactory(@Qualifier("mainDataSource") DataSource mainDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setConfigLocation(resolver.getResource(DataSourceConfig.CONFIG_LOCATION));
        sessionFactory.setDataSource(mainDataSource);
        sessionFactory.setMapperLocations(resolver.getResources(DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    @Bean(name = "cashboxSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(cashboxSqlSessionFactory(mainDataSource()));
        return template;
    }
}
