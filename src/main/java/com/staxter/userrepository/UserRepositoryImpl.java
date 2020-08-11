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
		entityManager.persist(user);
		return user;
	}

}
