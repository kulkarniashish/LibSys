package in.co.kbl.libsys.service;

import in.co.kbl.libsys.domain.User;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediaiq.dsp.service.AbstractCrudService;

@Path("/user/")
@Produces(MediaType.APPLICATION_JSON)
public interface UserService extends AbstractCrudService<User, Long> {

}
