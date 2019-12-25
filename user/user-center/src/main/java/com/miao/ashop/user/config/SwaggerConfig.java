package com.miao.ashop.user.config;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@SuppressWarnings({"unused"})
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger2.enable}") private boolean enable;


    @Bean("StaffApis")
    public Docket staffApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("员工模块")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/staff.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(enable);
    }



    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .validatorUrl(null)
                .build();
    }

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ASHOP接口文档")
                .description("ASHOP用户中心接口")
                .version("1.0")
                .build();
    }



}
