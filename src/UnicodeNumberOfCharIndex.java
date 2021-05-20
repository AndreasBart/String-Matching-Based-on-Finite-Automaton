public class UnicodeNumberOfCharIndex implements FunctionToInt<java.lang.Character> {
    
    public int sizeOfAlphabet(){
        return Character.SIZE;
    }
    public int apply(Character c){
        int i = c;
        return i;
    }
}
