package com.example.project2.repos;

import com.example.project2.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo  extends CrudRepository<Message, Integer> {
}
