package org.whystudio.internship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2   // 放在有 @Configuration 注解的地方
@MapperScan("org.whystudio.internship.mapper")
public class InternshipApplication {
	public static void main(String[] args) {
		SpringApplication.run(InternshipApplication.class, args);
	}
}