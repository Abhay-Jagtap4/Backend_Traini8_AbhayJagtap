package com.assignment.traini8;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

@Repository
public class TrainingCenterDAO {
    private static TrainingCenters trainingCenters = new TrainingCenters();

    static {
        // Initialize with sample trainingCenters
        // Address address = new Address("Katraj", "Kondhwa", "Pune", "411048");
        // TrainingCenter trainingCenter = new TrainingCenter(1, "Vamshivat VOICE", "VV", address, 30, new ArrayList<>(Arrays.asList("DYS")), "vv@gmail.com", "123456");
        // trainingCenters.getTrainingCenterList().add(trainingCenter);
    }

    // Retrieve all trainingCenters
    public TrainingCenters getAllTrainingCenters() {
        return trainingCenters;
    }

    // Add an trainingCenter
    public void addTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenters.getTrainingCenterList().add(trainingCenter);
    }
}
