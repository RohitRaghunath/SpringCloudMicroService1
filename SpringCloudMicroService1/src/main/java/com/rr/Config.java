package com.rr;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class Config {
	
	private String whfmName;

	public String getWhfmName() {
		return whfmName;
	}

	public void setWhfmName(String whfmName) {
		this.whfmName = whfmName;
	}

	

}
