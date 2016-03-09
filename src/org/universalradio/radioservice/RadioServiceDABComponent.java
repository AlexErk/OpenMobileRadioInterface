package org.universalradio.radioservice;

import java.util.List;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class containing informations for a service component (SC) for a {@link RadioServiceDAB}
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceDABComponent {

	/**
	 * Returns the bitrate in kbit/s for this {@link RadioServiceDABComponent}
	 * @return the bitrate in kbit/s for this {@link RadioServiceDABComponent}
	 */
	public int getScBitrate();
	
	/**
	 * Indicates if the CA (Conditional Access) flag is set
	 * @return indication for conditional access
	 */
	public boolean isScCaFlagSet();
	
	/**
	 * Returns the {@link RadioServiceDABComponent}s channel id as numerical value
	 * @return the {@link RadioServiceDABComponent}s channel id as numerical value
	 */
	public int getScChannelId();
	
	/**
	 * Returns the {@link RadioServiceDABComponent}s channel id as hex-string
	 * @return the {@link RadioServiceDABComponent}s channel id as hex-string
	 */
	public String getScChannelIdString();
	
	/**
	 * Indicates if the DG flag is set
	 * @return indication for DG
	 */
	public boolean isScDgFlagSet();
	
	/**
	 * Returns the {@link RadioServiceDABComponent} id as numerical value
	 * @return the {@link RadioServiceDABComponent} id as numerical value
	 */
	public int getScId();
	
	/**
	 * Returns the {@link RadioServiceDABComponent} id as hex-string
	 * @return the {@link RadioServiceDABComponent} id as hex-string
	 */
	public String getScIdString();
	
	/**
	 * Returns the label for this {@link RadioServiceDABComponent}
	 * @return the label for this {@link RadioServiceDABComponent}
	 */
	public String getScLabel();
	
	/**
	 * Returns the packetaddress as numerical value
	 * @return the packetaddress as numerical value
	 */
	public int getScPacketAddress();
	
	/**
	 * Returns the packetaddress as hex-string
	 * @return the packetaddress as hex-string
	 */
	public String getScPacketAddressString();
	
	/**
	 * Indicates if this {@link RadioServiceDABComponent} is the primary component of this {@link RadioServiceDAB}
	 * @return if this {@link RadioServiceDABComponent} is the primary component of this {@link RadioServiceDAB}
	 */
	public boolean isScPrimary();
	
	/**
	 * Returns the service component id as numerical value
	 * @return the service component id as numerical value
	 */
	public int getScServiceComponentId();
	
	/**
	 * Returns the service component id as hex-string
	 * @return the service component id as hex-string
	 */
	public String getScServiceComponentIdString();
	
	/**
	 * Returns the Transport Mode (TM) ID as numerical value
	 * @return the Transport Mode (TM) ID as numerical value
	 */
	public int getTmId();
	
	/**
	 * Returns the Transport Mode (TM) ID as hex-string
	 * @return the Transport Mode (TM) ID as hex-string
	 */
	public String getTmIdString();
	
	/**
	 * Returns the service component type as numerical value
	 * @return the service component type as numerical value
	 */
	public int getScType();
	
	/**
	 * Returns the service component type as hex-string
	 * @return the service component type as hex-string
	 */
	public String getScTypeString();
	
	/**
	 * Returns a list with {@link RadioServiceDABUserApplication}s for this SC
	 * @return a list with {@link RadioServiceDABUserApplication}s for this SC
	 */
	public List<RadioServiceDABUserApplication> getScUserApplications();
}
