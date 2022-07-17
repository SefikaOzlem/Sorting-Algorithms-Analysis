
public class Sort {
	
	public static int getLeft(int i)
	{
        return 2*i;
    }
    public static int getRight(int i)
    {
        return 2*i+1;
    }
    public static int getParent(int i)
    {
        return i/2;
    }  
    public static void maxHeapify(int[]  array, int position)
    {  	 
        int leftPosition = getLeft(position);
        int rightPosition = getRight(position);
        int largest = 0;
        if(leftPosition <= array.length && array[leftPosition-1] > array[position-1])
        {
            largest = leftPosition;
        }
        else 
        {
            largest = position;
        }
        if(rightPosition <= array.length && array[rightPosition-1] > array[largest-1])
        {
            largest = rightPosition;
        }
 
        if(largest != position)
        {
            swap(array,position-1,largest-1);
            maxHeapify(array, largest);
        }
    }
    public static void maxHeapifyForSort(int[]  array, int position, int maxPos){
 
        int leftPosition = getLeft(position);
        int rightPosition = getRight(position);
 
        int largest = 0;
 
        if(leftPosition <= maxPos && array[leftPosition-1] > array[position-1]){
            largest = leftPosition;
        }
        else {
            largest = position;
        }
        if(rightPosition <= maxPos && array[rightPosition-1] > array[largest-1])
        {
            largest = rightPosition;
        }
 
        if(largest != position){
            swap(array,position-1,largest-1);
            maxHeapifyForSort(array, largest,maxPos);
        }
    }
 
    public static void buildMaxHeap(int[] array){
 
        for(int i=(array.length)/2;i>0;i--)
        {
            maxHeapify(array,i);
        }
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void heapSort(int[] array){
        buildMaxHeap(array);
        for(int i=array.length;i>0;i--){
            swap(array,0,i-1);
            maxHeapifyForSort(array,1,i-1);
        }
    }
    public static void DualPivotQuicksort(int[] A, int left, int right) 
    {
        if (right > left) {
           
            if (A[left] > A[right]) swap(A, left, right);
            int pivotleft = A[left], pivotright = A[right];

            int leftforward = left + 1, rightrear = right - 1, templeft = leftforward;
            while (templeft <= rightrear) {
                if (A[templeft] < pivotleft) {
                    swap(A, templeft, leftforward);
                    ++leftforward;
                } else if (A[templeft] >= pivotright) {
                    while (A[rightrear] > pivotright && templeft < rightrear) --rightrear;
                    swap(A, templeft, rightrear);
                    --rightrear;
                    if (A[templeft] < pivotleft) {
                        swap(A, templeft, leftforward);
                        ++leftforward;
                    }
                }
                ++templeft;
            }
            --leftforward; ++rightrear;

            swap(A, left, leftforward); 
            swap(A, right, rightrear);

            DualPivotQuicksort(A, left, leftforward - 1);
            DualPivotQuicksort(A, leftforward + 1, rightrear - 1);
            DualPivotQuicksort(A, rightrear + 1, right);
        }
    }

    public static void InsertionSort(int[] array, int start, int incr)
	{
		for (int i=start+incr; i<array.length; i+=incr)
		{
			for (int j=i; (j>=incr) && (array[j] < array[j-incr]); j-=incr)
			{
				swap(array, j, j-incr);
			}
				
		}
	}
	public static void ShellSort(int[] array) 
	{
		for (int i=array.length/2; i>2; i/=2)
		{
			for (int j=0; j<i; j++)  
			{
				InsertionSort(array, j, i);
			}
			InsertionSort(array, 0, 1);   
		}
	}
}
