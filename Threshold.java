import java.util.*;
class Threshold{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        int count=0;
        for(int i=0;i<num;i++){
            count+=arr[i]/k;
            if(arr[i]%k!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}