package testCase;

import util.Reading;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestN {
	SoftAssert softAssert = new SoftAssert();
@Test
/*Test to validate Team has only 4 Foreign player*/
public void forignPlayer() throws IOException, ParseException {
	
	int count=Reading.Reader("country","India");
	System.out.println("Count is"+count);
	if (count<7)
	{
		softAssert.fail("Test is fail as we have forign player more than 4");
		softAssert.assertAll();
	}
}
@Test
/*Test to validate Team has at least one Wicket-Keeper*/
public void WicketKeeper() throws IOException, ParseException {
	int count=Reading.Reader("role","Wicket-keeper");
	System.out.println("Count of Wicket-keeper"+count);
	if (count==0)
	{softAssert.fail("Test is fail as we do not have any WicketKeeper");
	softAssert.assertAll();
		
	}
	
}
}
