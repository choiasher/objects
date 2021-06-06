package me.asher.objects.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion) {
    Info info = new Info()
      .title("Demo API")
      .version(appVersion)
      .description("This is demo API docs for spring boot application")
      .termsOfService("http://swagger.io/terms/")
      .contact(getDefaultContact())
      .license(getDefaultLicense());
    return new OpenAPI()
      .components(new Components())
      .info(info);
  }

  private Contact getDefaultContact() {
    return new Contact().name("choi asher").url("https://choiasher.github.io/")
      .email("tahun970@gmail.com");
  }

  private License getDefaultLicense() {
    return new License().name("Apache License Version 2.0")
      .url("http://www.apache.org/licenses/LICENSE-2.0");
  }
}