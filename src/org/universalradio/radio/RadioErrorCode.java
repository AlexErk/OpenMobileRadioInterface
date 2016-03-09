package org.universalradio.radio;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Error codes for the {@link Radio} 
 * @author Sattler, IRT GmbH
 */
public enum RadioErrorCode {

	ERROR_INIT_OK(0, "No Error"),
	ERROR_INIT_NOT_OKAY(1, "Init error"),
	ERROR_INIT_FATAL_ERROR(2, "Fatal error"),
	ERROR_SUSPEND_OK(3, "Radio suspended"),
	ERROR_SUSPEND_FAILED(4, "Radio could not be suspended"),
	ERROR_RESUME_OK(5, "Radio resumed"),
	ERROR_RESUME_FAILED(6, "Radio could not be resumed");
	
	private final int errorCode;
	private final String errorDescription;
	
	private RadioErrorCode(int errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	public String getErrorCodeDescription() {
		return this.errorDescription;
	}
}
