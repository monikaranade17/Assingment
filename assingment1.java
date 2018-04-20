import java.util.Scanner;


public class Calculator {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder builder = new StringBuilder();
		
		while(scanner.hasNext()){
			
			String line = scanner.nextLine();
			
			builder.append(line+",");
			
			if(line.contains("=")){
				
				break;
      }
		
			}
		
		String[] ops = builder.toString().split(",");
		
		int value = 0;
		
		String operator = "";
		
		boolean initial = true;
		
		for(String op : ops){
			
			int tempValue;
				
			try{
				
				tempValue = Integer.parseInt(op);
				
				
				if(!initial){
					
				switch(operator){
					
			case "*":
value *= tempValue;
  break;
					
			case "/":
value /= tempValue;
 break;
					
			case "-":
value -= tempValue;
 break;
					
			case "+":
value += tempValue;
 break;
					
			case "=":
System.out.println(value);
  break;
					
				}
					
				
			}
			else{
					
			value = tempValue;
				
			}
			
			initial = false;
				
		}
		catch(NumberFormatException ex){
					
		operator = op;
				
		}
		
	}
		
	System.out.println(value);
	
         }

}