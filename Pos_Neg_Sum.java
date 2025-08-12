public class Pos_Neg_Sum {
    public static void main(String[] args) {
        int arr[]={5,-10,50,-45};
        int postivesum=0;
        int negativesum=0;
        for (int i = 0; i < arr.length; i++) {
            if(i>0){
                postivesum +=arr[i];
            }else {
                negativesum +=arr[i];
            }
        }
        System.out.println(postivesum);
        System.out.println(negativesum);
    }
}