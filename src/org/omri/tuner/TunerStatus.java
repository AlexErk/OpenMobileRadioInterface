package org.omri.tuner;

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
 * Status codes for the {@link Tuner} 
 * @author Fabian Sattler, IRT GmbH
 */
public enum TunerStatus {

	/** Tuner is not initialized **/
	STATUS_TUNER_NOT_INITIALIZED(0, "Tuner not initialized"),
	/** Tuner is ready **/
	STATUS_TUNER_INITIALIZED(1, "Tuner ready"),
	/** Tuner is in an error state **/
	STATUS_TUNER_ERROR(2, "Tuner is in an error state"),
	/** Tuner is in suspended state **/
	STATUS_TUNER_SUSPENDED(3, "Tuner is suspended"),
	/** Tuner started scan for services **/
	STATUS_TUNER_SCAN_STARTED(4, "Tuner is scanning for services"),
	/** Tuner is in scanning progress **/
	STATUS_TUNER_SCANNING(5, "Tuner is scanning for services"),
	/** Tuner finished scan for services **/
	STATUS_TUNER_SCAN_FINISHED(6, "Tuner scan finished");	
	
	private final int statusCode;
	private final String statusDescription;
	
	private TunerStatus(int statusCode, String statusDescription) {
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
	public String getStatusDescription() {
		return this.statusDescription;
	}
}
