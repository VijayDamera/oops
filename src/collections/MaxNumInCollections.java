package collections;

public class MaxNumInCollections {
    
    public static void main(String[] args) {
        // Array of numbers of size 8
        int numbers[] = new int[]{3,2,6,1,8,2,5,4};
        
        // Initialize the first element as the largest and smallest
        int largest = numbers[0];
        int smallest = numbers[0];
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

}

// Complexity. 
//Size of elements is n and since it is linear search or comparisons done n times. It is O(n)