package com.rr;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final Logger LOG = Logger.getLogger(Config.class.getName());

	private Config config1;

	public Controller(Config config1) {
		this.config1 = config1;
	}

	@RequestMapping
	public String getName() {
		LOG.info("Name: " + config1.getWhfmName());
		return config1.getWhfmName();
	}
}
