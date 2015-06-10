package com.intellicode.openMarket.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.intellicode.openMarket.mapper")
@EnableTransactionManagement
public class DataSourceConfig {

	@Autowired
	private Environment env;

//	@Autowired
//	private DataSource datasource;
//
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;

	@Bean(name = "dataSource")
	public DataSource dataSource() throws Exception {

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.user"));
		dataSource.setPassword(env.getProperty("db.passwd"));
		dataSource.setMaxWait(Integer.valueOf(env.getProperty("db.maxWait")));
		dataSource.setMaxActive(Integer.valueOf(env.getProperty("db.maxActive")));
		dataSource.setMaxIdle(30);
		dataSource.setValidationQuery("select 1");
		dataSource.setTestWhileIdle(true);

		System.out.println("\n\ndatasource\n\n");

		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource datasource) throws Exception {
		System.out.println("\n\ntransactionManager\n\n");

		DataSourceTransactionManager source = new DataSourceTransactionManager(datasource);
		source.setRollbackOnCommitFailure(true);
		return source;
	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {
		System.out.println("\n\nsqlSession\n\n");

		SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		return sessionTemplate;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource datasource) throws Exception {
		System.out.println("\n\nsqlSessionFactory\n\n");

		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(datasource);
		sessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper*/*.xml"));
		return sessionFactory.getObject();
	}
}
