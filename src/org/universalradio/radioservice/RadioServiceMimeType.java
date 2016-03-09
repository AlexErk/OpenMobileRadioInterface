package org.universalradio.radioservice;

public enum RadioServiceMimeType {

	/** MIME type not known **/
	UNKNOWN("mime/unknown"),
	/** MIME type for MPEG 1 Layer 1, 2, 3 **/
	AUDIO_MPEG("audio/mpeg"),
	/** MIME type for OGG Vorbis audio **/
	AUDIO_OGG_VORBIS("audio/ogg"),
	/** MIME type for Free Losless Audio Codec **/
	AUDIO_FLAC("audio/flac"),
	/** MIME type ADTS AAC **/
	AUDIO_AAC("audio/aacp");
	
    private final String contentTypeString;
    
    private RadioServiceMimeType(String contentTypeString) {
    	this.contentTypeString = contentTypeString;
    }
    
    public String getMimeTypeString() {
    	return this.contentTypeString;
    }
}
