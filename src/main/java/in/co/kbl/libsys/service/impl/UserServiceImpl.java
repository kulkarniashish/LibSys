
package in.co.kbl.libsys.service.impl;

import javax.ws.rs.Path;

import in.co.kbl.libsys.domain.User;
import in.co.kbl.libsys.repo.UserRepo;
import in.co.kbl.libsys.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.dsp.service.impl.AbstractCrudServiceImpl;

@Path("/user/")
@Service
public class UserServiceImpl extends
		AbstractCrudServiceImpl<User, Long, UserRepo> implements
		UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserRepo getRepository() {
		return userRepo;
	}
	
}
