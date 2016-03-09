package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract base class for textual metadata
 * @author Sattler, IRT GmbH
 */
public interface Textual {

	/**
	 * Returns the type of this textual metadata
	 * @return the type of this textual metadata
	 */
	public TextualType getType();
	
	/**
	 * Returns the {@link String} representation of this textual metadata
	 * @return the {@link String} representation of this textual metadata
	 */
	public String getText();
}
