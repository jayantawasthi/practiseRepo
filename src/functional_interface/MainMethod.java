package functional_interface;


public class MainMethod {
    public static void main(String[] args) {

        Consumer consumer = (a) -> System.out.println("hello " + a);
        consumer.accept("sham bahadur");


        Predicate<String> predicate = (a) ->a.contains("s");
        boolean test = predicate.test("hello");
        System.out.println();


        Supplier supplier = ( )-> {
            int a = 246;
            int b = 223;
            if (a > b)
                return a;
            else
                return b;
        };

        System.out.println(supplier.get());

        System.out.println("this is changed by branch1");
        System.out.println("again  changed by branch1");
        System.out.println("this is changed by branch1");
        System.out.println("again  changed by branch1");
        System.out.println("again  changed by branch1");
        System.out.println("this is changed by branch1");
        System.out.println("again  changed by branch1");
        System.out.println("this is changed by branch1");
        System.out.println("again  changed by branch1");
        System.out.println("again  changed by branch1");


        System.out.println("again  changed by master");
        System.out.println("again  changed by master");
        System.out.println("again  changed by branch2");
        System.out.println("again  changed by branch2");


        System.out.println("again  changed by branch2");
        System.out.println("again  changed by branch2");

        System.out.println("update by   changed by branch1");
        System.out.println("update   changed by branch1");
        System.out.println("agian  by   changed by branch2);
        System.out.println("agian   changed by branch2");


    }
}
