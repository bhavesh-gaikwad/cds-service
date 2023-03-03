package com.thinkitive.cdsservice.config;

import com.thinkitive.cdsservice.entities.CdsServices;
import com.thinkitive.cdsservice.repository.CdsServiceRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceMaker {

    @Autowired
    CdsServiceRepository cdsServiceRepository;

    @Bean
    public void createPatientViewService() {

        final String hookId = "patient-greeting";

        if (cdsServiceRepository.existsByIsActiveTrueAndHookId(hookId))
            return;

        CdsServices cdsServices = new CdsServices();
        cdsServices.setHookId(hookId);
        cdsServices.setHook("patient-view");
        cdsServices.setTitle("Patient greeting");
        cdsServices.setDescription("Display which patient the user is currently working with.");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patient", "Patient/{{context.patientId}}");
        cdsServices.setPrefetch(jsonObject.toString());
        cdsServices.setIsActive(true);

        cdsServiceRepository.save(cdsServices);

    }

}
