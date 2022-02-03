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

<<<<<<< HEAD
        System.out.println("this is changed by branch1");
<<<<<<< HEAD
        System.out.println("again  changed by branch1");
=======
        System.out.println("hello world");
>>>>>>> branch2
=======
>>>>>>> parent of b274d93 (new line added to main)gi

    }
}
