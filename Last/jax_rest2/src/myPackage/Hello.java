package myPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//Sets the path to base URL + /hello
//@Path("")
@Path("/Hello")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Jersey1";
  }

  // This method is called if XML is request
  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey2" + "</hello>";
  }

  // This method is called if HTML is request
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello(@QueryParam("name") String name) {
	    
	  System.out.println ("Name is "+name);
    return "<html> " + "<title>" + "Hello Jersey" + name + "</title>"
        + "<body><h1>" + "Hello " + name + " From Rest Webservices </body></h1>" + "</html> ";
  }
  
  @GET
    public String returnName(String firstName) {
    return "Hello "+ firstName;
  }
} 