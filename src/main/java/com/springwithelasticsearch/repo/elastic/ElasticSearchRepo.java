package com.springwithelasticsearch.repo.elastic;

import com.springwithelasticsearch.model.Zips;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticSearchRepo extends ElasticsearchRepository<Zips, String> {

}
