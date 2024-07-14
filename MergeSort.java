import java.util.*;
class MergeSort{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        MergeSort ms=new MergeSort();
        ms.mergeSort(n1,n2,arr1,arr2);
    }
    void mergeSort(int n1,int n2,int arr1[],int arr2[]){
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr2[j]>arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<n1){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<n2){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
}