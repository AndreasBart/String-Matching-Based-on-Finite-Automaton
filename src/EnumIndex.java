abstract public class EnumIndex implements FunctionToInt<Enum>{

    Enum enumeration;

    public EnumIndex(Enum enumClass){
        enumeration = enumClass;
    }
    public int sizeOfAlphabet(){  
        return 1;
    }
    public void apply( ){
       
    }
}