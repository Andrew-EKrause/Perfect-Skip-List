// CS 340: Software Design III
// Homework Assignment 1
//
// Andrew Krause
//
// The program uses a data structure, a Perfect 
// Skip List, to find values in a list of integers.
// The data structure is effective in that there
// are multiple next fields, which enable the 
// the search algorithm to perform in an effective
// manner. 
//
// The asymptotic notation of the program is
// O(log2(n)).
//
public class PerfectSkipList {

	// TRACE THROUGH SOME OF THE METHODS IN THIS PROGRAM!!!
	
	/**
	 * The main method is used strictly for testing 
	 * and debugging. After the implementation of the
	 * program is completed, the main method with its 
	 * tests will be commented out. 
	 * 
	 * @param args
	 */
	public static void main (String[] args)
	{
		// First test of program creates an array, the size of the array, and an
		// instance of the class. The array and array size are entered in the instance.
		int[] firstArray = {10, 20, 30, 40, 50, 60}; 
		int firstArraySize = firstArray.length;
		PerfectSkipList firstTest = new PerfectSkipList(firstArray, firstArraySize);
		System.out.println("1. First Test:");
		System.out.println("---------------------------------------");
		firstTest.printList();
		System.out.println("---------------------------------------");
		System.out.print("Searching for 60 in the list...");
		System.out.println(firstTest.find(10));
		System.out.println("\n\n");
		
		// Second test of program creates an array, the size of the array, and an
		// instance of the class. The array and array size are entered in the instance.
		// In this test, a different size value is tested.
		int[] secondArray = {1, 25, 12, 30, 400, 64, 15, 13, 97, 112, 84};
		// int secondArraySize = secondArray.length; --> not needed right now.
		PerfectSkipList secondTest = new PerfectSkipList(secondArray, 5);
		System.out.println("2. Second Test:");
		System.out.println("---------------------------------------");
		secondTest.printList();
		System.out.println("---------------------------------------");
		System.out.print("Searching for 14 in the list...");
		System.out.println(secondTest.find(14));
		System.out.println("\n\n");
		
		// Third test of program creates an array, the size of the array, and an
		// instance of the class. The array and array size are entered in the instance.
		int[] thirdArray = {13, 15, 17};
		int thirdArraySize = thirdArray.length;
		PerfectSkipList thirdTest = new PerfectSkipList(thirdArray, thirdArraySize);
		System.out.println("3. Third Test:");
		System.out.println("---------------------------------------");
		thirdTest.printList();
		System.out.println("---------------------------------------");
		System.out.print("Searching for 15 in the list...");
		System.out.println(thirdTest.find(15));
		System.out.println("\n\n");
		
		// Fourth test of program creates an array, the size of the array, and an
		// instance of the class. The array and array size are entered in the instance.
		int[] fourthArray = {70};
		int fourthArraySize = fourthArray.length;
		PerfectSkipList fourthTest = new PerfectSkipList(fourthArray, fourthArraySize);
		System.out.println("4. Fourth Test:");
		System.out.println("---------------------------------------");
		fourthTest.printList();
		System.out.println("---------------------------------------");
		System.out.print("Searching for 71 in the list...");
		System.out.println(fourthTest.find(71));
		System.out.println("\n\n");
		
		// Fifth test of program creates an array, the size of the array, and an
		// instance of the class. The array and array size are entered in the instance.
		int[] fifthArray = {};
		int fifthArraySize = fifthArray.length;
		PerfectSkipList fifthTest = new PerfectSkipList(fifthArray, fifthArraySize);
		System.out.println("5. Fifth Test:");
		System.out.println("---------------------------------------");
		fifthTest.printList();
		System.out.println("---------------------------------------");
		System.out.print("Searching for 21 in the list...");
		System.out.println(fifthTest.find(21));
		System.out.println("\n\n");
	}
	
	/**
	 * The private class creates a linked 
	 * list data structure, called a Perfect 
	 * Skip List, which is used throughout
	 * the program.
	 * 
	 * @author andrewkrause
	 */
	private class Node
	{
		// The global instance variable
		// for data type.
		int key;
		
		// A Node array for multiple
		// next fields.
		Node[] next;
		
		/**
		 * The two parameters are both 
		 * integers that are set to 
		 * help describe the attributes
		 * of the list.
		 * 
		 * @param k
		 * @param size
		 */
		private Node(int k, int size)
		{
			// Value passed through constructor.
			key = k;
			
			// Items are initialized to null by Java.
			next = new Node[size]; 
		}
	}
	
	// The private global instance variable for Nodes.
	private Node head;
	
	// The private global instance variable for next fields.
	private int height;
	
	/**
	 * The constructor takes in an array of keys, and
	 * an integer value for the number of keys present
	 * in the list.
	 * 
	 * @param keys
	 * @param numKeys
	 */
	public PerfectSkipList(int[] keys, int numKeys)
	{
		// PRE: keys is sorted in ascending order and numKeys <= keys.length
		// Create the skip list from the values in keys[0] through keys[numKeys - 1]
				
		// The height used to determine number of next fields.
		height = log2(numKeys) + 1; 
				
		// The head node is initialized.
		head = new Node(Integer.MIN_VALUE, height); 
	
		// Populates the bottom level of the list.
		PopulatePerfectSkipList(head, keys, numKeys);
		
		// Connects the next fields throughout the list.
		ConnectPerfectSkipList(head, numKeys);
	}
	
	// Private method is used to populate the bottom section of the list.
	private void PopulatePerfectSkipList(Node head, int[] keys, int numKeys)
	{
		// A 'temp' variable is created to help populate the list.
		Node temp = head;
		
		// The loop populates the bottom section of the list.
		for (int i = 0; i < numKeys; i++)
		{						
			temp.next[0] = new Node(keys[i], height);
			temp = temp.next[0];
		}
	}
	
	// Private method is used to connect the next fields in the list.
	private void ConnectPerfectSkipList(Node k, int keySize)
	{
		// Counter variable and two Node variables. 
		int indexCounter;
		Node temp1;
		Node temp2;
		
		// The first for loop runs through the column  
		// portion (next fields) of the nodes in the list.
		for (int i = 1; i < height; i++)
		{
			// The two 'temp' variables help traverse through
			// and link the next fields of the list.
			temp1 = k;
			temp2 = k;
			
			// The second for loop runs through 
			// the row portion of the list.
			for (indexCounter = 1; indexCounter <= keySize; indexCounter++)
			{		
				temp2 = temp2.next[0];
				
				// The conditional determines if next fields
				// in question should be linked with each other.
				if (indexCounter % Math.pow(2, i) == 0)
				{
					// A link is established.
					temp1.next[i] = temp2; 
						
					// The 'temp' variables are reset.
					temp1 = temp2;
				}
			}
		}
	}
	
	/**
	 * The method searches through the Perfect
	 * Skip List structure in order to determine
	 * whether the value entered through the
	 * parameter is in the list.
	 * 
	 * @param k
	 * @return boolean value
	 */
	public boolean find(int k)
	{
		// If k is in the list return true. Otherwise, return false.
		// Your implementation must make use of the structure of the
		// skip list.
		
		// A Node variable, two boolean values, and an integer
		// for tracking the current height are created.
		Node temp = head;
		boolean isFound = false;
		boolean isSearching = true;
		int currentHeight = height - 1;
			
		// Loop looks at each node on current height until
		// the boolean value changes to false in the loop.
		while (isSearching)
		{	
			// System.out.println("Searching..."); --> Debugging statement
			// If at bottom list and there is no next item or at bottom list and search value < item in next
			// node, then not found.
			if ((currentHeight == 0 && temp.next[0] == null) || (currentHeight == 0 && k < temp.next[0].key))
			{
				isSearching = false;;
				// System.out.println("Item not found"); --> Debugging statement
			}
			
			// If search value == item in next node, then found.
			else if (temp.next[currentHeight] != null && k == temp.next[currentHeight].key)
			{
				isFound = true;
				isSearching = false;
				// System.out.println("Item found"); --> Debugging statement
			}
			
			// If search value < item in next node or there is no next
			// node, then move down one list.
			else if (temp.next[currentHeight] == null || k < temp.next[currentHeight].key)
			{
				currentHeight--;
				// System.out.println("Moved down one level"); --> Debugging statement
			}
				
			// If search value > item in next node, move to next node.
			else // (k > temp.next[currentHeight].key)
			{
				temp = temp.next[currentHeight];
				// System.out.println("Moved across the current level"); --> Debugging statement
			}
		}
		return isFound;
	}
	
	/**
	 * The method is used to display the execution of 
	 * various parts of the program by showing the values
	 * of the list structure at certain points in the 
	 * program.
	 * 
	 */
	public void printList()
	{
		// Print each list starting with the top list.
	    // Print one list per line with the items separated by commas.
		
		// The temporary Node value is set equal to head
		// and used to traverse through the list.
		Node temp;
		
		// The first loop evaluates height section of list.
		// The list is printed from bottom to top.
		for (int i = height - 1; i >= 0; i--) 
		{
			// String variable used to store data values.
			String listStruct = "";
				
			// The string is used to separate multiple items.
			String sep = "";
				
			// The 'temp' variable is set to traverse 
			// through a certain level.
			temp = head.next[i];
				
			// The second loop evaluates row section of list.
			while (temp != null)
			{
				// Values added to string variable.
				listStruct = listStruct + sep + temp.key;
							
				// Variable moves on to next Node at current height.
				temp = temp.next[i];
				sep = ",";
			}
				
			// Values are printed after list traversal.
			System.out.println(listStruct);
		}
	}
	
	/**
	 * The method determines the number of next
	 * fields that will be placed in each Node of
	 * the Perfect Skip List structure. A logarithm
	 * is implemented to complete this calculation.
	 * 
	 * @param bits
	 * 
	 * @return log + (bits >>> 1) 
	 * 
	 */
	private int log2(int bits)
	{
		// PRE: bits >= 0
		// Implementation taken from StackOverflow
		// https://stackoverflow.com/questions/3305059/
		// how-do-you-calculate-log-base-2-in-java-for-integers
		// returns floor)log(bits))
		int log = 0;
		
		if ( (bits & 0xffff0000) != 0)
		{
			bits >>>= 16;
			log = 16;
		}
		
		if (bits >= 256)
		{
			bits >>>= 8;
			log += 8;
		}
		
		if (bits >= 16)
		{
			bits >>>= 4;
			log += 4;
		}
		
		if (bits >= 4)
		{
			bits >>>= 2;
			log += 2;
		}
		return log + (bits >>> 1);
	}
	
}
