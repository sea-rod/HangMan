import java.util.Scanner;
public class Hangman extends HangmanUtil{
    public Hangman(String wrd){
        word = wrd.toLowerCase().toCharArray();
        wrd_len = wrd.length();
    }
    void run(){
        char lttr;
        boolean bool=true;
        Scanner scn = new Scanner(System.in);
        
        welcomeScreen();
        init_wrd();
        System.out.println("The word contains "+wrd_len+" letters");
        
        do{
        print_wrd();
        System.out.println("\nEnter a letter");
        lttr = scn.nextLine().charAt(0);
        if (check(lttr))
            bool = check_comp();
            
        else{
            decrese_wrg();
            System.out.println("You Have "+(6-wrg)+" Chances Left");
        }
        }while(bool && wrg < 6);

        if (bool)
            lose();    
        else
            win();
        scn.close();
    }
}
