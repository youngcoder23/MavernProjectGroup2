/* @author Davin Carstens 220021333
 *
 * 
 */
package za.ac.cput.program1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class SimpleProgramTest 
{
    private SimpleProgram blue;
    private SimpleProgram white;
    private SimpleProgram red;
    
//    @BeforeEach
//    public SimpleProgramTest() 
//    {
//        blue = new SimpleProgram();
//        white = new SimpleProgram();
//        red = new SimpleProgram();
//        white = red; 
//    }

    @Test
    public void objectEquality()
    {
        assertEquals(blue, white);
    }
    public void objectIdentity()
    {
        assertSame(white, red);
    }
    @Test
    public void failTest()
    {
        assertSame(white, red);
        fail("This test will fail");
    }
    @Test
    @Timeout(1000)
    public void timeoutTesting()
    {
        while(true);
    } 
    @Disabled
    @Test
    public void disablingTest()
    {
        assertEquals(blue,white);
    }
}
