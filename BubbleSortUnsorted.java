//THIS CODE IS FOR NOT OPTIMIZED UNSORTED BUBBLE SORT
class BubbleSortUnsorted {

    void bubbleSort(int arr[]) 
    {
        int n = arr.length;
  
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    System.out.print("Since " + arr[j] + " > " + arr[j + 1] + ",");
                    System.out.println(" Swap (" + arr[j] + "," + arr[j + 1] + ")");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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
        BubbleSortUnsorted bs = new BubbleSortUnsorted();
        int unsorted[] = {5,2,10,20,9,4,3,15,16,13};
        System.out.println("Unsorted array: ");
        bs.printArray(unsorted);
        System.out.println("");
        bs.bubbleSort(unsorted);
        System.out.println("");
        System.out.println("Sorted array: ");
        bs.printArray(unsorted);
    }
}