import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleEndedQueueTest {

    @Test
    void size() {
        DoubleEndedQueue list = new DoubleEndedQueue();
        assertEquals(0, list.size());
    }
}