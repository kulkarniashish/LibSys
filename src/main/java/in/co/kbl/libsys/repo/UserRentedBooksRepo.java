package in.co.kbl.libsys.repo;

import in.co.kbl.libsys.domain.UserRentedBooks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRentedBooksRepo extends
		JpaRepository<UserRentedBooks, Long> {

	// List<UserRentedBooks> findByUserIoId(Long id);
}
