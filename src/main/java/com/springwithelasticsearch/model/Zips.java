package com.springwithelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@org.springframework.data.elasticsearch.annotations.Document(indexName = "zips")
@Document(collection = "zips")

public class Zips {
    @Id
    private String _id;
    @Field(type = FieldType.Text)
    private String city;
    @Field(type = FieldType.Keyword)
    private String zip;
    @Field(type = FieldType.Keyword)
    private Integer pop;
    @Field(type = FieldType.Keyword)
    private String state;

    private Loc loc;
}
