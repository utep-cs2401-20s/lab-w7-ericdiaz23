class sortOfSorted {
    public static void main(String[] args) {

        // Main Testing
        int[] a = {2,7,1,3,0,9,6,5};
        sortOfSorted(a);
        for(int i = 0; i < a.length; i++){
                System.out.print(a[i]);
        }
    }

    public static int[] sortOfSorted(int[] a){
        boolean sw = false;
        int start = 0; // Front Pointer
        int end = a.length-1; // Rear Pointer
        int max = 0; // Largest in Array Variable
        int temp = 0;



        for(int i = 0; i < a.length; i++){
            for(int j = start; j <= end; j++){
                if(a[j] > a[max]) max = j;
                // Discovers largest number between pointer start and end

            }

            if(i % 2 == 0){
                sw = !sw;
                // Gives us the "two-skip"
            }
            if(sw){
                // Switching nth largest value between to end pointer position, decrementing end pointer
                temp = a[end];
                a[end] = a[max];
                a[max] = temp;
                end--;
                max = start;

            }
            else{
                // Switching nth largest value between to start pointer position, incrementing start pointer
                temp = a[start];
                a[start] = a[max];
                a[max] = temp;
                start++;
                max = start;

            }
        }
        return a;
    }

}