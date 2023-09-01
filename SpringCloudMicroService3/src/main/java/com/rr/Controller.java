package com.rr;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

@RestController
public class Controller {

	private static final Logger LOG = Logger.getLogger(Controller.class.getName());

	private SCMS1Service scms1Service;
	private SCMS2Service scms2Service;

	public Controller(SCMS1Service scms1Service, SCMS2Service scms2Service) {
		this.scms1Service = scms1Service;
		this.scms2Service = scms2Service;
	}

	@RequestMapping
	public String index(HttpServletRequest request) {
		
		String locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request).toLanguageTag();
		
		String greeting =  new StringBuilder().append(scms2Service.getGreeting(locale)).
				append(" ").append(scms1Service.getName()).toString();
		
		LOG.info("Greeting: " + greeting);
		LOG.info("Locale: " + locale);
		
		return greeting;
	}
}
