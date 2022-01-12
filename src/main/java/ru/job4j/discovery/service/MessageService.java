package ru.job4j.discovery.service;

import org.springframework.stereotype.Service;
import ru.job4j.discovery.model.Message;

import java.util.List;

/**
 * Класс MessageService
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
@Service
public interface MessageService {

    boolean send(String serviceId, Message message);

    List<Message> getReceivedMessages();

    void saveReceivedMessage(Message message);

}
