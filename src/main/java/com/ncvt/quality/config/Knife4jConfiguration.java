package com.ncvt.quality.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// 接口文档配置，运行游览器输入：http://localhost:8089/api/doc.html
@Configuration
@EnableSwagger2
@EnableKnife4j
public class Knife4jConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.ncvt.quality.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("质量管理系统接口文档")
                .contact(new Contact("我不吃饼干", "https://www.baidu.com", "2869447368@qq.com"))
                .version("v1.1.0")
                .title("质量管理系统接口文档")
                .build();
    }

}
