package com.assignment.traini8;

import java.util.ArrayList;
import java.util.List;

public class TrainingCenters {
    private List<TrainingCenter> trainingCentersList;

    // Get the TrainingCenter list (initialize if null)
    public List<TrainingCenter> getTrainingCenterList() {
        if (trainingCentersList == null) {
            trainingCentersList = new ArrayList<>();
        }
        return trainingCentersList;
    }

    public void setTrainingCentersList(List<TrainingCenter> trainingCentersList) {
        this.trainingCentersList = trainingCentersList;
    }
}
