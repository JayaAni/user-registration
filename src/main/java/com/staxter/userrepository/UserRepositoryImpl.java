package com.staxter.userrepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.staxter.domain.User;
import com.staxter.exception.UserAlreadyExistsException;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public UserRepositoryImpl() {
		super();
	}

	@Override
	public User createUser(User user) throws UserAlreadyExistsException {
		User userDetails = entityManager.find(User.class, user.getId());
		if(userDetails == null) {
			entityManager.persist(user);
		} else {
			throw new UserAlreadyExistsException("A user with the given username already exists");
		}
		return user;
	}

}
