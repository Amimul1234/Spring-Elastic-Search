package com.springwithelasticsearch.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "zips")
public class Zips {
    @Id
    private ObjectId _id;
    private String city;
    private String zip;
    private Integer pop;
    private String state;

    private Loc loc;
}
