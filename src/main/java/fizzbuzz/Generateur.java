package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Generateur  {
    public List<Integer> extraire_list(int i) {
        List<Integer> list=new ArrayList<>();
        if(i==0) throw new InvalidInputException("is equal 0");
        for(int j=1;j<=i;j++) list.add(j);

        return list;
    }
}
