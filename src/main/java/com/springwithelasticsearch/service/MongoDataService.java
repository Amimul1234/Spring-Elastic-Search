package com.springwithelasticsearch.service;

import com.springwithelasticsearch.model.Zips;
import com.springwithelasticsearch.repo.elastic.ElasticSearchRepo;
import com.springwithelasticsearch.repo.mongo.MongoRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MongoDataService {

    private final MongoRepo mongoRepo;
    private final ElasticSearchRepo elasticSearchRepo;

    public MongoDataService( MongoRepo mongoRepo, ElasticSearchRepo elasticSearchRepo ) {
        this.mongoRepo = mongoRepo;
        this.elasticSearchRepo = elasticSearchRepo;
    }

    public void getAllData() {
        List<Zips> zipsList = mongoRepo.findAll();
        zipsList.forEach(elasticSearchRepo::save);
    }
}
