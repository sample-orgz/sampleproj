package com.oup.sampleproj;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@Slf4j
public class SampleConfiguration {

    @Value("${SAMPLE_ENV_VALUE1}")
    private String env1;

    @Value("${SAMPLE_ENV_VALUE2}")
    private String env2;

    @Bean
    public void printEnvVariables() {
        log.info("the Workflow env variable is {}",env1);
        log.info("the job env variable is {}",env2);
    }
}
