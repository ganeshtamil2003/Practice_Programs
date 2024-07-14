import java.util.*;
class EachRowSum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr1=new int[r][c]; //array creation
        //getting input
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int firstSum=0;
        for(int j=0;j<c;j++){
            firstSum+=arr1[0][j];
        }
        int flag=0;
        for(int i=1;i<r;i++){
            int rowSum=0;
            for(int j=0;j<c;j++){
                rowSum+=arr1[i][j];
            }
            if(rowSum!=firstSum){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}