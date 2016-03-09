package org.universalradio.radioservice;

import org.universalradio.radio.RadioListener;
import org.universalradio.radioservice.metadata.ProgrammeServiceMetadataListener;
import org.universalradio.radioservice.metadata.TextualMetadataListener;
import org.universalradio.radioservice.metadata.VisualMetadataListener;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive updates for {@link RadioService} related informations
 * @author Sattler, IRT GmbH
 *
 * @see ProgrammeServiceMetadataListener
 * @see TextualMetadataListener
 * @see VisualMetadataListener
 */
public interface RadioServiceListener extends RadioListener {

}
