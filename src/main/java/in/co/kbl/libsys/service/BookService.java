
package in.co.kbl.libsys.service;

import in.co.kbl.libsys.domain.Book;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediaiq.dsp.service.AbstractCrudService;

@Path("/book/")
@Produces(MediaType.APPLICATION_JSON)
public interface BookService extends AbstractCrudService<Book, Long> {

}
