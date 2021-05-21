abstract class PartialMatchLengthUpdate <T> {
    protected FunctionToInt<T> func_obj;
    PartialMatchLengthUpdate(FunctionToInt<T> obj){
        func_obj = obj;
    }
    abstract public int getPartialMatchLengthUpdate(int index, T obj);

    
    protected int computePartialMatchLengthUpdateValues(T[] searchString){
        return 1;
    }
}