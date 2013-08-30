package org.interviews.urlsplitting;

import java.net.URI;

public class PathStrategy implements Strategy {

	public String apply(URI uri) {
		String strRet;
		strRet = uri.getPath();
		if (!strRet.isEmpty()) {
			strRet = strRet.substring(1);
		}
		return strRet;
	}

}
