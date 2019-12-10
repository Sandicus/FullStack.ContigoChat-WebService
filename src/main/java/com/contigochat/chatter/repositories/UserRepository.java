package com.contigochat.chatter.repositories;

import com.contigochat.chatter.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
