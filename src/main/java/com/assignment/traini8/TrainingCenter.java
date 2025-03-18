package com.assignment.traini8;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

// Training Center entity class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainingCenter {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("centerName")
    private String centerName;

    @JsonProperty("centerCode")
    private String centerCode;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("studentCapacity")
    private Integer studentCapacity;

    @JsonProperty("courceOffered")
    private List<String> courceOffered;

    @JsonProperty("createdOn")
    private Long createdOn;

    @JsonProperty("contactEmail")
    private String contactEmail;

    @JsonProperty("contactPhone")
    private String contactPhone;

    // Default constructor
    public TrainingCenter() {}

    // Parameterized constructor
    public TrainingCenter(Integer id, String centerName, String centerCode, Address address, Integer studentCapacity, List<String> courceOffered,String contactEmail, String contactPhone ) {
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "TrainingCenter [id=" + id + ", Center Name=" + centerName +
                ", Center Code=" + centerCode + ", Address=" + address.toString() +
                ", Student Capacity=" + studentCapacity + ", Cources Offered=" + courceOffered.toString() +
                ", Contact Email=" + contactEmail + ", Contact Phone=" + contactPhone + "]";
    }
}