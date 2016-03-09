package org.universalradio.tuner;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Status codes for the {@link Tuner} 
 * @author Sattler, IRT GmbH
 */
public enum TunerStatus {

	/* Tuner is not initialized */
	STATUS_TUNER_NOT_INITALIZED(1, "Tuner not initialized"),
	/** Tuner is ready **/
	STATUS_TUNER_INITALIZED(1, "Tuner ready"),
	/** Tuner is in an error state **/
	STATUS_TUNER_ERROR(2, "Tuner is in an error state"),
	/** Tuner is in suspended state **/
	STATUS_TUNER_SUSPENDED(3, "Tuner is suspended"),
	/** Tuner started scan for services **/
	STATUS_TUNER_SCAN_STARTED(4, "Tuner is scanning for services"),
	/** Tuner is in scanning progress **/
	STATUS_TUNER_SCANNING(5, "Tuner is scanning for services"),
	/** Tuner finished scan for services **/
	STATUS_TUNER_SCAN_FINISHED(6, "Tuner scan finished");	
	
	private final int statusCode;
	private final String statusDescription;
	
	private TunerStatus(int statusCode, String statusDescription) {
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
