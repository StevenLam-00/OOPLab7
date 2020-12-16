package lab7OOP;

public class Main {
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main (String [] args)
	{
		System.out.println("Part I:");
		
		// Question a
		System.out.println("Question a: Create a class");
		
		
		//Question b
		System.out.println("\nQuestion b: ");
		MyPair<String, Integer> quesB = new MyPair<String, Integer>("Anders", 13);
		System.out.println(quesB.toString());
		
		
		//Question c
		System.out.println("\nQuestion c: ");
		MyPair<String, Double> quesC = new MyPair<String, Double>("Phoenix", 39.7);
		System.out.println(quesC.toString());
		
		
		//Question d
		System.out.println("\nQuestion d: Can not assign a value of type MyPair<String, Double> to a variable of type\n" + 
				"MyPair<String, Integer> ");
		
		
		//Question e
		System.out.println("\nQuestion e: create an array in Main class");
		MyPair<String, Integer>[] grades = new MyPair[5];
		grades[0] = new MyPair<String, Integer> ("Khuu", 70);
		grades[1] = new MyPair<String, Integer> ("Khon", 75);
		grades[2] = new MyPair<String, Integer> ("Lam", 80);
		grades[3] = new MyPair<String, Integer> ("Khuu Khon", 85);
		grades[4] = new MyPair<String, Integer> ("Khuu Khon Lam", 90);
	
	

		//Question f
		System.out.println("\nQuestion f: ");
		for(MyPair printGrades : grades) { 
			System.out.println(printGrades);
		}
		System.out.println("*Values of those array elements did not assign anything to ==> It will return null");
		
		
		
		//Question g
		System.out.println("\nQuestion g: ");
		MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair <MyPair<Integer, Integer>, String> ( new MyPair<Integer, Integer>(23,59), "Any String");
		System.out.println("appointment.Fst.Snd class is " + appointment.Fst.Snd.getClass());
		
		
		//Question h
		System.out.println("\nQuestion h: ");
		System.out.println("Original: " + quesB);
		System.out.println("Swapped: " + quesB.Swap());

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("\nPart II:");
		
		//Question 1
		System.out.println("\nQuestion 1: ");
		System.out.println("\na) Using object: ");
		MyMap obj = new MyMap();
		obj.put("ID student of Khuu Khon Lam", 18303);
		obj.put(18303, "is ID student of Khuu Khon Lam");
		System.out.println("\t"+obj.get("ID student of Khuu Khon Lam"));
		System.out.println("\t"+obj.get(18303));
		
		
		System.out.println("b) Using Generic type: ");
		MyMap <Integer, String> genericType1 = new MyMap();
		MyMap <String, Integer> genericType2 = new MyMap();
		genericType1.put(100000, "HCM City Zip code is");
		genericType2.put("HCM City Zip code", 100000);
		System.out.println("\t"+genericType1.get(100000));
		System.out.println("\t"+genericType2.get("HCM City Zip code"));
		
		
		
		//Question 2
		System.out.println("\nQuestion 2:");
		System.out.println("\tQuestion 2a: \tTesting had done above.");
		
		System.out.println("\tQuestion 2b: \tThe warning from complie time appear when using object method while generic type is no need to cast when getting parameters out of collections");
		String compareObject = (String) obj.get(18303); //Object must cast
		String compareGenericType = genericType1.get(18303); //generic type no need to cast.
		
		
		System.out.print("\tQuestion 2c: ");
		System.out.print("\tIn case of do not use parameterized, warning appears: ");
		System.out.println(" For example, this warning will appears like this:\n" +
				"	- MyMap is a raw type. References to generic type \n" + 
				"	 MyMap<K,V> should be parameterized\n" + 
				"When run this code:\n 		MyMap obj = new MyMap();\n" + 
				"and this warning: \n"+
				"- Type safety: The expression of type MyMap needs \n" + 
				"	 unchecked conversion to conform to MyMap<Integer,String>\n" + "When run this code:\n"+
		"		MyMap <Integer, String> genericType1 = new MyMap()");
		System.out.println("\n===> If dont use parameterized, there are a lot of data type of key and value in 1 map => Difficult to manage and maintance.");
		
		obj.put("ID student of Khuu Khon Lam", 18303);
		obj.put(18303, "is ID student of Khuu Khon Lam");
		
		
	}

}
