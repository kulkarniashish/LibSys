/**
 * 
 */
package in.co.kbl.libSys.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Date;

import in.co.kbl.libsys.domain.Book;
import in.co.kbl.libsys.domain.User;
import in.co.kbl.libsys.service.BookService;
import in.co.kbl.libsys.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ashish
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:libsys-service-context.xml")
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void addUserRecord() {
		
		User user = new User(1L, "user1", new Date());
		User saveResponse = userService.save(user);
		assertNotNull(saveResponse);
		assertThat(saveResponse.getId(), is(1L));
	}

	@Test
	public void getUserById() {
		User user = userService.getById(1L);
		assertNotNull(user);
		assertThat(user.getId(), is(1L));
	}

	
}
