package org.springframework.cloud.consul.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Spencer Gibb
 */
@Data
public class Check {
    @JsonProperty("script")
    private String script;
    
    @JsonProperty("http")
    private String http;

    @JsonProperty("Interval")
    private String interval;

    @JsonProperty("TTL")
    private int ttl;
}
