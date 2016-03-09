package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class for a IP delivered RadioDNS RadioVis {@link Visual} metadata
 * 
 * @author Sattler, IRT GmbH
 */
public interface VisualIpRdnsRadioVis extends Visual {

	/**
	 * Returns the Triggertime as POSIX time (seconds elapsed since 1.1.1970)
	 * @return the Triggertime as POSIX time
	 */
	public long getTriggerTime();
}
