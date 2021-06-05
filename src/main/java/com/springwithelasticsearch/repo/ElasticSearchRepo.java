package com.springwithelasticsearch.repo;

import com.springwithelasticsearch.model.elastic.ElasticZips;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticSearchRepo extends ElasticsearchRepository<ElasticZips, String>{

}
