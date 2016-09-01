package com.flegler.jpostgrey2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class JPostgrey2 {

	@Autowired
	private ThreadPoolTaskExecutor pool;

	public JPostgrey2() {

	}

}
