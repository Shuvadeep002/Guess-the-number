import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int random=1+(int)(Math.random()*100);
        System.out.println("******Lets play a game******\n\t    (*_*)\nYou have to guess a number between 1 to 100");
        while(random>0){
            System.out.print("\n\nWhat is your number-->  ");
            int num=sc.nextInt();
            if(num>random){
                System.out.println("\nOOPS little less");
            }
            if(num<random){
                System.out.println("\nOOPS little higher");
            }
            if(num==random){
                System.out.print("\nHurray!! You are correct\n\nif you want to stop press 0\nor\nif you want to continue press 1\n");
                int x=sc.nextInt();
                random=x;
            }
        }


    }
}
