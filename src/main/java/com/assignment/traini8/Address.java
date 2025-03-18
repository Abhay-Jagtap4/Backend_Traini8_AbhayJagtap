package com.assignment.traini8;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    @NotBlank(message = "Detailed address is required")
    @JsonProperty("detailedAddress")
    private String address;

    @NotBlank(message = "City is required")
    @JsonProperty("city")
    private String city;

    @NotBlank(message = "State is required")
    @JsonProperty("state")
    private String state;

    @NotBlank(message = "Pincode is required")
    @JsonProperty("pincode")
    private String pincode;

    // Default constructor
    public Address() {}

    // Parameterized constructor
    public Address(String address, String city, String state, String pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [Detailed Address=" + address + ", City=" + city +
                ", State=" + state + ", Pincode=" + pincode + "]";
    }
}