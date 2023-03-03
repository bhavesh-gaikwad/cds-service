package com.thinkitive.cdsservice.controller;


import com.thinkitive.cdsservice.services.CdsService;
import com.thinkitive.cdsservice.vo.requestVO.PatientGreetingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.thinkitive.cdsservice.constants.ApiConstants.CDS_SERVICE_PATH;
import static com.thinkitive.cdsservice.constants.ApiConstants.EMPTY;
import static com.thinkitive.cdsservice.constants.ApiConstants.PATIENT_GREETING;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(CDS_SERVICE_PATH)
public class ServiceController  {

    @Autowired
    CdsService cdsService;

    @GetMapping(EMPTY)
    @ResponseStatus(OK)
    public Map<String, Object> getServices() {
        return cdsService.getServices();
    }

    @PostMapping(PATIENT_GREETING)
    @ResponseStatus(OK)
    public Map<String, Object> selectService(@RequestBody PatientGreetingRequest patientGreetingRequest) {
        return cdsService.patientGreetingService(patientGreetingRequest);
    }

}
