package org.universalradio.radioservice.metadata;

import java.net.URI;
import java.util.Calendar;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract class for a DAB Slideshow {@link Visual} metadata
 * 
 * @author Sattler, IRT GmbH
 */
public interface VisualDABSlideShow extends Visual {
	
	/**
	 * Indicates if this {@link VisualDABSlideShow} has categorization information
	 * @return indication for categorization
	 */
	public boolean isCategorized();
	
	/**
	 * The content name.
	 * @return the content name
	 */
	public String getContentName();
	
	/**
	 * The ID of this {@link VisualDABSlideShow}
	 * @return the ID
	 */
	public int getSlideId();
	
	/**
	 * The Triggertime
	 * @return a Calendar for the Triggertime or {@code 'null'} if the triggertime is {@code 'now'}
	 */
	public Calendar getTriggerTime();
	
	/**
	 * Returns the category description of this {@link VisualDABSlideShow}. Only applicable for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the category text or an empty {@link String} if it's not a categorized VisualDABSlideShow
	 */
	public String getCategoryText();
	
	/**
	 * Returns the category id of this {@link VisualDABSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the category id or '-1' if it's not a categorized VisualDABSlideShow
	 */
	public int getCategoryId();
	
	/**
	 * Returns the link associated with this {@link VisualDABSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the link associated with this {@link VisualDABSlideShow} or an empty {@link String}
	 */
	public URI getLink();
	
	/**
	 * Returns the click through link associated with this {@link VisualDABSlideShow}. Only applicable for for a DAB Categorized Slideshow (check 'isCategorized()')
	 * @return the click through link associated with this {@link VisualDABSlideShow} or an empty {@link String}
	 */
	public URI getClickThroughUrl();
}
