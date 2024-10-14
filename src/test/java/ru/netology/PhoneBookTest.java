package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Иван Иванов", "1234567890");
        assertEquals(1, count, "Количество контактов должно быть 1 после добавления одного контакта");
    }

    @Test
    public void testFindByNumberExisting() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван Иванов", "1234567890");
        String name = phoneBook.findByNumber("1234567890");
        assertEquals("Иван Иванов", name, "Должно вернуть имя по номеру");
    }

    @Test
    public void testFindByNumberNonExisting() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван Иванов", "1234567890");
        String name = phoneBook.findByNumber("0987654321");
        assertNull(name, "Должно вернуть null, если номер не найден");
    }
}
