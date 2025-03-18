package com.assignment.traini8;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    @JsonProperty("detailedAddress")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

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