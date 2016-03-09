package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class containing information about one DL+ tag
 * @author Sattler, IRT GmbH
 */
public interface TextualDABDynamicLabelPlusItem {

	/**
	 * Returns the {@link TextualDABDynamicLabelPlusContentType}
	 * @return the {@link TextualDABDynamicLabelPlusContentType}
	 */
	public TextualDABDynamicLabelPlusContentType getDynamicLabelPlusContentType();
	
	/**
	 * Returns a textual description of the content type
	 * @return a textual description of the content type
	 */
	public String getDlPlusContentTypeDescription();
	
	/**
	 * Returns the content category of this tag
	 * @return the content category of this tag
	 */
	public String getDlPlusContentCategory();
	
	/**
	 * Returns the text of this DL+ tag
	 * @return the text of this DL+ tag
	 */
	public String getDlPlusContentText();
}
