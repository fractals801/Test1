package clases;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/qloco")
public class uno {

	@Produces({MediaType.TEXT_PLAIN})
	@Path("/hola")
	@GET
	public String hola(){
		
		return "reloco";
	}
}
