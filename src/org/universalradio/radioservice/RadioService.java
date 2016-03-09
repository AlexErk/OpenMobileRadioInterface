package org.universalradio.radioservice;

import java.util.List;

import org.universalradio.radioservice.metadata.Group;
import org.universalradio.radioservice.metadata.Location;
import org.universalradio.radioservice.metadata.TermID;
import org.universalradio.radioservice.metadata.Visual;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Abstract base class for a radio service
 * @author Sattler, IRT GmbH
 * @author Erk, IRT GmbH
 */
public interface RadioService {

	/**
	 * Indicates the type of this RadioService
	 * @return the {@link RadioServiceType} of this RadioService
	 */
	public RadioServiceType getRadioServicetype();
	
	/**
	 * Returns the short description of this {@link RadioService} as {@link String} 
	 * @return The short description of this {@link RadioService} as {@link String}
	 */
	public String getShortDescrition();

	/**
	 * Returns the long description of this {@link RadioService} as {@link String} 
	 * @return The long description of this {@link RadioService} as {@link String}
	 */
	public String getLongDescrition();
	
    /**
     * Returns the available {@link Visual}s for this {@link RadioService} or an empty list
     * @return the available {@link Visual}s for this {@link RadioService} or an empty list
     */
	public List<Visual> getLogos();
	
    /**
     * Returns the available {@link TermID}s for this {@link RadioService} or an empty list
     * @return the available {@link TermID}s for this {@link RadioService} or an empty list
     */
	public List<TermID> getGenres();
	
    /**
     * Returns the available Links for this {@link RadioService} or an empty list
     * @return the available Links for this {@link RadioService} or an empty list
     */
	public List<String> getLinks();
	
    /**
     * Returns the available {@link Location}s for this {@link RadioService} or an empty list
     * @return the available {@link Location}s for this {@link RadioService} or an empty list
     */
	public List<Location>getLocations();
	
    /**
     * Returns the available keywords for this {@link RadioService} or an empty list
     * @return the available keywords for this {@link RadioService} or an empty list
     */
	public List<String> getKeywords();

    /**
     * Returns the available {@link Group}s for this {@link RadioService} or an empty list
     * @return the available {@link Group}s for this {@link RadioService} or an empty list
     */
	public List<Group> getMemberships();
	
	/**
	 * Subscribe a {@link RadioServiceListener} to receive updates from this {@link RadioService}
	 * @param radioServiceListener the {@link RadioServiceListener} to subscribe
	 */
	public void subscribe(RadioServiceListener radioServiceListener);
	
	/**
	 * Unsubscribe a {@link RadioServiceListener} from this {@link RadioService}
	 * @param radioServiceListener the {@link RadioServiceListener} to unsubscribe
	 */
	public void unsubscribe(RadioServiceListener radioServiceListener);
}
