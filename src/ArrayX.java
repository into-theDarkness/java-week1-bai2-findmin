public class ArrayX {
    public static int minValue(int [] array){
        int min =  array [0];
        int index = 0;
        for (int i = 0; i < array.length; i ++){
            if( array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr = {4,12,7,8,9,1,6};
        int index = minValue(arr);
        System.out.println("the smaller element in the array is: " +arr[index]);
    }
}
