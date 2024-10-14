package ru.netology;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private Map<String, String> contacts;
    private Map<String, String> numberToName;

    public PhoneBook() {
        contacts = new TreeMap<>();
        numberToName = new HashMap<>();
    }

    public int add(String name, String number) {
        contacts.put(name, number);
        numberToName.put(number, name);
        return contacts.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }

    public List<String> printAllNames() {
        return null;
    }
}