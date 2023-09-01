package com.rr;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SCMS2Service {

	private static final String URL = "http://localhost:9082";
	private RestTemplate rest;

	public SCMS2Service(RestTemplate rest) {
		this.rest = rest;
	}

	public String getGreeting() {
		return rest.getForObject(URL, String.class);
	}

	public String getGreeting(String locale) {
		return rest.getForObject(new StringBuilder().append(URL).append("/").append(locale).toString(), String.class);
	}
}
