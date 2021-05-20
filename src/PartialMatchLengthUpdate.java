abstract class PartialMatchLengthUpdate <T> {
    protected FunctionToInt<T> func-obj;
    PartialMatchLengthUpdate(FunctionToInt<T> obj){
        func-obj = obj;
    }
    abstract public int getPartialMatchLengthUpdate(int index, T obj){

    }
    protected int computePartialMatchLengthUpdateValues(T[] searchString){
        
    }
}