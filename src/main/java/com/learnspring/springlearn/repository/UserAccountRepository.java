package com.learnspring.springlearn.repository;

import com.learnspring.springlearn.model.UserAccount;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
