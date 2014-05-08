package in.co.kbl.libsys.repo;

import in.co.kbl.libsys.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
