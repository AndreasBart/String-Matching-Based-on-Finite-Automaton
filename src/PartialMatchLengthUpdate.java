abstract class PartialMatchLengthUpdate <T> {
    protected FunctionToInt<T> func_obj;

    PartialMatchLengthUpdate(FunctionToInt<T> obj){
        func_obj = null;
    }
    abstract public int getPartialMatchLengthUpdate(int index, T obj);

    
    protected int computePartialMatchLengthUpdateValues(T[] searchString){
        int k = 0;

        for(int l = 0; l < searchString.length/2; l++){
            int size = 2;
            int mid = searchString.length/2;
            Object[] linkeSeite = new Object[size/2];
            Object[] rechteSeite = new Object[size/2];

            int index = mid - size/2;
            for(int i = 0; i <= size/2; i++, index++){
                linkeSeite[i] = searchString[index];
            }

            index = mid;
            for(int i = 0; i <= size/2; i++, index++){
                rechteSeite[i] = searchString[index];
            }
            if(linkeSeite == rechteSeite) k = size/2; 
            size +=2;
        }
 
        return k;
    }

}