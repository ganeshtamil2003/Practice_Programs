
#include <stdio.h>

int main() {
    int arr1[1000],arr2[1000];
   int n1=0,n2=0,num;
   while(scanf("%d",&num)==1){
       arr1[n1++]=num;
       if(getchar()=='\n')
            break;
   }
   while(scanf("%d",&num)==1){
       arr2[n2++]=num;
       if(getchar()=='\n')
            break;
   }
   printf("1st Array: ");
   for(int i=0;i<n1;i++){
       printf("%d ",arr1[i]);
   }
   printf("\n2st Array: ");
    for(int i=0;i<n2;i++){
       printf("%d ",arr2[i]);
   }
   
    return 0;
}