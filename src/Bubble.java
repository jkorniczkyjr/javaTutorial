/**
 * bubble sort example
 */
class Bubble {
    public static void main() {
        int nums[] = {99,-10,100123,18,-978,5623,463,-9,287,49};

        int a, b, t;
        int size = 10; // number of elements in the array

        // display original array
        System.out.println("Original array is:");
        for(int i=0; i<size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // This is the bubble sort
        for(a=0; a<size; a++) {
            for(b=size; b>=a; b--) {
                if(nums[b-1] > nums[b]) {
                    //if out of order, exchange
                    t=nums[b-1];
                    nums[b-1]=nums[b];
                    nums[b]=t;
                }
            }
            //display sorted array
            System.out.print("sorted array is:");
            for(int i=0; i<size;i++) System.out.print(" " + nums[i]);
            System.out.println();
        }

    }
}
