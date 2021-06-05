package com.springwithelasticsearch.model.elastic;

import com.springwithelasticsearch.model.mongo.Loc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "zips")
public class ElasticZips {
    @Id
    private String _id;
    private String city;
    private String zip;
    private Integer pop;
    private String state;

    private ElasticLoc elasticLoc;
}
