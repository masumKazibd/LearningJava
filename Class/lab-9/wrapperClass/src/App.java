import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String str;
        System.out.println("Hellow world");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        String[] lst = str.split("");
        List<String> ls = new ArrayList<>();
        Set<String> st = new HashSet<>();

        for(String item : lst){
            st.add(str);
            ls.add(item);
        }
        
        for(String item : lst){
            System.out.println(item);
        }
        System.out.println("List Size:" + ls.size());
        System.out.println("Set Size:" + st.size());

        Iterator it = st.iterator();
        while ((it.hasNext()))
        {
            {
                System.out.println(it.next());
            }
        }
    }
}