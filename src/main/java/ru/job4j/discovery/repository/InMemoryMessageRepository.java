package ru.job4j.discovery.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.discovery.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс InMemoryMessageRepository
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
@Repository
public class InMemoryMessageRepository implements MessageRepository {

    private final List<Message> messages = new ArrayList<>();
    private int id = 1;

    @Override
    public Message save(Message message) {
        message.setId(id++);
        messages.add(message);
        return message;
    }

    @Override
    public List<Message> findAll() {
        return messages;
    }
}
