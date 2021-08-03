import java.util.Arrays;
import java.util.Random;
    
public class Puzzling{
	
	private Random randMachine = new Random();

	private char[] alphabets = {
			'a','b','c','d','e',
			'f','g','h','i','j',
			'k','l','m','n','o',
			'p','q','r','s','t',
			'u','v','w','x','y',
			'z'
		};


	public char getRandomLetter(){
		return alphabets[randMachine.nextInt(26)];
	}



	public char[] getTenRolls(){
		char[] arr = new char[10];
		for(int i=0; i<10; i++){
			arr[i] = getRandomLetter();
		}
		return arr;	
	}



	public String getNewPasswordSet(int length){

		String[] arr = new String[length];

		for(int i=0;i<length;i++){
			arr[i] = new String(getTenRolls());
		}
		return Arrays.toString(arr) + "\n" ;
	}
}




