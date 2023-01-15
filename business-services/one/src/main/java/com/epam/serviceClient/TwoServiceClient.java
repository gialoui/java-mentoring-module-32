package com.epam.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author khangndd
 */
@FeignClient(name = "twoServiceClient", url = "${api.host}/two")
public interface TwoServiceClient {
    @GetMapping("/health-check")
    String healthCheck();
}
