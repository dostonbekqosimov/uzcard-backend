package dasturlash.uz.repository;

import dasturlash.uz.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, String> {
    Optional<Profile> findByUsername(String username);

    Optional<Object> findByUsernameAndVisibleTrue(String username);
}