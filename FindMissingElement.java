package Week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array[]= {1,4,3,2,8,6,7};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if ((i+1)!=array[i]) {
			System.out.println("missing element:"+(i+1));
			break;
			
		}
	}

}
}