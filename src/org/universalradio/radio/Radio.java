package org.universalradio.radio;

import java.util.List;

import org.universalradio.radio.impl.RadioImpl;
import org.universalradio.radioservice.RadioService;
import org.universalradio.tuner.Tuner;
import org.universalradio.tuner.TunerListener;
import org.universalradio.tuner.TunerType;

import android.content.Context;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * The main Radio class 
 * The implementer has to implement {@link RadioImpl} implementation
 * @author Sattler, IRT GmbH
 */
public abstract class Radio {

	/** the singleton instance of USRP Radio */
    private static Radio INSTANCE = new RadioImpl();
    
    /**
     * Returns the {@link Radio} instance or {@code null} if no implemented {@link Radio} instance is set
     * @return the {@link Radio} instance or {@code null} if no implemented {@link Radio} instance is set
     */
    public static Radio getInstance() {
    	return INSTANCE;
    }
    
    /**
     * Initializes the {@link Radio} instance
     * @return the {@link RadioErrorCode} indicating the success of init.
     */
    public abstract RadioErrorCode initialize();
    
    /**
     * Initializes the {@link Radio} instance with an Android {@link Context}
     * @param appContext the App Context
     * @return the {@link RadioErrorCode} indicating the success of init.
     */
    public abstract RadioErrorCode initialize(Context appContext);
        
    /**
     * Suspends the {@link Radio} and with it all {@link Tuner}s
     * @return a {@link RadioErrorCode} indicating the success of the suspend.
     */
    public abstract RadioErrorCode suspend();
    
    /**
     * Resumes the {@link Radio} to the previous state before it was suspended.  
     * @return a {@link RadioErrorCode} indicating the success of the resume
     */
    public abstract RadioErrorCode resume();
    
    /**
     * Indicates the current status of the {@link Radio}
     * @return the current {@link RadioStatus} 
     */
    public abstract RadioStatus getRadioStatus();
    
    /**
     * Deinitializes the Radio and all {@link Tuner}s
     */
    public abstract void deInitialize();
    
    /**
     * Returns the available {@link Tuner} devices or an empty list
     * @return the available {@link Tuner} devices or an empty list
     */
    public abstract List<Tuner> getAvailableTuners();
    
    /**
     * Returns the available {@link Tuner} devices for a specific {@link TunerType} or an empty list
     * @return the available {@link Tuner} devices for a specific {@link TunerType} or an empty list
     */
    public abstract List<Tuner> getAvailableTuners(TunerType tunerType);
    
	/**
	 * Retrieve the currently known {@link RadioService}s of this {@link Radio} device
	 * The method here is for the convenience of the application developer. 
	 * @return a list of {@link RadioService}s or an empty list
	 */
    public abstract List<RadioService> getRadioServices();
    
	/**
	 * Start a {@link RadioService} on an available tuner
	 * The method here is for the convenience of the application developer.
	 * @param radioService the {@link RadioService} to start
	 */
    public abstract void startRadioService(RadioService radioService);
    
	/**
     * Scans using all tuners and builds the combined service list.
     * The method here is for the convenience of the application developer.
     * If the application developer wants to perform service scans in the background
     * (in the case the Radio exposes more than on {@link Tuner} instances), it's recommended 
     * to use the dedicated method calls in the {@link Tuner} objects. 
	 */
	public abstract void startRadioServiceScan();
    
    /**
     * Initializes a specific {@link Tuner} device. You should listen to status changes with a registered {@link TunerListener}.
     * @param tuner the {@link Tuner} to initialize
     */
    public abstract void initializeTuner(Tuner tuner);
    
    /**
     * Deinitializes a specific {@link Tuner} device
     * @param tuner the {@link Tuner} to deinit
     */
    public abstract void deInitializeTuner(Tuner tuner);
}
