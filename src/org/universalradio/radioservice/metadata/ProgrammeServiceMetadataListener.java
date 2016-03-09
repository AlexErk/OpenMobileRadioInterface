package org.universalradio.radioservice.metadata;

import org.universalradio.radioservice.RadioServiceListener;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive {@link ProgrammeInformation} and {@link ServiceInformation} programme associated metadata
 *   
 * @author Sattler, IRT GmbH
 */
public interface ProgrammeServiceMetadataListener extends RadioServiceListener {

	/**
	 * New {@link ProgrammeInformation} was received
	 * @param programmeInformation the {@link ProgrammeInformation} received
	 */
	public void newProgrammeInformation(ProgrammeInformation programmeInformation);
	
	/**
	 * New {@link ServiceInformation} was received
	 * @param serviceInformation the {@link ServiceInformation} received
	 */
	public void newServiceInformation(ServiceInformation serviceInformation);
}
