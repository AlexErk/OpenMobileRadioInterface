package org.universalradio.radioservice;

public interface RadioServiceFm extends RadioService {

	/**
	 * Returns the frequency in kHz for this {@link RadioService} (e.g. 99300000 for a frequency of 99.3 MHz)
	 * @return the frequency in kHz
	 */
	public int getFrequency();
	
	/**
	 * Returns the RDS PI (Programme Identification) code for this Service if available (e.g. 'D412'), or an empty String
	 * @return the RDS PI code as a hexadecimal String representation 
	 */
	public String getRdsPiCode();
	
	/**
	 * Returns a {@link RadioServiceFmPty} for this {@link RadioService} if available, or {@code null}
	 * @return a {@link RadioServiceFmPty} for this {@link RadioService}
	 */
	public RadioServiceFmPty getRdsPty();
}
