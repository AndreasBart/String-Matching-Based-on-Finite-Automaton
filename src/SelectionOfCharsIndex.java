import java.util.ArrayList;
import java.util.List;

public class SelectionOfCharsIndex implements FunctionToInt<java.lang.Character> {

    char[] theChars;

    SelectionOfCharsIndex(List<Character> list){
        List<Character> theCharsList = new ArrayList<Character>();
        Character c;
        boolean duplicate = false;

        for(int i = 0; i < list.size(); i++){
            c = list.get(i);
            for(int j = 0; j < theCharsList.size(); j++){
                if(theCharsList.get(j) == c) duplicate = true; break;
            }
            if(!duplicate){
                theCharsList.add(c);
            }
        }
        theChars = new char[theCharsList.size()];
        for(int i = 0; i < theCharsList.size(); i++){
            theChars[i] = theCharsList.get(i);
        }
    }

    public int apply(Character c){
        return 1;
    }
    public int sizeOfAlphabet(){
        return theChars.length;
    }
}
