package collection.set;

import java.util.HashSet;
import java.util.Random;

public class HashSetApp2 {

	public static void main(String[] args) {
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();
		
		Random random = new Random();
		while (true) {
			int number = random.nextInt(45) + 1;
			lottoNumbers.add(number);		// lottoNumber.add(new Integer(number));
			
			if (lottoNumbers.size() == 6) {
				break;
			}
		}
		System.out.println(lottoNumbers);
	}
}
