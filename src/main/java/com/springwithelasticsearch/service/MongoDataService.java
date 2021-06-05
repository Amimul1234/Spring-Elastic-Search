package com.springwithelasticsearch.service;

import com.springwithelasticsearch.model.elastic.ElasticLoc;
import com.springwithelasticsearch.model.elastic.ElasticZips;
import com.springwithelasticsearch.model.mongo.Zips;
import com.springwithelasticsearch.repo.ElasticSearchRepo;
import com.springwithelasticsearch.repo.MongoRepo;
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

        zipsList.forEach(zips -> {
            ElasticZips elasticZips = new ElasticZips();
            ElasticLoc elasticLoc = new ElasticLoc();

            elasticLoc.setX(zips.getLoc().getX());
            elasticLoc.setY(zips.getLoc().getY());

            elasticZips.setCity(zips.getCity());
            elasticZips.setPop(zips.getPop());
            elasticZips.setState(zips.getState());
            elasticZips.setElasticLoc(elasticLoc);

            elasticSearchRepo.save(elasticZips);
        });
    }
}
