/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.api;

import static org.junit.Assert.*;
import static org.springframework.http.HttpMethod.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import org.junit.Test;
import org.springframework.http.MediaType;

public class VideoActionsTemplateTest extends AbstractFacebookApiTest {

	@Test
	public void watchMovie() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.watches")))
			.andExpect(method(POST))
			.andExpect(content().string("movie=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().watchMovie("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void watchTvShow() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.watches")))
			.andExpect(method(POST))
			.andExpect(content().string("tv_show=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().watchTvShow("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void watchTvEpisode() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.watches")))
			.andExpect(method(POST))
			.andExpect(content().string("tv_episode=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().watchTvEpisode("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void watchEpisode() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.watches")))
			.andExpect(method(POST))
			.andExpect(content().string("episode=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().watchEpisode("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void watchVideo() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.watches")))
			.andExpect(method(POST))
			.andExpect(content().string("video=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().watchVideo("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void rateMovie() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.rates")))
			.andExpect(method(POST))
			.andExpect(content().string("movie=https%3A%2F%2Fsamples.ogp.me%2F226075010839791&rating%3Avalue=3.2&rating%3Ascale=5"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().rateMovie("https://samples.ogp.me/226075010839791", 3.2f, 5);
		assertEquals("123456789080", actionId);
	}

	@Test
	public void rateTvShow() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.rates")))
			.andExpect(method(POST))
			.andExpect(content().string("tv_show=https%3A%2F%2Fsamples.ogp.me%2F226075010839791&rating%3Avalue=3.2&rating%3Ascale=5"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().rateTvShow("https://samples.ogp.me/226075010839791", 3.2f, 5);
		assertEquals("123456789080", actionId);
	}

	@Test
	public void rateEpisode() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.rates")))
			.andExpect(method(POST))
			.andExpect(content().string("episode=https%3A%2F%2Fsamples.ogp.me%2F226075010839791&rating%3Avalue=3.2&rating%3Ascale=5"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().rateEpisode("https://samples.ogp.me/226075010839791", 3.2f, 5);
		assertEquals("123456789080", actionId);
	}

	@Test
	public void rateVideo() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.rates")))
			.andExpect(method(POST))
			.andExpect(content().string("other=https%3A%2F%2Fsamples.ogp.me%2F226075010839791&rating%3Avalue=3.2&rating%3Ascale=5"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().rateVideo("https://samples.ogp.me/226075010839791", 3.2f, 5);
		assertEquals("123456789080", actionId);
	}

	@Test
	public void wantsToWatchMovie() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.wants_to_watch")))
			.andExpect(method(POST))
			.andExpect(content().string("movie=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().wantsToWatchMovie("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void wantsToWatchTvShow() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.wants_to_watch")))
			.andExpect(method(POST))
			.andExpect(content().string("tv_show=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().wantsToWatchTvShow("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void wantsToWatchEpisode() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.wants_to_watch")))
			.andExpect(method(POST))
			.andExpect(content().string("episode=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().wantsToWatchEpisode("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

	@Test
	public void wantsToWatchVideo() throws Exception {
		mockServer.expect(requestTo(fbUrl("me/video.wants_to_watch")))
			.andExpect(method(POST))
			.andExpect(content().string("other=https%3A%2F%2Fsamples.ogp.me%2F226075010839791"))
			.andExpect(header("Authorization", "OAuth someAccessToken"))
			.andRespond(withSuccess("{\"id\": \"123456789080\"}", MediaType.APPLICATION_JSON));

		String actionId = facebook.openGraphOperations().videoActions().wantsToWatchVideo("https://samples.ogp.me/226075010839791");
		assertEquals("123456789080", actionId);
	}

}
