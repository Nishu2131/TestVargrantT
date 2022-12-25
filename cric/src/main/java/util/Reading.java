package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reading {
	@SuppressWarnings("unchecked")
	public static  int Reader(String obj1,String obj2) throws IOException, ParseException {
		 int count=0;
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\test.json";
		//System.out.println(path);
		FileReader reader = new FileReader(path);
		JSONParser parser= new JSONParser();
		JSONObject json=(JSONObject)parser.parse(reader);
		//System.out.println(json.toJSONString());
		JSONArray player=(JSONArray)json.get("player");
		//System.out.println(player.toJSONString());
		 
		for(int i=0;i<player.size();i++) {	
		JSONObject testDataset=(JSONObject)player.get(i);
		String country=(String)testDataset.get(obj1);
		System.out.println(country);
		if(country.equals(obj2)) {
			count=count+1;
		}
		
		}
		return count;
		
		
		
	}
	
}
