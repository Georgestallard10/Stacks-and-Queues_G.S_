import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Queue;

/**
 * Created by Georgestallard10 on 17/03/2016.
 */
public class QueueTests {
    @Test
    public void canitpush() {
        Queues s = new Queues();
        s.push(4);
        assertTrue(s.size == 1);
    }
    public void  canitpop(){
        Queues s = new Queues();
        s.push(4);
        s.pop();
        assertTrue (s.size == 0);
    }
}
