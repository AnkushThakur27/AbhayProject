package com.nazeem.multidb.mongodb.config;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
public class MongoDbConfig {

    @Autowired
    private Environment env;


    @Bean
    public MongoTemplate customerDbMongoTemplate() {
        String host = env.getProperty("mongodb.server1.host");
        String port = env.getProperty("mongodb.server1.port");
        String database = env.getProperty("mongodb.server1.database");
        String username = env.getProperty("mongodb.server1.username");
        String password = env.getProperty("mongodb.server1.password");

        MongoClient mongoClient = MongoClients.create(String.format("mongodb://%s:%s", host, port,username,password));

        return new MongoTemplate(mongoClient, database);
    }


    @Bean
    public MongoTemplate orderDbMongoTemplate() {
        String host = env.getProperty("mongodb.server2.host");
        String port = env.getProperty("mongodb.server2.port");
        String database = env.getProperty("mongodb.server2.database");
        String username = env.getProperty("mongodb.server2.username");
        String password = env.getProperty("mongodb.server2.password");

        MongoClient mongoClient = MongoClients.create(String.format("mongodb://%s:%s", host, port,username,password));

        return new MongoTemplate(mongoClient, database);
    }
}