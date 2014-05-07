package in.co.kbl.libsys.service.impl;

import javax.ws.rs.Path;

import in.co.kbl.libsys.domain.Book;
import in.co.kbl.libsys.repo.BookRepo;
import in.co.kbl.libsys.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.dsp.service.impl.AbstractCrudServiceImpl;

@Path("/book/")
@Service
public class BookServiceImpl extends
		AbstractCrudServiceImpl<Book, Long, BookRepo> implements
		BookService {

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public BookRepo getRepository() {
		return bookRepo;
	}
	
}
