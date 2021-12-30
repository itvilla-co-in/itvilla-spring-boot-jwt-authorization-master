package com.itvilla.backend.Service;


import com.itvilla.backend.model.JwtRefreshToken;
import com.itvilla.backend.model.User;
import lombok.Data;

/**
 * @author itvilla
 */
public interface JwtRefreshTokenService
{
    JwtRefreshToken createRefreshToken(Long userId);

    User generateAccessTokenFromRefreshToken(String refreshTokenId);
}
