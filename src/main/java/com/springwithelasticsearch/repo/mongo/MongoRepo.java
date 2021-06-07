package com.springwithelasticsearch.repo.mongo;

import com.springwithelasticsearch.model.Zips;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Zips, String> {

}
