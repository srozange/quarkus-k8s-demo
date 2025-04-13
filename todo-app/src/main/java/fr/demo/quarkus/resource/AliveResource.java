package fr.demo.quarkus.resource;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alive")
public class AliveResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String status() {
		return "Status : OK - IP : " + getIp();
	}

	private static final String getIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			return "error getting ip address";
		}
	}

}