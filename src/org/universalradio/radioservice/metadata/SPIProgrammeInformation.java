package org.universalradio.radioservice.metadata;

import org.w3c.dom.Document;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract base class for a radio service
 * @author Erk, IRT GmbH
 */
public interface SPIProgrammeInformation extends ProgrammeInformation {

	/**
	 * Returns the SPI as a DOM object 
	 * @return a SPI as a {@link Document}
	 */
	public Document getSpiDocument();
}
