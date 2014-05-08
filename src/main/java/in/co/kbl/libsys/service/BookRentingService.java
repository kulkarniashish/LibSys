package in.co.kbl.libsys.service;

import in.co.kbl.libsys.domain.UserRentedBooks;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediaiq.dsp.service.AbstractCrudService;

@Path("/lend")
@Produces(MediaType.APPLICATION_JSON)
public interface BookRentingService extends
		AbstractCrudService<UserRentedBooks, Long> {
	
	@POST
	@Path("/lend/user/{userId}/book/{bookId}")
	@Produces("application/json")
	void lendBookToUser(@PathParam("userId") Long userId, 
							@PathParam("bookId") Long bookId);
}
