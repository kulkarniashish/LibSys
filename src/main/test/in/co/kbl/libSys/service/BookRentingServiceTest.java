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
import in.co.kbl.libsys.domain.UserRentedBooks;
import in.co.kbl.libsys.model.DateRange;
import in.co.kbl.libsys.service.BookRentingService;

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
public class BookRentingServiceTest {

	@Autowired
	BookRentingService bookRentingService;

	@Test
	public void getAllUsersRentedBooks() {
//		UserRentedBooks userRentedBooks = bookRentingService.getById(1L);
//		assertNotNull(userRentedBooks);
//		assertThat(userRentedBooks.getId(), is(1L));
	}

	@Test
	public void addUserRentBookRecord() {
		User user = new User(1L, "AAA", new Date());
		Book book = new Book(1L, "book1", "author1", "pub1", user);
		
		UserRentedBooks userRentedBooks = new UserRentedBooks();
		userRentedBooks.setId(101L);
		userRentedBooks.setUser(user);
		userRentedBooks.setBook(book);
		userRentedBooks.setRentedDate(new DateRange());
		userRentedBooks.setReturnedDate(new java.util.Date());
		UserRentedBooks userRentedBooksResponse = bookRentingService.save(userRentedBooks);
		assertNotNull(userRentedBooksResponse);
		assertThat(userRentedBooksResponse.getId(), is(101L));
	}

	@Test
	public void lendBookToUser() {
		Long userId = 1L;	
		Long bookId = 1L;
		User user = new User(userId, "AAA", new Date());
		Book book = new Book(bookId, "book1", "author1", "pub1", user);
		
		bookRentingService.lendBookToUser(bookId, userId);
		
	}
}
