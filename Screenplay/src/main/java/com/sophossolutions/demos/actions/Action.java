package com.sophossolutions.demos.actions;

import net.serenitybdd.core.time.InternalSystemClock;

public class Action {

	public static void waitForSecond(int seconds) {
		new InternalSystemClock().pauseFor(1000 * seconds);
	}
}
