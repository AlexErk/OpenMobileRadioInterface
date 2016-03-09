package org.universalradio.radioservice;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Interface to receive the decoded PCM audio stream
 *   
 * @author Sattler, IRT GmbH
 */
public interface RadioServiceAudiodataListener extends RadioServiceListener {

	/**
	 * PCM audio data interface
	 * @param pcmData the pcm data, encoded as interleaved signed 16 bit little endian PCM 
	 * @param numChannels the number of audio channels
	 * @param samplingRate the sampling rate
	 */
	public void pcmAudioData(byte[] pcmData, int numChannels, int samplingRate);
}
