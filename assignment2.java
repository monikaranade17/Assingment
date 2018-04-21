import java.util.Scanner;
public class Villages {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		String[] inputs = new String[cases];

		// reading the string inserted by user

		for(int i=0;i<=cases;i++){
			if(i == 0)
				scanner.nextLine();
			else{
				inputs[i-1]= scanner.nextLine();
			}
		}
		
		//for checking each character of each string
		for(String input : inputs){
			char[] letters = input.toCharArray(); //array of characters in each string
			char leftChar = 0;		
			char lastChar = 0;		
			int noOfDots = 0;		
			int aCount = 0;		
			int bCount = 0;		
			for (char i : letters){
			
			//Checking the characters in the string and storing the count of different characters
				switch(i){
				case 'A':
					aCount ++;
				//checking both side of A to confirm if it is surrounded by villages of tribes A from the left and from the right.
					
							if(lastChar == '.'){
							if( leftChar == 'A'){
							aCount += noOfDots;
							noOfDots = 0;
							}else{
								noOfDots = 0;
							}
					}
					lastChar = 'A';
					leftChar = 'A';
					break;
				case 'B':
					bCount++;
				//checking both side of B to confirm if it is surrounded by villages of tribes B from the left and from the right.

					if(lastChar == '.'){
						if( leftChar == 'B'){
					
						bCount += noOfDots;
						noOfDots = 0;
						}else{
							noOfDots = 0;
						}
					}
					lastChar = 'B';
					leftChar = 'B';
					break;

				
				case '.':
					noOfDots++;
					lastChar = '.';
					break;
				}
			}
			System.out.println(aCount +" "+bCount);
		}
	}

}