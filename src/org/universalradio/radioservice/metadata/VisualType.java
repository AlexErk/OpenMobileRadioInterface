package org.universalradio.radioservice.metadata;

/**
 * Copyright (C) IRT - Institut für Rundfunktechnik 2015
 * 
 * Visual type definition
 * @author Sattler, IRT GmbH
 */
public enum VisualType {

	/** Visual metadata received via DAB Slideshow service **/
	MATADATA_VISUAL_TYPE_DAB_SLS,
	/** Visual metadata received via RadioDNS RadioVIS service **/
	MATADATA_VISUAL_TYPE_RDNS_RADIOVIS,
	/** Visual metadata received via ID3 tag **/
	MATADATA_VISUAL_TYPE_ID3_COVERART;
}
