package ru.job4j.discovery.model;

import lombok.Data;

/**
 * Класс Message
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
@Data
public class Message {

    private int id;
    private String message;
    private String sender;

}
