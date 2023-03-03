package com.thinkitive.cdsservice.vo.requestVO;

import com.thinkitive.cdsservice.prefech.PatientGreeting;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientGreetingRequest {

    private String hook;
    private String hookInstance;
    private Map<String, Object> context;
    private PatientGreeting prefetch;

}
