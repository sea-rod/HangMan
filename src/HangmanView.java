public class HangmanView {
    char[] word;
    char[] wrd;
    int wrg=0;
    int wrd_len;

    void welcomeScreen(){
        System.out.println("            Welcome to Hangman");
    }

    void print_wrd(){
        for(int i=0;i<wrd_len;i++)
        System.out.print(wrd[i]+" ");
    }

    void printHangman(int w){
        System.out.println("   ___\n  |   |");
        switch (w) {
            case 1:System.out.println("  |   O");break;
            case 2:System.out.println("  |  \\O");break;
            case 3:System.out.println("  |  \\O/");break;
            case 4:System.out.println("  |  \\O/\n  |   |");break;
            case 5:System.out.println("  |  \\O/\n  |   |\n  |  /");break;
            case 6:System.out.println("  |  \\O/\n  |   |\n  |  / \\");break;
            default:
                break;
        }
        System.out.println("  |\n-------");
    }

    void win(){
        System.out.println("############    congrats    ############");
        System.out.println();
    }

    void lose(){
        System.out.println("############    you lost   ############");
        System.out.println("############    try again   ###########");
    }
}
