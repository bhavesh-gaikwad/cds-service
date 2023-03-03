package com.thinkitive.cdsservice.vo.responseVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CdsServiceResponse {

    private String id;

    private String hook;

    private String title;

    private String description;

    private Map<String, Object> prefetch;

}
