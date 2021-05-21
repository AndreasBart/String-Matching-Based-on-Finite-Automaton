abstract public class EnumIndex <T> implements FunctionToInt<Enum>{

    Enum<T> enumeration = new Enum<T>();

    public EnumIndex(Class <T> enumClass){
        enumeration = enumClass;
    }
    public int sizeOfAlphabet(){  
        return 1;
    }
    
    public int apply(T param){
       return 1;
    }
}