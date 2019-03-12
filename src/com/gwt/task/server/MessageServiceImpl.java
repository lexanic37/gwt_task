package com.gwt.task.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwt.task.client.MessageService;






@SuppressWarnings("serial")
public class MessageServiceImpl extends RemoteServiceServlet implements MessageService {
	
	
	
	
	
	public String getMessage(String input) throws IllegalArgumentException {
	    String message = "asdasd";
	    return message;
	}
}
	
