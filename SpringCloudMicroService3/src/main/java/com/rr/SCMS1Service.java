package com.rr;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SCMS1Service {

	private static final String URL = "http://localhost:9081";
	private RestTemplate rest;

	public SCMS1Service(RestTemplate rest) {
		this.rest = rest;
	}

	public String getName() {
		return rest.getForObject(URL, String.class);
	}
}
