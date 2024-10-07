package starterProject.incomeClient_starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import starterProject.incomeClient_starter.client.IncomeClient;

@Configuration
public class IncomeClientAutoConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IncomeClient incomeClient(RestTemplate restTemplate) {
        return new IncomeClient(restTemplate);
    }
}
