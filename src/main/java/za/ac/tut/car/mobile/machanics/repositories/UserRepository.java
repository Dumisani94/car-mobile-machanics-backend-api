package za.ac.tut.car.mobile.machanics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.tut.car.mobile.machanics.enities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM User WHERE email =?1 AND password =?2",nativeQuery = true)
    User login(@Param("email") String email, @Param("password") String password);

    @Query(value = "SELECT * FROM User WHERE id =?1",nativeQuery = true)
    User retrieveUserUsingId(@Param("id") Long userId);
}
