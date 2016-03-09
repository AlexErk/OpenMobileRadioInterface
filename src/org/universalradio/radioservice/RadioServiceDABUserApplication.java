package org.universalradio.radioservice;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class containing informations about one user application for a {@link RadioServiceDABComponent}
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceDABUserApplication {

	/**
	 * Returns the user application label
	 * @return the user application label
	 */
	public String getUappLabel();
	
	/**
	 * Returns the user application type as numerical value
	 * @return the user application type as numerical value
	 */
	public int getUappType();
	
	/**
	 * Returns the user application type as hex-string
	 * @return the user application type as hex-string
	 */
	public String getUappTypeString();
}
