package com.staxter.userrepository;

import com.staxter.domain.User;
import com.staxter.exception.UserAlreadyExistsException;

public interface UserRepository {
	User createUser( User user ) throws UserAlreadyExistsException;
}
