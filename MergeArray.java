import java.util.*;
class MergeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        merge(arr1,m,arr2,n);
    }
    public static void merge(int[] arr1, int n1, int[] arr2, int n2) {
        int i=0,j=0;
        int[] arr3=new int[n1+n2-1];
        int k=0;
        while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
            i++;    
        }else if(arr2[j]<arr1[i]){
            arr3[k]=arr2[j];
            j++;
        }
        else{
            arr3[k]=arr2[j];
            j++;
            i++;
        }
        k++;
       }
       while(i<n1){
        arr3[k]=arr1[i];
        i++;
        k++;
       }
       while(j<n2){
        arr3[k]=arr2[j];
        j++;
        k++;
       }
       for(int q=0;q<(n1+n2-1);q++){
        System.out.print(arr3[q]+" ");
       }
    }
}