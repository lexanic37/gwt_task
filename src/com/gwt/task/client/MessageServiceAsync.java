package com.gwt.task.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MessageServiceAsync {
	   void getMessage(String input, AsyncCallback<String> callback);
	}

