package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    // Другие методы будут добавлены позже
}
