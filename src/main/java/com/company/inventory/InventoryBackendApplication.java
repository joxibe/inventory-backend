package com.company.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//(exclude={DataSourceAutoConfiguration.class}) para que no genere las entidades automaticamente
@SpringBootApplication
public class InventoryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryBackendApplication.class, args);
	}

}
