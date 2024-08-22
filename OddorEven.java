import java.util.*;
class OddorEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr1=new int[num];
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }
        String result=oddorevenReturn(arr1,num);
        System.out.println(result);
    }
    public static String oddorevenReturn(int[] arr,int num){
        String str="";
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                str=str+"even";
            }
            else{
                str=str+"odd";
            }
        }
        return str;
    }
}