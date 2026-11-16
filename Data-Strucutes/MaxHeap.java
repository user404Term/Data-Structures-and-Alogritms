
	public class MaxHeap{

		int[] arr;
		int size;
		int capacity;

		public MaxHeap(int capacity){
			this.capacity = capacity;
			this.size = 0;
			arr = new int[capacity];
		}

		// Insertion
		void insert(int value){
			
			arr[size] = value;
			size++;
			heapify(size - 1);

		} // insert
		

		// heapifyUp(i)
		
		void heapifyUp(int i) {
			int p = (i - 1) / 2; // Find parent index

    			// While we are not at the root (i > 0) AND the 
			// child is bigger than the parent
    			while (i > 0 && arr[p] < arr[i]) {
			
				// Swap them using our index swap helper
       				swapInsert(i,p); 

			
				// Move our tracker 'i' up to 
				// the parent's position
        		 	i = p;
				
				// Recalculate the new parent index
				p = (i - 1) / 2;
    			}


		} // heapifyUp


		// swap function for insertion
		void swapInsert(int i, int j){
			int temp = arr[i];
			arr[i] = arr[p];
			arr[p] = temp;
		 } // swap
			
	} // class
