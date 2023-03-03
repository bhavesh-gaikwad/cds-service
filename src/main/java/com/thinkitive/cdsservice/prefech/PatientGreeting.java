package com.thinkitive.cdsservice.prefech;

import com.thinkitive.cdsservice.dto.PatientDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientGreeting {

    private PatientDTO patient;

}

