package br.com.fiap.myPass.password;

import br.com.fiap.myPass.password.Password;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordRepository extends JpaRepository<Password, Long> {
    Optional<Password> findByUsername(String username);
}