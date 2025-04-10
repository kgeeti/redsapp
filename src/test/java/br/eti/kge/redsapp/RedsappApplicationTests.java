package br.eti.kge.redsapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class RedsappApplicationTests {

    @Test
    void contextLoads() {
    }
    
     @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void testMongoConnection() {
        System.out.println("Coleções no banco:");
        mongoTemplate.getDb().listCollectionNames().forEach(System.out::println);
    }

}
