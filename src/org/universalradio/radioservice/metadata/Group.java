package org.universalradio.radioservice.metadata;

import java.util.List;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract base class for a radio service
 * @author Sattler, IRT GmbH
 * @author Erk, IRT GmbH
 */

public interface Group {

	/**
	 * Returns the CRID of this {@link Group}
	 * @return the CRID of this {@link Group}
	 */
	public String getCRID();
		
	/**
	 * Returns the short name of this {@link Group} as {@link String} 
	 * @return The short name  of this {@link Group} as {@link String}
	 */
	public String getShortName();
		
	/**
	 * Returns the medium name of this {@link Group} as {@link String} 
	 * @return The medium name  of this {@link Group} as {@link String}
	 */
	public String getMediumName();
		
	/**
	 * Returns the long name of this {@link Group} as {@link String} 
	 * @return The long name of this {@link Group} as {@link String}
	 */
	public String getLongName();

	/**
	 * Returns the short description of this {@link Group} as {@link String} 
	 * @return The short description of this {@link Group} as {@link String}
	 */
	public String getShortDescription();

	/**
	 * Returns the medium description of this {@link Group} as {@link String} 
	 * @return The medium description of this {@link Group} as {@link String}
	 */
	public String getMediumDescription();

    /**
     * Returns the available {@link Visual}s for this {@link Group} or an empty list
     * @return the available {@link Visual}s for this {@link Group} or an empty list
     */
	public List<Visual> getLogos();
	
    /**
     * Returns the available {@link TermID}s for this {@link Group} or an empty list
     * @return the available {@link TermID}s for this {@link Group} or an empty list
     */
	public List<TermID> getGenres();
    
	/**
     * Returns the available Links for this {@link Group} or an empty list
     * @return the available Links for this {@link Group} or an empty list
     */
	public List<String> getLinks();
	
	   /**
     * Returns the available keywords for this {@link Group} or an empty list
     * @return the available keywords for this {@link Group} or an empty list
     */
	public List<String> getKeywords();
}
