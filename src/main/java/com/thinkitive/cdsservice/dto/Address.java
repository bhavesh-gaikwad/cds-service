package com.thinkitive.cdsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address{
    public String use;
    public List<String> line;
    public String city;
    public String state;
    public String postalCode;
    public String country;
}