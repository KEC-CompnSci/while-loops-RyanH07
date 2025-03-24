
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {
    
    @BeforeEach
    void setUp() {
        // Reset scanner before each test if needed
        Assignment.scanner.reset();
    }
    
    @Test
    void testRepeatWord() {
        assertEquals("hello hello hello", Assignment.repeatWord("hello", 3).trim(),
            "Word should be repeated correct number of times");
            
        
        assertEquals("test test", Assignment.repeatWord("test", 2).trim(),
            "Word should be repeated correct number of times");
        
        assertEquals("java", Assignment.repeatWord("java", 1).trim(),
            "Word should appear once when times = 1");
        
        assertEquals("", Assignment.repeatWord("word", 0).trim(),
            "Should return empty string when times = 0");
    }
    
    @Test
    void testCreatePyramid() {
        String expected3 = "1\n22\n333";
        String actual3 = Assignment.createPyramid(3).trim();
        assertEquals(expected3, actual3,
            "Pyramid should have correct pattern for n=3");
        
        String expected4 = "1\n22\n333\n4444";
        String actual4 = Assignment.createPyramid(4).trim();
        assertEquals(expected4, actual4,
            "Pyramid should have correct pattern for n=4");
    }
    
    
    
    
    
    @Test
    void testCountTo() {
        assertEquals("1 2 Fizz 4 Buzz", Assignment.countTo(5).trim(),
            "Should correctly handle numbers 1-5");
        
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", Assignment.countTo(10).trim(),
            "Should correctly handle numbers 1-10");
        
        String result15 = Assignment.countTo(15).trim();
        assertTrue(result15.contains("FizzBuzz"),
            "Should contain FizzBuzz for number 15");
    }
    
   
}