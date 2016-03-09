package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract base class for visual metadata (e.g. DAB SLS, RadioDNS RadioVIS, ID3 Coverart)
 * @author Sattler, IRT GmbH
 */
public interface Visual {

	/**
	 * Returns the type (source) of this visual metadata (e.g. DAB Slideshow, RadioDNS RadioVIS, etc.)
	 * @return the type of this visual metadata
	 */
	public VisualType getVisualType();
	
	/**
	 * Returns the type of this visual metadata
	 * @return the type of this visual metadata
	 */
	public VisualMimeType getVisualMimeType();
	
	/**
	 * Returns the width of this visual metadata
	 * @return the width of this visual metadata
	 */
	public int getWidth();
	
	/**
	 * Returns the height of this visual metadata
	 * @return the height of this visual metadata
	 */
	public int getHeight();
	
	/**
	 * Returns the actual image data
	 * @return the actual image data
	 */
	public byte[] getVisualData();
}
