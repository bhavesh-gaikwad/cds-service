package com.thinkitive.cdsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meta{
    public String versionId;
    public Date lastUpdated;
    public List<Tag> tag;
}
