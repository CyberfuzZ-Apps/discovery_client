package ru.job4j.discovery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Класс RestTemplateConfig
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restController() {
        return new RestTemplate();
    }

}
