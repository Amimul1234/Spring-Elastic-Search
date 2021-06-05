package com.springwithelasticsearch.repo;

import com.springwithelasticsearch.model.mongo.Zips;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Zips, ObjectId> {

}
