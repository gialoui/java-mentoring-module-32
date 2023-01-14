package com.epam.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author khangndd
 */
@FeignClient(name = "two-service")
public interface TwoServiceClient {
    @GetMapping("/two")
    String test();
}
