package org.universalradio.radioservice.metadata;

import java.util.List;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class for a DAB Dynamic Label (Plus) {@link Textual} metadata
 * 
 * @author Sattler, IRT GmbH
 */
public interface TextualDABDynamicLabel extends Textual {
	
	/**
	 * Indicates if this {@link TextualDABDynamicLabel} has DL+ tags
	 * @return indication of DL+ tags
	 */
	public boolean hasTags();
	
	/**
	 * Returns the number of tags. Only applicable for DL+. Check 'hasTags()'
	 * @return the number of tags
	 */
	public int getTagCount();
	
	/**
	 * Returns a list of {@link TextualDABDynamicLabelPlusItem}s or an empty list
	 * @return a list of {@link TextualDABDynamicLabelPlusItem}s or an empty list
	 */
	public List<TextualDABDynamicLabelPlusItem> getDlPlusItems();
}
