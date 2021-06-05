package com.springwithelasticsearch.repo;

import com.springwithelasticsearch.model.Zips;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<Zips, ObjectId> {

}
