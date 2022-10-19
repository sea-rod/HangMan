public class HangmanUtil extends HangmanView {

    void init_wrd(){
        char[] ch = new char[wrd_len];
        for(int i=0;i<wrd_len;i++){
            ch[i] = '_';
        }
        wrd = ch;
    }

    boolean check(char lttr){
        boolean bool = false;
        for(int i=0;i<wrd_len;i++)
        {
            if (lttr == word[i]){
                wrd[i] = lttr;
                bool = true;
            }
        }
        return bool;
    }

    void decrese_wrg(){
        wrg += 1;
        printHangman(wrg);
    }

    boolean check_comp(){
        for(int i=0;i<wrd_len;i++)
            if(wrd[i] != word[i])
                return true;
        return false;
    }


}
