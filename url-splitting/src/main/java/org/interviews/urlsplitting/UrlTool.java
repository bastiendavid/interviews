package org.interviews.urlsplitting;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlTool {

	public String getProtocol(final String i_urlValue) {
		Strategy strategy = new ProtocolStrategy();
		return getElement(i_urlValue, strategy);
	}

	public String getPath(final String i_urlValue) {
		Strategy strategy = new PathStrategy();
		return getElement(i_urlValue, strategy);
	}

	public String getDomain(final String i_urlValue) {
		Strategy strategy = new DomainStrategy();
		return getElement(i_urlValue, strategy);
	}

	private String getElement(final String i_urlValue, Strategy strategy) {
		String strRet = null;
		if (i_urlValue != null) {
			try {
				URI uri = new URI(i_urlValue);
				strRet = strategy.apply(uri);
				uri = null;
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}

		return strRet;
	}
}