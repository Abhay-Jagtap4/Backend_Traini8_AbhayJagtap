package com.assignment.traini8;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TrainingCenterService {

    private final TrainingCenterCustomRepository customrepository;
    private final TrainingCenterRepository repository;


    public TrainingCenterService(TrainingCenterCustomRepository customrepository, TrainingCenterRepository repository) {
        this.repository = repository;
        this.customrepository = customrepository;
    }

    //Single method to handle dynamic filtering
    public List<TrainingCenter> getTrainingCenters(String centerName, String city, String state, Integer capacity) {
        return customrepository.findByFilters(centerName, city, state, capacity);
    }

    public void save(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(); // Set CreatedOn value by system
        repository.save(trainingCenter);
    }
}
