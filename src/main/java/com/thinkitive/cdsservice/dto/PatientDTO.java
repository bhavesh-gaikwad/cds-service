package com.thinkitive.cdsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    public String resourceType;
    public String id;
    public Meta meta;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> name;
    public List<Telecom> telecom;
    public String gender;
    public String birthDate;
    public List<Address> address;
}