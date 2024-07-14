#include<stdio.h>
void merge(int arr[],int l,int m,int r){
    int n1=m-l+1;
    int n2=r-m;
    int Left[n1],Right[n2];
    int i=0,j=0,k=l;
    for(int i=0;i<n1;i++){
       Left[i]=arr[l+i]; 
    }
    for(int j=0;j<n2;j++){
        Right[j]=arr[m+1+j];
    }
        
    while(i<n1 && j<n2){
        if(Left[i]<Right[j]){
            arr[k]=Left[i];
            i++;
        }else{
            arr[k]=Right[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k]=Left[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k]=Right[j];
        j++;
        k++;
    }
}
void MergeSort(int arr[],int l,int r){
    if(l<r){
        int m=l+(r-l)/2;
        //int m=(l+r)/2;
        MergeSort(arr,l,m);
        MergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
int main(){
    int num;
    int size=0;
    int arr[1000];
    while(scanf("%d",&num)==1){
        arr[size++]=num;
        if(getchar()=='\n')
            break;
    }
   MergeSort(arr,0,size-1);
   for(int i=0;i<size;i++){
       printf("%d ",arr[i]);
   }
}