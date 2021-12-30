package com.itvilla.backend.repo;

 import com.itvilla.backend.model.JwtRefreshToken;
 import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author itvilla
 */
public interface JwtRefreshTokenRepository extends JpaRepository<JwtRefreshToken, String>
{
}
