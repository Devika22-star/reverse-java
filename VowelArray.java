public class VowelArray {
    public static void main(String[] args) {

        char[] arr = {'a','b','c','e','i','o','x','u'};

        System.out.println("Vowels in the array:");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
               arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U') {

                System.out.println(arr[i]);
            }
        }
    }
}