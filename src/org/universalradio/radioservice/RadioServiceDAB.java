package org.universalradio.radioservice;

import java.util.List;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class for a DAB {@link RadioService}
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceDAB extends RadioService {
	
	/**
	 * Returns the extended country code (ECC) for the DAB Ensemble this {@link RadioServiceDAB} belongs to
	 * @return the extended country code (ECC) for the DAB Ensemble this {@link RadioServiceDAB} belongs to
	 */
	public String getEnsembleEcc();
	
	/**
	 * Returns the DAB Ensemble ID, this {@link RadioServiceDAB} belongs to, as hex-string
	 * @return the DAB Ensemble ID, this {@link RadioServiceDAB} belongs to, as hex-string
	 */
	public String getEnsembleId();
	
	/**
	 * Returns the label of the DAB Ensemble, this {@link RadioServiceDAB} belongs to
	 * @return the label of the DAB Ensemble, this {@link RadioServiceDAB} belongs to
	 */
	public String getEnsembleLabel();
	
	/**
	 * Returns the frequency in kHz of the DAB Ensemble, this {@link RadioServiceDAB} belongs to
	 * @return the frequency in kHz of the DAB Ensemble, this {@link RadioServiceDAB} belongs to
	 */
	public long getEnsembleFrequency();
	
	/**
	 * Returns the label of this {@link RadioServiceDAB}
	 * @return the label of this {@link RadioServiceDAB}
	 */
	public String getServiceLabel();
	
	/**
	 * Returns the service id as hex-string
	 * @return the service id as hex-string
	 */
	public String getServiceId();
	
	/**
	 * Returns the service extended country code
	 * @return the service extended country code
	 */
	public String getServiceEcc();
	
	/**
	 * Indicates if this {@link RadioServiceDAB} is a DAB programme or a DAB data service  
	 * @return indication for programme or data service
	 */
	public boolean isProgrammeService();
	
	/**
	 * Returns a list with the {@link RadioServiceDABComponent}s associated with this {@link RadioServiceDAB}
	 * @return a list with the {@link RadioServiceDABComponent}s associated with this {@link RadioServiceDAB}
	 */
	public List<RadioServiceDABComponent> getServiceComponents();
	

}
