package org.interviews.urlsplitting;

import java.net.URI;

public class DomainStrategy implements Strategy {

	public String apply(URI uri) {
		return uri.getAuthority();
	}

}
