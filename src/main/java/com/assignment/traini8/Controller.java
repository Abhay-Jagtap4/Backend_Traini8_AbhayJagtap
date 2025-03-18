package com.assignment.traini8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;

// REST Controller for managing TrainingCenters
@RestController
@RequestMapping("/trainingCenters")
@Validated
public class Controller {
  private final TrainingCenterService trainingCenterService;

  public Controller(TrainingCenterService trainingCenterService) {
      this.trainingCenterService = trainingCenterService;
  }
    // GET endpoint to fetch all TrainingCenters
    @GetMapping("/get")
    public List<TrainingCenter> getTrainingCenters() {
        return trainingCenterService.getAllTrainingCenters(); // ✅ Return all training centers
    }

    // POST endpoint to add a new TrainingCenter
    @PostMapping("/create")
    public ResponseEntity<Object> 
      addTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
      
        trainingCenterService.save(trainingCenter);
        return ResponseEntity.status(HttpStatus.CREATED).body("Training center created successfully!");
    }
}
