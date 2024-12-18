package com.getulioazevedo.bookstoremanager.config;


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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String TITLE = "Bookstorage Manager";
    private static final String DESCRIPTION = "Bookstore API Profissional";
    private static final String VERSION = "1.0.0";
    private static final String NAME = "Getulio Azevedo";
    private static final String GITHUB = "https://github.com/getulio222/bookstoremanager_course";
    private static final String EMAIL = "getulio222@hotmail.com";
    private static final String BASE_PACKAGE = "com.getulioazevedo.bookstoremanager";

    @Bean
     Docket api(){
     return new Docket(DocumentationType.SWAGGER_2)
             .select()
             .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
             .paths(PathSelectors.any())
             .build()
             .apiInfo(buildApiInfo());


    }

    private ApiInfo buildApiInfo() {

        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .version(VERSION)
                .contact( new Contact(NAME, GITHUB, EMAIL))
                .build();
    }
}
