package in.co.kbl.libsys.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.kbl.libsys.domain.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
