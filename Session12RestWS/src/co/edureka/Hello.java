package co.edureka;
import javax.ws.rs.Path;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import org.glassfish.jersey.servlet.ServletContainer;



@Path("/Hello")
public class Hello {
	
	
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		String response="this is Awesome";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		String response="<html><body><h2>This is awesome !!</h2></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		String response="<?xml version='1.0'?><hello>This is about hello xml</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJsonHello() {
		String response="{'name':'rudresh',age:32,address:'kharghar'}";
		return response;
	}
	
}
