import java.util.*;
class ConcatenateStringsLexically{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split("\\s+");
        Arrays.sort(words);
        for(String w:words){
         System.out.print(w+" ");
        }
    }
    
}