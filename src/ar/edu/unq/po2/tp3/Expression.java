package ar.edu.unq.po2.tp3;

public class Expression {
	private String a = "abc";
	private String s = a;
	private String t;
	
	
	public void eje4() { 
		System.out.println(s.length()); //3
		// null pointer  System.out.println(t.length());
		System.out.println(1 + a); //labc
		System.out.println(a.toUpperCase()); //ABC
		System.out.println("Libertad".indexOf("r")); //4
		System.out.println("Universidad".lastIndexOf('i')); //7
		System.out.println("Quilmes".substring(2,4)); //il
		System.out.println((a.length() + a ).startsWith("a")); //false
		System.out.println(s==a); //true
		System.out.println(a.substring(1,3).equals("bc")); //true
	}
}
