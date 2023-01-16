package org.rapidapi.sample.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class SampleController {

	@Operation(summary = "Get the health status of API")
	@ApiResponses({ @ApiResponse(responseCode = "200", description = "health status", content = {
			@Content(mediaType = "application/json") }) })
	@GetMapping("/geStatus")
	public ResponseEntity<String> getStatus() {
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}
