package Udemy;
import java.util.Map;
import java.util.HashMap;
public class lecture3 {
	public static void main(String[] args)
	{
	Map cars=	new HashMap();
		cars.put("bea", 3);
		cars.put("audi",2);
		cars.put("marceez", 5);
		cars.put("marfe", 1);
		
		cars.put("mustang", 7);
		//cars.remove("bea");
		int size = cars.size();
		
		System.out.println(cars);
	}

}
