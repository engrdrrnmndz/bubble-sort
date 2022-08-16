//THIS CODE IS FOR OPTIMIZED SORTED BUBBLE SORT
class OptimizedSortedBubbleSort {

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
		OptimizedSortedBubbleSort bs = new OptimizedSortedBubbleSort();
        int sorted[] = {2,3,4,5,9,10,13,15,16,20};
        System.out.println("Sorted array: ");
        bs.printArray(sorted);
        System.out.println("");
        bs.bubbleSortOptimized(sorted);
        System.out.println("");
        System.out.println("Sorted array: ");
        bs.printArray(sorted);	
    }
}