package asses2;

public class FindIntersection {

	public static void main(String[] args) {
		int array1[]={3,15,11,4,6,7};
		int array2[]={1,2,20,4,9,7};
		System.out.println("Intersection Two Array::");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array1[j]) {
					System.out.println(array2[j]);
				}
				
			}
			
		}


	}

}
