package in.co.kbl.libsys.service.impl;

import in.co.kbl.libsys.domain.Book;
import in.co.kbl.libsys.domain.User;
import in.co.kbl.libsys.domain.UserRentedBooks;
import in.co.kbl.libsys.model.DateRange;
import in.co.kbl.libsys.repo.BookRepo;
import in.co.kbl.libsys.repo.UserRentedBooksRepo;
import in.co.kbl.libsys.repo.UserRepo;
import in.co.kbl.libsys.service.BookRentingService;

import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.dsp.service.impl.AbstractCrudServiceImpl;

@Path("/lend/")
@Service
public class BookRentingServiceImpl extends
		AbstractCrudServiceImpl<UserRentedBooks, Long, UserRentedBooksRepo>
		implements BookRentingService {

	@Autowired
	private UserRentedBooksRepo userRentedBooksRepo;
	
	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserRentedBooksRepo getRepository() {
		return userRentedBooksRepo;
	}

	@POST
	@Path("/book/{bookId}/user/{userId}")
	@Produces("application/json")
	public void lendBookToUser(@PathParam("bookId") Long bookId,
			@PathParam("userId") Long userId) {
		
		//Get User
		User user = userRepo.findOne(userId);
		
		//Get Book
		Book book = bookRepo.findOne(bookId);		
		
		//Save in History
		UserRentedBooks userRentedBooks = new UserRentedBooks();
		userRentedBooks.setBook(book);
		userRentedBooks.setUser(user);
		userRentedBooks.setRentedDate(new DateRange());
		userRentedBooks.setReturnedDate(new Date());
		userRentedBooksRepo.save(userRentedBooks);
		
		//Update userId in book table
		book.setUser(user);
		bookRepo.save(book);
	}

}
