package com.rr;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final Logger LOG = Logger.getLogger(Controller.class.getName());

	private Config config;

	public Controller(Config config) {
		this.config = config;
	}

	@RequestMapping("/{languageCode}")
	public String getGreeting(@PathVariable String languageCode){
		LOG.info("Language Code: " + languageCode);
		LOG.info("Greeting: " + config.getGreetings().get(languageCode.toUpperCase()));
		return config.getGreetings().getOrDefault(languageCode.toUpperCase(), config.getGreeting());
	}

	@RequestMapping("/")
	public String getGreeting(){
		LOG.info("Greeting: " + config.getGreeting());
		return config.getGreeting();
	}
}
