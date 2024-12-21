package org.elhachemykaoutar.ccomputer;

import org.elhachemykaoutar.ccomputer.dto.Computerdto;
import org.elhachemykaoutar.ccomputer.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CComputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CComputerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerService computerService)
	{
		return args -> {
			computerService.saveComputers(
					List.of(
							Computerdto.builder().proce("intel i5").ram(8).hardDrive("256 SSD").price(6000.0).macAddress("MAC12345:aa").build(),
							Computerdto.builder().proce("intel i7").ram(16).hardDrive("512 SSD").price(1200.0).macAddress("MAC1245:bb").build(),
							Computerdto.builder().proce("intel i5").ram(8).hardDrive("256").price(4000.0).macAddress("MAC1298:vv").build(),
							Computerdto.builder().proce("intel i7").ram(16).hardDrive("512").price(1000.0).macAddress("MAC12399:cc").build()

					)
			);
		};
	}
}
