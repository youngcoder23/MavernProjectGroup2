/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
/**
 *
 * @author Daniel Marais-219476845
 */
public class EmployerTest {
    
 

public class GamerTest {
    
    public GamerTest() {
    }

     
    public GamerTest buildtest1;
    public GamerTest buildtest2;
    public GamerTest buildtest3;
    @BeforeEach
    public void setUp() {
        buildtest1= new GamerTest();
        buildtest2= new GamerTest();
        buildtest3= buildtest1;
    }
    
    @Test
    public void testIdentity(){
        //*Testing for identity. Test passed sucessfully
       
        assertSame(buildtest1, buildtest3);
    }
    @Test
    public void testEquality(){
        //*Testing for Euality. Test passed sucessfully
        assertEquals(buildtest1,buildtest3);
    }
    @Test
    public void testFail(){
        //*Test to deliberately for the program.
      fail("The test case is a prototype.");
      assertEquals(buildtest1,buildtest3);
    }
    @Test
    @Timeout (1000000)
    public void testTimeOut(){
        //* Test to timeout the program
          final int factorialof= 1+(int) (30000+Math.random());
    assertEquals(buildtest1,buildtest3);
    }
    @Test
    @Disabled("Deliberately Disabling test")
    //*Test to skip the task
    public void testDisable(){
        assertEquals(buildtest1,buildtest3);
    }

}
}
