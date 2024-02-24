import java.util.*;

class NumberGuessGame {
    public static void main(String[] aargs) {
        Random num = new Random();
        int n = num.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess a Number To Win the Game");
        System.out.println("You Have Maximum 5 Attemp Limit");
        int i = 0;
        int j = 4;
        while (i < 5) {
            System.out.println("Enter a Guess Number Between 1 to 100");
            int a = sc.nextInt();
            if (a > n) {
                System.out.println("Yours Guess Number is Greater");
            } else if (a < n) {
                System.out.println("Your Guess Number is Smaller");
            } else {
                System.out.println("OOhhOO!,Your Number is Correct.You  Win the Game!");
                System.exit(0);

            }
            i++;
            System.out.println("You have Remaining " + j-- + " Attemps");
            System.out.println();
        }

    }
}