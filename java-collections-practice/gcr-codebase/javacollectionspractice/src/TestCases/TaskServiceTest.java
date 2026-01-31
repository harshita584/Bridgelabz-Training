package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.TaskService;

public class TaskServiceTest {
    @Test
    @Timeout(2)
    void testLongRunningTaskTimeout() throws InterruptedException {
        TaskService service = new TaskService();
        service.longRunningTask();
    }
}

