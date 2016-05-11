package org.universalradio.radioservice;

import java.util.List;

/**
 * Copyright (C) 2016 Open Mobile Radio Interface (OMRI) Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Abstract class for a DAB {@link RadioService}
 * @author Fabian Sattler, IRT GmbH
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
