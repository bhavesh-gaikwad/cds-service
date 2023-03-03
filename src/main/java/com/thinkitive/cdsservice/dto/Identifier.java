package com.thinkitive.cdsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Identifier{
    public String use;
    public Type type;
    public String system;
    public String value;
}