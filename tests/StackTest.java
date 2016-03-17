import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Georgestallard10 on 08/03/2016.
 */
public class StackTest {
    @Test
    public void it_can_create_an_empty_stack() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        s.push(2);
        assertFalse(s.isEmpty());

    }

    @Test
    public void can_it_Push_1_Item() {
        Stack s = new Stack();
        s.push(9);
        assertTrue(s.size() == 1);
        assertEquals(s.top() == 9, true);
    }

    @Test
    public void can_it_pop_1_Item() {
        Stack s = new Stack();
        s.push(5);
        s.pop();
        assertTrue(s.size() == 0);
    }

    @Test
    public void can_it_push_multiple_items() {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        assertTrue(s.size() == 4);
        assertTrue(s.top() == 1);
    }

    @Test
    public void can_it_create_a_full_stack() {
        Stack s = new Stack(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        assertTrue(s.isfull());
        s.pop();
        assertFalse(s.isfull());
    }
    @Test
    public void can_it_Throw_a_StackEmptyException(){
       // Stack s = new Stack();
        //s.pop();
    }
    @Test
    public  void can_it_Throw_a_StackFullException(){
        Stack s = new Stack(1);

    }
    @Test
    public void can_it_unlock_the_bantz(){
        assertTrue(  1 == 1 );
    }


}
