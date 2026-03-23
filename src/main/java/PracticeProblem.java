public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters){
		//iterate through indexes 1 to n, since the first character won't need any comparisonss
		for(int i = 1; i < characters.length; i++){
			//temp index and key for swapping
			int j = i;
			char c = characters[i];

			//iterate j-1 many times as long as the key is smaller than the index at j-1
			while(j > 0 && characters[j-1] > c){

				//since char[j-1] is larger than the key, move char[j-1] ahead to char[j] and set j to j-1
				characters[j] = characters[j-1];
				j--;
			}
			//j should equal the index where char[j-1] is smaller than the key, or 0 if it is the smallest value so far

			//set j to the key
			characters[j] = c;
		}
	}


}
