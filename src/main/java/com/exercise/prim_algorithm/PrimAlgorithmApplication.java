package com.exercise.prim_algorithm;

import com.exercise.prim_algorithm.helper.PrimHelper;
import com.exercise.prim_algorithm.service.PrimService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class PrimAlgorithmApplication {

	private final PrimService primService;

	public static void main(String[] args) {
		SpringApplication.run(PrimAlgorithmApplication.class, args);
	}

	@Bean
	public ApplicationRunner startupRunner() {
		return args -> primService.printInfoCalculateMST(PrimHelper.generateGraph(), PrimHelper.generateGraph().getAdjacencyList().keySet().iterator().next());
	}

}
