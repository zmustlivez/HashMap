import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomLinkedListRemove {
    CustomLinkedList<String, String> list = new CustomLinkedList<>();

    @Test
    public void remove() {
        list.add("ABC", "1");
        list.add("ABCD", "2");
        list.add("ABCDF", "3");
        assertTrue(list.remove("ABCD"), "Deleted succesful, code right");
        assertFalse(list.remove("ABCDZ"), "Deleted ussuccesful, code right");
    }

    @Test
    public void testRemoveNonExistingKey() {
        list.add("ABC", "1");
        list.add("ABCDF", "3");

        // Проверяем удаление несуществующего элемента
        assertFalse(list.remove("ABCDZ"), "Удаление несуществующего элемента должно вернуть false");
    }

    @Test
    public void removeNull() {
        list.add(null, "1");
        list.add("ABC", "2");

        // Проверяем удаление элемента с ключом null
        assertTrue(list.remove(null), "Удаление элемента с ключом null должно быть успешным");
        // Проверяем, что элемент с ключом null больше не существует
        assertFalse(list.remove(null), "Элемент с ключом null уже был удалён");
    }
}
