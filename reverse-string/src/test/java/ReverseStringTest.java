import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learnjava.corejava.reversestring.ReverseString;

public class ReverseStringTest {

	String inputStr;
	String outputStr;
	String expectedOutputStr;
	ReverseString rs;
	
	@BeforeEach
	public void init() {
		
		rs = new ReverseString();
		
	}

	@Test
	public void reverseStringNullInput() {
		
		char[] inputStr = null;
		
		outputStr = rs.reverseString(inputStr);
		
		assertTrue(outputStr.isBlank());
		
	}
	
	@Test
	public void reverseStringValidInput() {
		
		inputStr = "sonia";
		expectedOutputStr = "ainos";
		
		outputStr = rs.reverseString(inputStr.toCharArray());
		
		assertEquals(outputStr, expectedOutputStr);
		
		
	}
	
	
}
