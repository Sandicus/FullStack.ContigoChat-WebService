package com.contigochat.chatter.repositories;

import com.contigochat.chatter.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
