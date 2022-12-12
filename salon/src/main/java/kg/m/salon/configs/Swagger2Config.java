package kg.m.salon.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {


    public static final String Salon="Салоны";

    public static final String Master="Мастера";
    public static final String WorkDay="График";
    public static final String BookingTime="Время бронирования";
    public static final String User="Пользователи";



    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("kg.m.salon.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo())
                .tags(new Tag(BookingTime,""))
                .tags(new Tag(User,""))
                .tags(new Tag(Master,""))
                .tags(new Tag(WorkDay,""))
                .tags(new Tag(Salon,""));

    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Сервис для записи в салон")
                .description("Salon service")
                .version("1.0.0")
                .build();
    }


}
