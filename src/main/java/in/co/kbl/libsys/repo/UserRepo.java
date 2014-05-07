package in.co.kbl.libsys.repo;

import in.co.kbl.libsys.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
