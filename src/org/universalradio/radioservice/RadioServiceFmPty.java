package org.universalradio.radioservice;

/**
 * Abstract class representing a RDS PTY (Rogramme Type)
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceFmPty {

	/**
	 * Returns the PTY code
	 * @return the PTY code
	 */
	public int getPtyCode();
	
	/**
	 * Returns a human readable representation of the PTY code 
	 * @return a human readable representation of the PTY code
	 */
	public String getPtyDescription();
}
