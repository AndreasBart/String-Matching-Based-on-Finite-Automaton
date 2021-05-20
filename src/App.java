import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Character> liste = new ArrayList<Character>(){}; liste.add('x'); liste.add('s'); liste.add('x');
        UnicodeNumberOfCharIndex u = new UnicodeNumberOfCharIndex();
        SelectionOfCharsIndex s = new SelectionOfCharsIndex(liste);
        
        System.out.println(s.sizeOfAlphabet());
    }
}
