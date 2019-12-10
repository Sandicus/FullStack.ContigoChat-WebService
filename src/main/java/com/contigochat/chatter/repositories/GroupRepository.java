package com.contigochat.chatter.repositories;

import com.contigochat.chatter.models.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, Long> {
}
