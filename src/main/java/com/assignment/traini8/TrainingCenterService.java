package com.assignment.traini8;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll(); // ✅ Fetch all records from MongoDB
    }

    public void save(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(); 
        repository.save(trainingCenter);
    }
}
