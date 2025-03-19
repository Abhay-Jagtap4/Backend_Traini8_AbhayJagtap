package com.assignment.traini8;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
    //Required for save operation in post method
}

