package org.universalradio.tuner;

import org.universalradio.radio.RadioListener;
import org.universalradio.radioservice.RadioService;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * The {@link Tuner} listener interface
 * @author Sattler, IRT GmbH
 */
public interface TunerListener extends RadioListener {

	/**
	 * Tuner changed its operating state
	 * @param newState the new {@link TunerStatus}
	 */
	public void tunerStateChanged(Tuner tuner, TunerStatus newState);
	
	/**
	 * A {@link RadioService} started
	 * @param startedRadioService the {@link RadioService} which has started
	 */
	public void radioServiceStarted(Tuner tuner, RadioService startedRadioService);
	
	/**
	 * A {@link RadioService} stopped
	 * @param stoppedRadioService the {@link RadioService} which has stopped
	 */
	public void radioServiceStopped(Tuner tuner, RadioService stoppedRadioService);
	
	/**
	 * Updates on RF reception statistics
	 * @param rfLock RF tuner frontend gained lock
	 * @param rssi the Received Signal Strength Indicator (in dbµV ???)
	 */
	public void tunerReceptionStatistics(Tuner tuner, boolean rfLock, int rssi);
}
