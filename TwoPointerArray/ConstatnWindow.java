public class ConstatnWindow{
    public static void main(String[] args) {
        int[]arr={-1,2,3,3};
        int k=4;
        int i=0,j=0;
        int max=0;
        int sum=0;
        while(j<arr.length){
            if(j>=k-1){
                sum=sum+arr[j];
                max=Math.max(max, sum);
                sum=sum-arr[i];
                i++;
            }
           else{
            sum=sum+arr[j];
           }
            System.out.println("sum"+sum);
            j++;
        }
        System.out.println(max);
    }
}