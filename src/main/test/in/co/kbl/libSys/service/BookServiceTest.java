/**
 * 
 */
package in.co.kbl.libSys.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import in.co.kbl.libsys.domain.Book;
import in.co.kbl.libsys.service.BookService;

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
public class BookServiceTest {

	@Autowired
	BookService bookService;

	@Test
	public void addBookRecord() {
		
		Book book = new Book(1L, "book1", "author1", "pub1", null);
		Book saveResponse = bookService.save(book);
		assertNotNull(saveResponse);
		assertThat(saveResponse.getId(), is(1L));
	}

	@Test
	public void getBookById() {
		Book book = bookService.getById(1L);
		assertNotNull(book);
		assertThat(book.getId(), is(1L));
	}

	
}
