package org.omri.radioservice.metadata;

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
 * Abstract class for a IP delivered RadioDNS RadioVis {@link Visual} metadata
 * 
 * @author Fabian Sattler, IRT GmbH
 */
public interface VisualIpRdnsRadioVis extends Visual {

	/**
	 * Returns the Triggertime as POSIX time (seconds elapsed since 1.1.1970)
	 * @return the Triggertime as POSIX time
	 */
	public long getTriggerTime();
}
