package com.itvilla.backend.security.jwt;

import com.itvilla.backend.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author itvilla
 */
public interface JwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
