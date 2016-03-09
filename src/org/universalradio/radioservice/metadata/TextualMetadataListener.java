package org.universalradio.radioservice.metadata;

import org.universalradio.radioservice.RadioServiceListener;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive {@link Textual} programme associated metadata
 *   
 * @author Sattler, IRT GmbH
 */
public interface TextualMetadataListener extends RadioServiceListener {

	/**
	 * New {@link Textual} metadata was received
	 * @param textualMetadata the {@link Textual} received
	 */
	public void newTextualMetadata(Textual textualMetadata);
}
