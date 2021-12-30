package com.itvilla.backend.Service;

import com.itvilla.backend.model.User;

/**
 * @author itvilla
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
