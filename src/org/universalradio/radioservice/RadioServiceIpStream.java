package org.universalradio.radioservice;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 *  
 * Abstract interface which defines the necessary data for a single 'stream' of a {@link RadioService}
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceIpStream {

	/**
	 * Returns the URL of this stream (e.g. 'http://somewebstream:1337/genre')
	 * @return the URL of this stream
	 */
	public String getUrl();
	
	/**
	 * Returns the bitrate in kbit/s for this stream
	 * @return the bitrate in kbit/s
	 */
	public int getBitrate();
	
	/**
	 * Return the MIME type of this stream
	 * @return the MIME type of this stream
	 */
	public RadioServiceMimeType getMimeType();
	
	/**
	 * Indicates the cost for this stream. Higher means more 'expensive'
	 * @return the cost for this stream
	 */
	public int getCost();
	
	/**
	 * Indicates the offset in seconds from the fastest corresponding broadcast bearer (e.g. FM).
	 * @return the offset in seconds.
	 */
	public int getOffset();
}
