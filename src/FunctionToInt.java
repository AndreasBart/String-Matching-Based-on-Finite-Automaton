public interface FunctionToInt <T> {
    int sizeOfAlphabet();
    int apply(T param) throws IllegalArgumentException;
}
