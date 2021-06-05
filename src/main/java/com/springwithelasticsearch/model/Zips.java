package com.springwithelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "zips")
public class Zips {
    private ObjectId _id;
    private String city;
    private String zip;
    private Integer pop;
    private String state;

    private Loc loc;
}
