import fizzbuzz.Displayer;
import fizzbuzz.Generateur;
import fizzbuzz.Transformer;
import fizzbuzz.Validator;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int top_list=20;
        List <Integer> generated_list = new ArrayList<>();
        List<String> transformed_list = new ArrayList<>();


        if (new Validator().is_int(top_list))  generated_list = new Generateur().extraire_list(top_list);

        for (Integer integer : generated_list) {
            transformed_list.add(new Transformer().transform(integer));
        }

        new Displayer().display(transformed_list);
    }

}