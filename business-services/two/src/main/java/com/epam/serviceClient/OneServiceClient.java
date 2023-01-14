package com.epam.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author khangndd
 */
@FeignClient(name = "one-service")
public interface OneServiceClient {
    @GetMapping("/one")
    String test();
}
