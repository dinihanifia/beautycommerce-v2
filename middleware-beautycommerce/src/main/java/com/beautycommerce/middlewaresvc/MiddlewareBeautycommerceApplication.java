package com.beautycommerce.middlewaresvc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class MiddlewareBeautycommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareBeautycommerceApplication.class, args);
	}
}
