
package tt;


public class Arrays {
	public static int linearSearch(int[] myArray, int key, int lowerB, int upperB) {//Method to search for the index of a key within a upper and lower bound
		for (int i = lowerB ;i<= upperB;++i) {
			if (myArray[i]==key) {
				return i;
				
			}
			else {
				
			}
			
		}
		return -1;
			
	}																						
	public static int linearSearch(int[] myArray, int key) {//Method to search for the index of a key within an entire list
		for (int i = 0; i<= myArray.length; ++i) {
			if (myArray[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static boolean equals(int[] firstArr , int[] secondArr) { // Method to check if lists are equal
		boolean isEqual = false;;
		for (int i= 0; i<firstArr.length;++i) {
			if (firstArr.length == secondArr.length) {
				if (firstArr[i] == secondArr[i]) {
					isEqual = true;
				}
				else {
					isEqual = false;
				}
			}
			else {
				isEqual = false;
			}
		}
		return isEqual;
	}
	public static void fill(int[] myArray, int x, int lowerB, int upperB) { //Method to fill list with an integer within upper and lower bounds
		for (int i=lowerB ; i<upperB;++i) {
			myArray[i] = x;
		}
	}																		
	public static void fill(int[] myArray, int x) {//Method to fill entire list with an integer
		for (int i=0; i<myArray.length; ++i) {
			myArray[i]=x;
		}
	}																			
	public static int[] copyOf(int[] myArray, int lowerB, int upperB) {// Method to return a copy of a list within upper and lower bounds
		
		int[] newArray = new int[(upperB-lowerB)];
		int x= 0;
			for (int i =lowerB; i<(upperB);++i) {
				
				newArray[x]= myArray[i];
				x++;
			}
			
		
		return newArray;
	}																		
	public static int[] copyOf(int[] myArray) {// Method to return a copy of a list
		int[] newArray = new int[myArray.length];
		for (int i =0; i<myArray.length;++i) {
			newArray[i]= myArray[i];
		}
		return newArray;
	}
 	public static void sort (int[] myArray, int lowerB, int upperB) {//Method to sort list within upper and lower bounds in ascending order
		
		for (int i = lowerB;i<= upperB-1;i++) {
			for (int x = lowerB; x<=upperB-2;x++) {
				if (myArray[x] >myArray[x+1]) {
					int temp = myArray[x];
					myArray[x]= myArray[x+1];
					myArray[x+1]=temp;
				}
			}
		}
			
	}																			
	public static void sort (int[] myArray) {// Method to sort list in ascending order
		
		for (int i = 0 ;i<= myArray.length-1;i++) {
			for (int x=0; x<=myArray.length-2;x++) {
				if (myArray[x] >myArray[x+1]) {
					int temp = myArray[x];
					myArray[x]= myArray[x+1];
					myArray[x+1]=temp;
				}
			}
		}
			
	}
	public static String toString(int[] myArray) {// Method to convert list to String
		String strList=  "";
		for (int i = 0; i<myArray.length;++i) {
			strList = strList + (myArray[i]);
			if (i < myArray.length-1) {
				strList= strList + ", ";
			}
		}
		
		
		return ("["+ strList + "]");
	}
}
