import java.util.*;
class GuesstheNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int guess = (int) (Math.random()*100);
        int times=10;
        System.out.println(" **Guess the Number within 10 Guess** ");
        System.out.println("Enter the Number between (0 to 101) : ");
        while(times > 0){
            int number = sc.nextInt();
            if(number == guess){
            System.out.println("You've Guessed Right");
            break;
            }
            else if(number > guess){
                System.out.println("You've Entered Greater than Answer");
                times--;
                System.out.println( times + " Guess left" );
                
            }
            else if(number < guess){
                System.out.println("You've Entered Lesser than Answer");
                times--;
                System.out.println( times + " Guess left" );

            }
        }
        //System.out.println(guess);

    }
}