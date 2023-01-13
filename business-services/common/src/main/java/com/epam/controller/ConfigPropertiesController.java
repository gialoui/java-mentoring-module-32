package com.epam.controller;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author khangndd
 */
@RestController
public class ConfigPropertiesController {
    private DynamicStringProperty propertyOneWithDynamic = DynamicPropertyFactory
            .getInstance()
            .getStringProperty("baeldung.archaius.properties.one", "not found!");

    @GetMapping("/properties-from-dynamic")
    public Map<String, String> getPropertiesFromDynamic() {
        Map<String, String> properties = new HashMap<>();
        properties.put(propertyOneWithDynamic.getName(), propertyOneWithDynamic.get());

        return properties;
    }
}
