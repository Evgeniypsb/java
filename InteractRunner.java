import java.util.Scanner;
public class InteractRunner {
	public static void main(String[] arg) {
	Scanner  reader = new Scanner(System.in);
	try {
	Calculator calc = new Calculator();
	String exit="no";
    	
	while (!exit.equals("yes")) {
		System.out.println("Chuse operation + or - or / or *");
		String oper=reader.next();
		System.out.println("Input first argument");
		String first = reader.next();
        System.out.println("Input Second argument");		
        String second = reader.next();		
		if (oper.equals("+")) {
		calc.add(Integer.valueOf(first),Integer.valueOf(second));
		}
		if (oper.equals("-")) {
		calc.noadd(Integer.valueOf(first),Integer.valueOf(second));
		}		
		if (oper.equals("*")) {
		calc.mult(Integer.valueOf(first),Integer.valueOf(second));
		}		
		if (oper.equals("/")) {
		calc.delen(Integer.valueOf(first),Integer.valueOf(second));
		}		
		System.out.println("Result :" + calc.getResult());
		System.out.println("Clear result y/n ? :");	
	    String cls = reader.next();
		if (cls.equals("y")) {
		calc.cleanResult();
		}
		System.out.println("Exit yes/no");
		exit = reader.next();
	}
	}
	finally {
		reader.close();
	}
	}

}