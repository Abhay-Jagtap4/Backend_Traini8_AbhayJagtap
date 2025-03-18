package com.assignment.traini8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

// REST Controller for managing TrainingCenters
@RestController
@RequestMapping("/trainingCenters")
public class Controller {
    @Autowired
    private TrainingCenterDAO trainingCenterDAO;

    // GET endpoint to fetch all TrainingCenters
    @GetMapping("/get")
    public TrainingCenters getTrainingCenters() {
        return trainingCenterDAO.getAllTrainingCenters();
    }

    // POST endpoint to add a new TrainingCenter
    @PostMapping("/create")
    public ResponseEntity<Object> 
      addTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
      
        // Generate ID for the new TrainingCenter
        Integer id = trainingCenterDAO.getAllTrainingCenters()
          .getTrainingCenterList().size() + 1;
        trainingCenter.setId(id);

        // Add TrainingCenter to the list
        trainingCenterDAO.addTrainingCenter(trainingCenter);

        // Build location URI for the new TrainingCenter
        URI location = ServletUriComponentsBuilder
          .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(trainingCenter.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
