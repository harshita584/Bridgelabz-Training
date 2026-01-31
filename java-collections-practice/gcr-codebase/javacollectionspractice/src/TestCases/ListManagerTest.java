package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.junit.ListManager;

public class ListManagerTest {
    @Test
    void testAddElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);

        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        manager.removeElement(list, 10);

        assertEquals(1, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int size = manager.getSize(list);

        assertEquals(3, size);
    }
}
