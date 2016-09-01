package com.flegler.jpostgrey2;

import java.io.IOException;
import java.net.Socket;

import org.junit.Assert;
import org.junit.Test;

public class JPostgreyTest {

	@Test
	public void testOpenSocket() {
		JPostgrey2 jpostgrey = new JPostgrey2();
		try (Socket socket = new Socket("localhost", 9876)) {
			Assert.assertTrue(socket.isBound());
		} catch (IOException exception) {
			Assert.fail();
		}

	}

}
