package com.example.demo.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Parameter;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.controller"})//配置controller路径
@EnableSwagger2
public class Swagger{
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))//扫描com路径下的api文档
                .paths(PathSelectors.any())//路径判断,这里是任何路径
                .build();
    }
    private ApiInfo apiInfo() {
        return  new  ApiInfo("测试接口-JAVA版",//大标题
                "测试",//小标题
                "1.0",//版本
                "1",
                "sxn",//作者
                "官方网址",//链接显示文字
                "http://www.citydo.com"//网站链接
        );
    }
}