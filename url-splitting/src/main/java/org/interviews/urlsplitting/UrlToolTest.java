package org.interviews.urlsplitting;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class UrlToolTest {

	private static final String URL_WITH_A_PATH = "http://a.site.with/a-path";
	private static final String URL_WITHOUT_PATH = "http://a.site.without";

	@Test
	public void getProtocol_returns_expected_protocol() {
		// Given
		UrlTool tool = new UrlTool();

		// When
		final String protocol = tool.getProtocol(URL_WITH_A_PATH);

		// Then
		Assertions.assertThat(protocol).isEqualTo("http");
	}

	@Test
	public void getPath_returns_expected_path() {
		// Given
		UrlTool tool = new UrlTool();

		// When
		final String path = tool.getPath(URL_WITH_A_PATH);

		// Then
		Assertions.assertThat(path).isEqualTo("a-path");
	}

	@Test
	public void getPath_returns_empty_if_no_path() {
		// Given
		UrlTool tool = new UrlTool();

		// When
		final String path = tool.getPath(URL_WITHOUT_PATH);

		// Then
		Assertions.assertThat(path).isEmpty();
	}

	@Test
	public void getDomain_returns_expected_domain() {
		// Given
		UrlTool tool = new UrlTool();

		// When
		final String path = tool.getDomain(URL_WITH_A_PATH);

		// Then
		Assertions.assertThat(path).isEqualTo("a.site.with");
	}

}
