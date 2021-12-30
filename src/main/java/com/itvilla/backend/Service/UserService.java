package com.itvilla.backend.Service;



import com.itvilla.backend.model.Role;
import com.itvilla.backend.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author itvilla
 *
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    List<User> findAllUsers();
}
