package com.thinkitive.cdsservice.mapper;

import com.thinkitive.cdsservice.entities.CdsServices;
import com.thinkitive.cdsservice.vo.responseVO.CdsServiceResponse;
import org.json.JSONObject;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdsServiceMapper {

    public CdsServiceResponse mapResponseFromCdsServices(CdsServices cdsServices) {
        CdsServiceResponse cdsServiceResponse = new CdsServiceResponse();
        cdsServiceResponse.setId(cdsServices.getHookId());
        cdsServiceResponse.setHook(cdsServices.getHook());
        cdsServiceResponse.setTitle(cdsServices.getTitle());
        cdsServiceResponse.setDescription(cdsServices.getDescription());
        JSONObject jsonObject = new JSONObject(cdsServices.getPrefetch());
        cdsServiceResponse.setPrefetch(jsonObject.toMap());
        return cdsServiceResponse;
    }

}
