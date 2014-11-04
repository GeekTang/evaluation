package com.fd.akka;

public interface Proxy {

	StatusInfo getStatus();
	
	void stop();
	
	void start();
	
	String getName();
}
