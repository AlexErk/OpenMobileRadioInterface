package org.universalradio.tuner;

import java.util.List;

import org.universalradio.radioservice.RadioService;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract Tuner class
 * @author Sattler, IRT GmbH
 */
public interface Tuner {

	/**
	 * Initializes the Tuner. This call is asynchronously. Register a {@link TunerListener} for updates on the {@link TunerStatus}.
	 */
	public void initializeTuner();
	
	/**
	 * Suspends the tuner. Keeping its current status to be resumed later.
	 */
	public void suspendTuner();
	
	/**
	 * Resume the suspended tuner to the last state.
	 */
	public void resumeTuner();
	
	/**
	 * De-Initializes the tuner.
	 */
	public void deInitializeTuner();
	
	/**
	 * Indicates the type of tuner
	 * @return the {@link TunerType} of this {@link Tuner}
	 */
	public TunerType getTunerType();
	
	/**
	 * Indicates the current status of the {@link Tuner} device
	 * @return the current {@link TunerStatus}
	 */
	public TunerStatus getTunerStatus();
	
	/**
	 * Retrieve the currently known {@link RadioService}s of this {@link Tuner}
	 * @return a list of {@link RadioService}s or an empty list
	 */
	public List<RadioService> getRadioServices();
	
	/**
	 * Start a scan for available {@link RadioService}s
	 */
	public void startRadioServiceScan();
	
	/**
	 * Stops a currently running {@link RadioService} scan
	 */
	public void stopRadioServiceScan();
		
	/**
	 * Start a {@link RadioService} on this tuner
	 * @param radioService the {@link RadioService} to start
	 */
	public void startRadioService(RadioService radioService);
	
	/**
	 * Stop the currently running {@link RadioService} on this tuner
	 */
	public void stopService();

	/**
	 * Retrieve the currently running {@link RadioService}
	 * @return the currently running {@link RadioService} or {@code null} if no {@link RadioService} is running
	 */
	public RadioService getCurrentRunningRadioService();
	
	/**
	 * Subscribe a {@link TunerListener} to receive updates of this tuner
	 * @param tunerListener the {@link TunerListener} to subscribe
	 */
	public void subscribe(TunerListener tunerListener);
	
	/**
	 * Unsubscribe a {@link TunerListener}
	 * @param tunerListener the {@link TunerListener} to unsubscribe
	 */
	public void unsubscribe(TunerListener tunerListener);
}
