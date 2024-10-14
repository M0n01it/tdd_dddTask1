package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

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

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Борис Борисов", "1111111111");
        phoneBook.add("Алексей Александров", "2222222222");
        phoneBook.add("Иван Иванов", "1234567890");
        List<String> names = phoneBook.printAllNames();
        List<String> expected = List.of("Алексей Александров", "Борис Борисов", "Иван Иванов");
        assertEquals(expected, names, "Имена должны быть отсортированы в алфавном порядке");
    }
}
