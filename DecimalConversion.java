import java.util.*;
class DecimalConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        decimaltoHexa(n);
    }
    static void decimaltoBinary(int num){
        int[] arr=new int[32];
        int i=0;
        while(num>0){
            int rem=num%2;
            arr[i]=rem;
            num/=2;
            i++;
        } 
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
    static void binarytoDecimal(long num){
        int dec=0,i=0;
        while(num>0){
            long rem=num%10;
            dec+=rem * (int) Math.pow(2,i);
            num/=10;
            i++;
        }
        System.out.print(dec);
    }
    static void decimaltoOctal(int num){
        int[] arr=new int[32];
        int i=0;
        while(num>0){
            int rem=num%8;
            arr[i]=rem;
            num/=8;
            i++;
        } 
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    } 
    static void octaltoDecimal(long num){
        int dec=0,i=0;
        while(num>0){
            long rem=num%10;
            dec+=rem * (int) Math.pow(8,i);
            num/=10;
            i++;
        }
        System.out.print(dec);
    } 
    static void octaltoBinary(int num){
        int[] arr =new int[32];
        int i=0;
        while(num>0){
            int rem=num%2;
            arr[i]=rem;
            num/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
    static void binarytoOctal(long num){
        int octal=0,i=0;
        while(num>0){
            long rem=num%10;
            octal+=rem * (int) Math.pow(8,i);
            num/=10;
            i++;
        }
        System.out.print(octal);
    }
    static void decimaltoHexa(int num){
        char[] arr=new char[100];
        int i=0;
        while(num>0){
            int rem=num%16;
            if(rem<10)
                arr[i]=(char)(rem+'0');
            else
                arr[i]=(char)((rem-10)+'A');
            num/=16;
            i++;
        } 
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }  
}