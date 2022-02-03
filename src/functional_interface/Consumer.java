package functional_interface;

@FunctionalInterface
 public  interface Consumer<T> {
    void accept(T t);
}
