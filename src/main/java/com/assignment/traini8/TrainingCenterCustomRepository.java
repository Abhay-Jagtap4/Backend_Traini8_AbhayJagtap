package com.assignment.traini8;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainingCenterCustomRepository {

    private final MongoTemplate mongoTemplate;

    public TrainingCenterCustomRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<TrainingCenter> findByFilters(String centerName, String city, String state, Integer capacity) {
        Query query = new Query();

        if (centerName != null && !centerName.isEmpty()) {
            query.addCriteria(Criteria.where("centerName").regex(centerName, "i")); // Case-insensitive search
        }

        if (city != null && !city.isEmpty()) {
            query.addCriteria(Criteria.where("address.city").is(city));
        }

        if (state != null && !state.isEmpty()) {
            query.addCriteria(Criteria.where("address.state").is(state));
        }

        if (capacity != null) {
            query.addCriteria(Criteria.where("studentCapacity").gte(capacity));
        }

        return mongoTemplate.find(query, TrainingCenter.class);
    }
}
