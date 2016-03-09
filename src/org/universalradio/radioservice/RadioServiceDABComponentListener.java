package org.universalradio.radioservice;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive raw data from a {@link RadioServiceDABComponent} (e.g. Journaline data)
 *   
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceDABComponentListener {

	/**
	 * Called when new data from a specific DAB Service Component was received
	 * @param serviceComponentChannelId th Service component id
	 * @param scData raw data from the service component
	 */
	public void newServiceComponentData(int serviceComponentChannelId, byte[] scData);
}
