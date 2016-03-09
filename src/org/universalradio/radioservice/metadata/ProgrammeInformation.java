package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 *  
 * Abstract base class for programme information (e.g. DAB EPG, RadioDNS EPG, ...)
 * 
 * @author Sattler, IRT GmbH
 * 
 */
public interface ProgrammeInformation {
	
	/**
	 * Returns the type of this ProgrammeInformation metadata
	 * @return the type of this ProgrammeInformation metadata
	 */
	public ProgrammeInformationType getType();

}
