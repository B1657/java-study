public class LargestNo {
    public static void main(String[] args) {
        int [] number = {15,67,89,45,87,68,89,90,57,97,39,79,98};
        int largest = number[0];
        for(int i=0;i< number.length;i++){
            if (number[i]>largest){
                largest=number[i];
            }
        }
        System.out.println("The Largest number is:" +largest);
    }
}
