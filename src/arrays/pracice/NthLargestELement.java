package arrays.pracice;

public class NthLargestELement {
    public static void main(String[] args) {
        int[] array = {100, 200, 49, 45, 9};

        int n = 2;
        int finalMax = 0;
       // secondLargestNumber(array, n);
        nthLargesr(array, n);
        boolean[] visisted = new boolean[array.length];
//        for (int i = 0 ; i < n ; i++) {
//            int max = Integer.MIN_VALUE;
//            int maxIndex = 0;
//            for (int j = 0 ; j < array.length ; j++) {
//                if(max < array[j] && visisted[j] != true) {
//                    max = array[j];
//                    maxIndex = j;
//                }
//            }
//            visisted[maxIndex] = true;
//            finalMax = max;
//        }
       // System.out.println(finalMax);
       // nthLargest2(array, n);
      //  eqsyWay(array, n);
       // nthLargest(array, n);
        //ClearNthLargers(array, n);
    }
    public static void nthLargest(int[] arr, int n) {
        int max = 0;
        int maxIndex = 0;
        for (int k = 0; k < n; k++) {
            // Remove the largest element

            max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    maxIndex = i;
                    max =  arr[i];
                }
            }
            arr[maxIndex] = Integer.MIN_VALUE; // remove largest
        }
        System.out.println(max);

    }

    public static void nthLargest2(int[] arr, int n)  {
        //{100, 200, 49, 45, 9};
        int largest = arr[0];
        boolean[] check = new boolean[arr.length];
        for (int i = 0 ; i < n ; i++) {
            largest = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0 ; j < arr.length ; j++) {
                if(largest < arr[j] && check[j] == false) {
                    largest = arr[j];
                    index = j;

                }

            }
            check[index] = true;
           // System.out.println(largest);

            //System.out.println(largest);
        }
        System.out.println(largest);
    }

    public static void ClearNthLargers(int[] arraya, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++) {
            max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0 ; j < arraya.length ; j++) {
                if(max < arraya[j]) {
                    max = arraya[j];
                    maxIndex = j;
                }
            }
            arraya[maxIndex]  = Integer.MIN_VALUE;
        }
        System.out.println(max);
    }

    public static void secondLargestNumber(int[] array, int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            largest = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0 ; j < array.length ; j++) {
                if(largest < array[j]) {
                    largest = array[j];
                    index = j;
                }
            }
            array[index] = Integer.MIN_VALUE;;
        }
        System.out.println(largest);
    }
    public static void nthLargesr(int[] arraya, int n) {
        int nthMax = 0;
        for (int  i = 0 ; i < n ; i++) {
            int max = Integer.MIN_VALUE, index = 0;
            for (int j = 0 ; j < arraya.length ; j++) {
                if(max < arraya[j]) {
                    max = arraya[j];
                    index = j;
                }

            }
            arraya[index] = Integer.MIN_VALUE;
            nthMax = max;
        }
        System.out.println(nthMax);
    }


}
