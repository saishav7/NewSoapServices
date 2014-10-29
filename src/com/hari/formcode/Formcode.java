package com.hari.formcode;

import com.sun.jersey.api.client.ClientResponse;

public class Formcode {
	public void doStuff() {
		if (request.getParameter("create-xml") != null) {
			String evID = request.getParameter("eventIdToXML");
			if (evID != null) {
				ClientResponse response = 
						service
						.path("events")
						.path(evId)
						.header("Auth", "abc123")
						.put(ClientResponse.class);
			}
		} else if (request.getParameter("xml-query") != null) {
			String id = request.getParameter("eventIdToQuery");
			String type = request.getParameter("queryType");
			if (id != null && type != null) {
				ClientResponse response = 
						service
						.path("events")
						.path(evId)
						.path(queryType)
						.header("Auth", "abc123")
						.get(ClientResponse.class);
			}
		}
	}
			
}
