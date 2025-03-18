package com.assignment.traini8;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

// Training Center entity class
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "trainingCenters") // Collection name in MongoDB
public class TrainingCenter {
    @Id
    @JsonProperty("id")
    private String id;

    @NotBlank(message = "Center name is required")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    @JsonProperty("centerName")
    private String centerName;

    @NotBlank(message = "Center code is required")
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Center code must be alphanumeric")
    @JsonProperty("centerCode")
    private String centerCode;

    @Embedded
    @Valid // Validate nested object
    @JsonProperty("address")
    private Address address;

    @JsonProperty("studentCapacity")
    private Integer studentCapacity;

    @JsonProperty("courceOffered")
    private List<String> courceOffered;

    @JsonProperty("createdOn")
    private Long createdOn;

    @Email(message = "Invalid email format")
    @JsonProperty("contactEmail")
    private String contactEmail;

    @NotBlank(message = "Contact phone is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Contact phone must be exactly 10 digits")
    @JsonProperty("contactPhone")
    private String contactPhone;

    // Default constructor
    public TrainingCenter() {}

    // Parameterized constructor
    public TrainingCenter(String id, String centerName, String centerCode, Address address, Integer studentCapacity, List<String> courceOffered,String contactEmail, String contactPhone ) {
        this.id = id;
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCapacity = studentCapacity;
        this.courceOffered = courceOffered;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    protected void onCreate() {
        this.createdOn = Instant.now().getEpochSecond();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCourceOffered() {
        return courceOffered;
    }

    public void setCourceOffered(List<String> courceOffered) {
        this.courceOffered = courceOffered;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setCreatedOn() {
        this.createdOn = Instant.now().getEpochSecond();
    }

    @Override
    public String toString() {
        return "TrainingCenter [id=" + id + ", Center Name=" + centerName +
                ", Center Code=" + centerCode + ", Address=" + address.toString() +
                ", Student Capacity=" + studentCapacity + ", Cources Offered=" + courceOffered.toString() +
                ", Contact Email=" + contactEmail + ", Contact Phone=" + contactPhone + "]";
    }
}