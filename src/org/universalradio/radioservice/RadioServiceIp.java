package org.universalradio.radioservice;

import java.util.List;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract interface for an IP delivered {@link RadioService}
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceIp extends RadioService {

	/**
	 * The list of available {@link RadioServiceIpStream}s for this IP delivered {@link RadioService}
	 * @return a list of available {@link RadioServiceIpStream} for this {@link RadioService}
	 */
	public List<RadioServiceIpStream> getIpStreams();
}
