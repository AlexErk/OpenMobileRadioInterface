package org.universalradio.radioservice.metadata;

import org.universalradio.radioservice.RadioServiceListener;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive {@link Visual} programme associated metadata
 *   
 * @author Sattler, IRT GmbH
 */
public interface VisualMetadataListener extends RadioServiceListener {

	/**
	 * New {@link Visual} metadata was received
	 * @param visualMetadata the {@link Visual} received
	 */
	public void newVisualMetadata(Visual visualMetadata);
}
