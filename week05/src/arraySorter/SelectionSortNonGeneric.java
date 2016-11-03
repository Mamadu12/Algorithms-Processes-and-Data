package arraySorter;

public abstract class SelectionSortNonGeneric <T extends Comparable<T>> extends ArraySortTool<T>{

	private static int[] doSelectionSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++)
		{
			//index of the largest element
			int index = i;
			for (int j = i + 1; j < ar.length; j++)
				if (ar[j] < ar[index]) 
					index = j;

			int smallerNumber = ar[index];  
			ar[index] = ar[i];
			ar[i] = smallerNumber;
		}
		return ar;
	}
	
	public static void main(String a[]){

		int[] arr1 = {25,47,200,89,4,68,22,100,52,10,5};

		System.out.println("Before sorting the Array: ");
		for(int j:arr1)
			System.out.println(j);

		int[] arr2 = doSelectionSort(arr1);
		System.out.println("After sorting the Array: ");
		for(int i:arr2){
			System.out.println(i);

		}

	}
}
