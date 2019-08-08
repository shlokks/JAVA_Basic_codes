import java.util.ArrayList;

public class Main {

    // void function
    public static void main(String[] args) {

        // declaring an ArrayList of type integers
        ArrayList<Integer> arr = new ArrayList<>();

        // inserting values from 1 to 10 using for loop
        for (int i = 0 ; i < 10; i++) {
            arr.add(i+1);
        }

        // initially ArrayList is
        System.out.println("Initially: " + arr);

        // call function
        revise(arr);
        System.out.println("\nAfter revise: " + arr);

        // call removal function
        removal(arr);
        System.out.println("\nAfter removals: " + arr);

        // call removal function
        reverse(arr);
        System.out.println("\nAfter reverse: " + arr);
    }

    // revise method
    public static void revise(ArrayList<Integer> list) {

        // calculating size of list
        int size = list.size();

        // using for loop to implement the method
        for (int i = 0; i < size; i++) {

            // if index is odd
            if(i % 2 == 1) {

                // add that element to last position
                list.add(list.get(i));

                // Set current value to 3
                list.set(i, 3);
            }
        }
    }

    // removal method
    public static void removal(ArrayList<Integer> list) {

        // using for loop to remove all elements which are equal to 3
        for (int i = 0; i < list.size(); i++) {

            // if element at index is 3
            if(list.get(i).equals(3)) {

                // remove the element at this index
                list.remove(i);
                i = i-1;
            }
        }
    }

    // reverse method
    public static void reverse(ArrayList<Integer> list) {

        // using for loop to reverse the order of ArrayList
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {

            // creating a temporary variable to store value at index i
            int temp = list.get(i);

            // now set index i to value at index j
            list.set(i, list.get(j));

            // now set index j to value at index i, which is stored in temp variabl
            list.set(j, temp);
        }
    }
}
