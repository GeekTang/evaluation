package com.fd.akka;

import java.io.Serializable;

public abstract class AkkaProxy implements Proxy{

	public StatusInfo getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	abstract public String getName();
	
	protected Object execute(String sName, Serializable request, long timeOut){
		return timeOut;
	}

}
