package qa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import util.ScheduledTool;

import javax.annotation.Resource;

@SpringBootTest
public class ScheduledTest {

    @Resource
    private ScheduledTool scheduledTool;

    @Test
    public void testScheduled() {
        scheduledTool.configureTasks();
    }
}
