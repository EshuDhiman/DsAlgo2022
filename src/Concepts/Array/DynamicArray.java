package Concepts.Array;

//  Java program deals with all operation of a dynamic array
// add, remove, resize memory of array is the main feature
public class DynamicArray {
    // create three variable array[] is a array,
    // count will deal with no of element add by you and
    // size will with size of array[]
    private int array[];
    private int count;
    private int size;
    // constructor initialize value to variable

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }
    // function add an element at the end of array

    public void add(int data) {
        // check no of element is equql to size of array
        if (count == size) {
            growSize(); // make array size double
        } // insert element at end of array
        array[count] = data;
        count++;
    }

    // function makes size double of array
    public void growSize() {
        int temp[] = null;
        if (count == size) {

            // temp is a double size array of array and store array elements
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    // copy all array value into temp
                    temp[i] = array[i];
                }
            }
        }
        // double size array temp initialize into variable array again
        array = temp;

        // and make size is double also of array
        size = size * 2;
    }

    // function shrink size of array
    // which block unnecessary remove them
    public void shrinkSize() {
        int temp[] = null;
        if (count > 0) {

            // temp is a count size array // and store array elements
            temp = new int[count];
            for (int i = 0; i < count; i++) {

                // copy all array value into temp
                temp[i] = array[i];
            }

            size = count;

            // count size array temp initialize
            // into variable array again
            array = temp;
        }
    }

    // function add an element at given index
    public void addAt(int index, int data) {
        // if size is not enough make size double
        if (count == size) {
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {

            // shift all element right from given index
            array[i + 1] = array[i];
        }

        // insert data at given index
        array[index] = data;
        count++;
    }

    public void remove() {
        if (count > 0) {

            array[count - 1] = 0;
            count--;

        }
    }

    public void removeAt(int index) {
        // taking par at which index u want to remove the element in array
        if (count > 0) { 
            //checking if there are elements in array 
            for (int i = index; i < count - 1; i++) {
                // shifting the elements till the removed index
                array[i] = array[i + 1]; 

            }
            array[count - 1] = 0;  //setting last element 0
            // decreasing the count by one bcz removed an elemnt

            count--;
        }
    }
    public static void main(String[] args)
    {
        DynamicArray da = new DynamicArray();
 
        // add 9 elements in array
        da.add(1001);        da.add(43535);
        da.add(2312);        da.add(342234);
        da.add(313);        da.add(4552);
        da.add(321321);        da.add(54444);
        da.add(432);
 
        // print all array elements after add 9 elements
        System.out.println("Elements of array:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
 
        System.out.println();
 
        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " +  da.count);
 
        // shrinkSize of array
        da.shrinkSize();
 
        // print all array elements
        System.out.println("Elements of array "+
                   "after shrinkSize of array:");
        
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();
 
        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " +   da.count);
 
        // add an element at index 1 shifting..
        da.addAt(1, 22);
 
        // print Elements of array after adding an
        // element at index 1
        System.out.println("Elements of array after" +
                      " add an element at index 1:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
 
        System.out.println();
 
        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " +  da.count);
 
        // delete last element
        da.remove();
 
        // print Elements of array after delete last
        // element
        System.out.println("Elements of array after" +
                              " delete last element:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
 
        System.out.println();
 
        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " +
                                              da.count);
 
        // delete element at index 1
        da.removeAt(1);
 
        // print Elements of array after delete
        // an element index 1
        System.out.println("Elements of array after"+
                      " delete element at index 1:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();
 
        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
z        System.out.println("No of elements in array: " +
                                               da.count);
    }
}
