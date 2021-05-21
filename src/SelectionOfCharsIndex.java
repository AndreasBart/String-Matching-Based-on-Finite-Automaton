import java.util.ArrayList;
import java.util.List;

public class SelectionOfCharsIndex implements FunctionToInt<java.lang.Character> {

    Character[] theChars;

    SelectionOfCharsIndex(List<Character> list){
        List<Character> theCharsList =  new ArrayList<Character>();
        Character c;
        boolean duplicate = false;

        for(int i = 0; i < list.size(); i++){
            c = list.get(i);
            for(int j = 0; j < theCharsList.size(); j++){
                if(theCharsList.get(j) == c) {duplicate = true; break;}
            }
                if(!duplicate){
                    theCharsList.add(c);
                }
        }

        theChars = new Character[theCharsList.size()];

        for(int i = 0; i < theCharsList.size(); i++){
            theChars[i] = theCharsList.get(i);
        }
    }

    public int apply(Character c){
        boolean hit = false;
        try{
          for(int i = 0; i < theChars.length; i++ ){
            if(theChars[i] == c) return i;
          } 
          if(!hit){throw(new Exception("Character nicht enthalten"));}  
        }catch(Exception e){System.out.println(e);}
        return 0;

    }
    public int sizeOfAlphabet(){
        return theChars.length;
    }
}
