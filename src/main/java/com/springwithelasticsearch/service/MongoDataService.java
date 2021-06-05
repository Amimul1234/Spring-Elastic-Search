package com.springwithelasticsearch.service;

import com.springwithelasticsearch.model.Zips;
import com.springwithelasticsearch.repo.MongoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoDataService {
    private final MongoRepo mongoRepo;

    public MongoDataService( MongoRepo mongoRepo ) {
        this.mongoRepo = mongoRepo;
    }


    public List<Zips> getAllData() {
        return mongoRepo.findAll().subList(1, 100);
    }
}
