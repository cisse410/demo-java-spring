package sn.uidt.cisse410.service;

import org.springframework.stereotype.Component;

import sn.uidt.cisse410.model.Welcome;

@Component
public class BusnessService {
	public Welcome getWelcome() {
		Welcome welcome = new Welcome();
		return welcome;
	}
}
