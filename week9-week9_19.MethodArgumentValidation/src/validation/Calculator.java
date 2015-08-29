package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        //throws exception for the 
        if (fromInteger < 0){
            throw new IllegalArgumentException("Please enter non negative integer.");
        }
        
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {

        if (setSize < 0 || subsetSize < 0 || setSize < subsetSize){
            throw new IllegalArgumentException("Numbers must be positive and setSize must be"
                    + " greater than subsetSize");
        }
        
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
