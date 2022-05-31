package fizzbuzz;

import static jdk.dynalink.linker.support.Guards.isInstance;

public class Validator {

    public boolean is_int(Object number) {
        if(number instanceof Double)throw new InvalidInputException("the number is decimal");
        if((int)number<1) throw new InvalidInputException("the number is less than one");
        return true;
    }
}
