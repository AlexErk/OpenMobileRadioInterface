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
 * Abstract base class for visual metadata (e.g. DAB SLS, RadioDNS RadioVIS, ID3 Coverart)
 * @author Fabian Sattler, IRT GmbH
 */
public interface Visual {

	/**
	 * Returns the type (source) of this visual metadata (e.g. DAB Slideshow, RadioDNS RadioVIS, etc.)
	 * @return the type of this visual metadata
	 */
	public VisualType getVisualType();
	
	/**
	 * Returns the type of this visual metadata
	 * @return the type of this visual metadata
	 */
	public VisualMimeType getVisualMimeType();
	
	/**
	 * Returns the width of this visual metadata
	 * @return the width of this visual metadata
	 */
	public int getWidth();
	
	/**
	 * Returns the height of this visual metadata
	 * @return the height of this visual metadata
	 */
	public int getHeight();
	
	/**
	 * Returns the actual image data
	 * @return the actual image data
	 */
	public byte[] getVisualData();
}
