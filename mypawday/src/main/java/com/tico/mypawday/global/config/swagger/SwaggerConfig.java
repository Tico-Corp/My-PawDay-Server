package com.tico.mypawday.global.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My PawDay API")
                        .description("멍냥의 하루(My PawDay) 서비스 API 문서")
                        .version("v1.0.0"));
    }
}