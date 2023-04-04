package com.example.demo.conf;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.pool.ConnectionPoolConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import io.r2dbc.spi.Option;
import reactor.core.publisher.Mono;

@Configuration
@EnableR2dbcRepositories
public class R2DBCConfiguration {
    @Bean
    ConnectionFactory connectionFactory() {
    	
    	ConnectionFactory connectionFactory = ConnectionFactories.get(ConnectionFactoryOptions.builder()
//    	        .option(ConnectionFactoryOptions.SSL, true)
    	        .option(ConnectionFactoryOptions.DRIVER, "pool")
    	        .option(ConnectionFactoryOptions.PROTOCOL, "postgresql")
    	        .option(ConnectionFactoryOptions.HOST, "192.168.0.186")
    	        .option(ConnectionFactoryOptions.PORT, 5433)
    	        .option(ConnectionFactoryOptions.USER, "postgres")
    	        .option(ConnectionFactoryOptions.PASSWORD, "postgres0202!!")
    	        .option(ConnectionFactoryOptions.DATABASE, "test")
    	        .option(Option.<Integer>valueOf("initialSize"), 50)
    	        .option(Option.<Integer>valueOf("maxSize"), 2000)
    	        .option(Option.<Duration>valueOf("maxLifeTime"), Duration.ofMillis(0))
//    	        .option(Option.<String>valueOf("validationQuery"), "select 1+1")
    	        .build());
    	
//    	ConnectionPoolConfiguration configuration = ConnectionPoolConfiguration.builder(connectionFactory)
//    	        .maxLifeTime(Duration.ofMillis(1))
//    	        .maxCreateConnectionTime(Duration.ofMillis(5000))
////    	        .maxAcquireTime(Duration.ofMillis(500))
////    	        .name("POOL 01")
//    	        .build();

//    	return new ConnectionPool(configuration);
    	return connectionFactory;
//    	return ConnectionFactories.get(ConnectionFactoryOptions.builder()
////    	        .option(ConnectionFactoryOptions.SSL, true)
//    	        .option(ConnectionFactoryOptions.DRIVER, "pool")
//    	        .option(ConnectionFactoryOptions.PROTOCOL, "postgresql")
//    	        .option(ConnectionFactoryOptions.HOST, "192.168.0.186")
//    	        .option(ConnectionFactoryOptions.PORT, 5433)
//    	        .option(ConnectionFactoryOptions.USER, "postgres")
//    	        .option(ConnectionFactoryOptions.PASSWORD, "postgres0202!!")
//    	        .option(ConnectionFactoryOptions.DATABASE, "test")
////    	        .option(Option.<Integer>valueOf("initialSize"), 200)
////    	        .option(Option.<Integer>valueOf("maxSize"), 1000)
////    	        .option(Option.<Integer>valueOf("maxLifeTime"), 10)
////    	        .option(Option.<String>valueOf("validationQuery"), "select 1+1")
//    	        .build());
    	
    	
//    	return new PostgresqlConnectionFactory(
//                PostgresqlConnectionConfiguration.builder()
//                        .host("192.168.0.186")
//                        .port(5433)
//                        .database("test")
//                        .username("postgres")
//                        .password("postgres0202!!")
//                        .enableSsl()
//                        .build());
    }
    
    
}
