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
}
