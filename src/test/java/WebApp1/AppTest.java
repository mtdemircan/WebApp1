/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package WebApp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;



class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
   public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(App.containsmultiplication(array,1,1,2));
    }
    @Test
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.containsmultiplication(array,3,3,3));
    }
    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(App.containsmultiplication(array, 1,1,1));
    }
    /*@Test
    public void testNull() {
      //assertFalse(App.containsmultiplication(null, 1,1,1));
    }*/




}
