package com.thinkitive.cdsservice.vo.responseVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardsResponse {

    private String uuid;

    private String summary;

    private String indicator;

    private Map<String, Object> source;

}
