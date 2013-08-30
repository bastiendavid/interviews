package org.interviews.urlsplitting;

import java.net.URI;

public class ProtocolStrategy implements Strategy {

	public String apply(URI uri) {
		return uri.getScheme();
	}

}
