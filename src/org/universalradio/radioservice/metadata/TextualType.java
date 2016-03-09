package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Textual metadata type definitions
 * 
 * @author Sattler, IRT GmbH
 */
public enum TextualType {

	/** Textual metadata received via DAB Dynamic Label service **/
	MATADATA_TEXTUAL_TYPE_DAB_DLS,
	/** Textual metadata received via RadioDNS RadioVIS Text service **/
	MATADATA_TEXTUAL_TYPE_RADIODNS_RADIOVIS,
	/** Textual metadata received via FM Radiotext **/
	MATADATA_TEXTUAL_TYPE_FM_RDS_RADIOTEXT,
	/** Textual metadata received via ID3 parsing **/
	MATADATA_TEXTUAL_TYPE_ID3_TEXT,
	/** Textual metadata received via Shoutcast ICY parsing **/
	MATADATA_TEXTUAL_TYPE_ICY_TEXT;	
}
