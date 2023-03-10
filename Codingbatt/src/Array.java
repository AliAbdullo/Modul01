public class Array {
    public static void main(String[] args) {

        int[] massiv = {1, 2, 3, 4, 5, 4};
        int[] massiv2 = {7, 4, 2, 3, 1, 4, 5, 2, 4, 7};
        System.out.println(max(massiv));
    }

    public static int max(int[] arr) {
        int max = 0;
        int index = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && max <= arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
/*    public static int max(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            index= Math.max(i,arr.length-1);
//            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && max <= arr[i]) {
//                max = arr[i];
            }
        return index;
        }*/

/*//,       System.out.println(max(massiv2));
        ArrayList<Integer> arr= new ArrayList<>();

        for (int i = 0; i < massiv.length; i++) {
            int counter2 = 0;
            for(int j = i; j < massiv.length; j++ ){
                if(massiv[i] == massiv[j] && i != j){
                    counter2 ++;
                }

            }
            if(counter2 == 0){
                arr.add(massiv[i]);
            }

        }
        int array[] = new int[arr.size()];
        int k = 0;
        for(int i = arr.size()-1; i >= 0; i--){
            array[k++] = arr.get(i);

        }
        System.out.println(Arrays.toString(array));


//        System.out.println("array(massiv2) = " + Arrays.toString(array(massiv2)));


    }
    public class Task8 {
        public static void main(String[] args) {
            int[] arr = {7, 4, 2, 3, 1, 4, 5, 2, 4, 7};
//            oneElement(arr);*/
}
/*        public static void oneElement(int[] nums) {
            int j;
            for (int i = 0; i < nums.length; i++) {
                for (j = 0; j < i; j++) {
                    if (nums[i] == nums[j]) break;
                }
                if (i == j) System.out.printf("%d ", nums[i]);
            }
        }*/
//    }
  /*  public static int[] oneElement(int[] nums) {
        int counter = nums.length;
        int j;
        for (int i = 0; i < nums.length; i++) {
            for (j = 0; j < i; j++) {
                if (nums[i] == nums[j]) counter--;
                break;
            }
        }
        int[] array = new int[counter];
        for (int i = 0; i < nums.length; i++) {
            for (j = 0; j < i; j++) {
                if (nums[i] == nums[j])  break;
            }
            if (i == j) array[i] = nums[i];
        }
        return array;
    }*/


/*    public static String newStr(String str){
//        String StringBuilder=new StringBuilder();
        String newString = "";
        for (int i = 0; i < str.charAt(str.length()); i++) {

        }
        return newString;
    }*/

/*
    public  static int[] oneElement(int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            int counter2 = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == arr[i] && i != j){
                    counter2++;
                    arr[j] = -1;
                }

            }
           if(counter2 > 0){
               counter++;
           }
        }
        int [] massiv = new int [counter];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                massiv[k++] = arr[i];
            }
        }
        return massiv;
    }
*/

/*
    public static int max(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
*/

    /*    public static int max(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }*/
/*    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }*/
/*    public static int[] array(int[] arr) {
        int[] arrReverse = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrReverse[k++] = arr[i];
        }
        return arrReverse;
    }*/
/*    public static int[] oddNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }
        }
        int[] oddArr = new int[counter];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[k++] = arr[i];
            }
        }
        return oddArr;
    }  */
/*    public static int[] evenNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        int[] oddArr = new int[counter];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddArr[k++] = arr[i];
            }
        }
        return oddArr;
    }*/
