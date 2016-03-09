package org.universalradio.radio.impl;

import java.util.List;

import org.universalradio.radio.Radio;
import org.universalradio.radio.RadioErrorCode;
import org.universalradio.radio.RadioStatus;
import org.universalradio.radioservice.RadioService;
import org.universalradio.tuner.Tuner;
import org.universalradio.tuner.TunerType;

import android.content.Context;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * This is the main entry class for anyone who wants to implement the Universal Radio API. 
 * @author Sattler, IRT GmbH
 */
public class RadioImpl extends Radio {

	@Override
	public RadioErrorCode initialize() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioErrorCode suspend() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioErrorCode resume() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public RadioStatus getRadioStatus() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public void deInitialize() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public List<Tuner> getAvailableTuners() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public List<Tuner> getAvailableTuners(TunerType tunerType) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}

	@Override
	public List<RadioService> getRadioServices() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		return null;
	}
	


	@Override
	public void deInitializeTuner(Tuner tuner) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public RadioErrorCode initialize(Context appContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initializeTuner(Tuner tuner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startRadioService(RadioService radioService) {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

	@Override
	public void startRadioServiceScan() {
		// TODO Auto-generated method stub. To be implemented by API middleware provider.
		
	}

}
