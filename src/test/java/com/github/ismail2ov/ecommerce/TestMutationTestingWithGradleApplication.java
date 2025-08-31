package com.github.ismail2ov.ecommerce;

import org.springframework.boot.SpringApplication;

public class TestMutationTestingWithGradleApplication {

	public static void main(String[] args) {
		SpringApplication.from(MutationTestingWithGradleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
