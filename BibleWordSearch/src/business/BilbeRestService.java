package business;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@RequestScoped
@Path("bible")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class BilbeRestService {
	
	@Inject
	WordBusinessInterface service;
	
	
	//Gets json API at API URI that produces JSON response using HTTP GET
		@GET
		@Path("/getjson")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Order> getOrdersAsJson()
		{
			return service.getOrders();
		}
		//Gets XML API at API URI that produces SML response using HTTP GET
		@GET
		@Path("/getxml")
		@Produces(MediaType.APPLICATION_XML)
		public Order[] getOrdersAsXml()
		{
			List<Order> orders = service.getOrders();
			return orders.toArray(new Order[orders.size()]);
		}

}
