package io.github.aplaraujo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import io.github.aplaraujo.entities.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByToken(String token);
}
