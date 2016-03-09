package org.universalradio.radio;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Status codes for {@link Radio}
 * @author Sattler, IRT GmbH
 */
public enum RadioStatus {

	STATUS_RADIO_RUNNING(0, "Radio is running"),
	STATUS_RADIO_SUSPENDED(1, "Radio is suspended");
	
	private final int statusCode;
	private final String statusDescription;
	
	private RadioStatus(int statusCode, String statusDescription) {
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
	public String getStatusDescription() {
		return this.statusDescription;
	}
}
