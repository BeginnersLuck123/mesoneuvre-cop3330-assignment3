package ex41;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
   public void main() throws FileNotFoundException
    {
        File file = new File("src\\main\\java\\ex41\\exercise41_input.txt");
        assertTrue(file.exists());
    }
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
