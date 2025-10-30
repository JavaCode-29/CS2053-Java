import java.util.*;

public class WithGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();  // type safe
        list.add("Hello");
        list.add("World");
        // list.add(123); 

        for (String str : list) {
            System.out.println(str.toUpperCase());
        }
    }  // <-- make sure this closing brace exists for main()
}  // <-- and this one for class

