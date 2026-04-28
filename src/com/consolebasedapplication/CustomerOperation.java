package com.consolebasedapplication;

public interface CustomerOperation {
	

	    void register(String name, String email, String password);

	    boolean login(String email, String password);
	}


