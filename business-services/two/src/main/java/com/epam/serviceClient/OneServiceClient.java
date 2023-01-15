package com.epam.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author khangndd
 */
@FeignClient(name = "oneServiceClient", url = "${api.host}/one")
public interface OneServiceClient {
    @GetMapping("/health-check")
    String healthCheck();
}
