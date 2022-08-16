//THIS CODE IS FOR OPTIMIZED UNSORTED BUBBLE SORT
class OptimizedUnsortedBubbleSort {

	void bubbleSortOptimized(int arr[]) 
	{
		int n = arr.length;
		boolean flag;
		for (int i = 0; i < n - 1; i++) 
		{
			flag = true;
			for (int j = 0; j < n - 1 - i; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					System.out.print("Since " + arr[j] + " > " + arr[j + 1] + ",");
                    System.out.println(" Swap (" + arr[j] + "," + arr[j + 1] + ")");
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false ;					
				}
			}
		if (flag)
		{
			break;
		}
		
		System.out.println("Number of Iteration/s = " + (i + 1));
        System.out.print("\nArray becomes: ");
        printArray(arr);
		}
		
	}
	
	 void printArray(int arr[]) 
	 {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	 }
	 
	public static void main(String args[]) 
	{
		OptimizedUnsortedBubbleSort bs = new OptimizedUnsortedBubbleSort();
        int unsorted[] = {5,2,10,20,9,4,3,15,16,13};
        System.out.println("Unsorted array: ");
        bs.printArray(unsorted);
        System.out.println("");
        bs.bubbleSortOptimized(unsorted);
        System.out.println("");
        System.out.println("Sorted array: ");
        bs.printArray(unsorted);	
    }
}