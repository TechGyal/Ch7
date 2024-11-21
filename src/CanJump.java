
public interface CanJump {
    boolean canJump(boolean jumps); // access modifier not specified
    
    /**
     * static variable is declared inside an interface, it is automatically
     * public, static, and final
     */
    final int num = 0;
    static String my_static_variable = "Hi im static"; // static variables need
                                                       // to be initialized

    default void move() {
        System.out.print("Jump");
    }


    /**
     * private methods permitted "helper method" but not inherited
     * 
     * @return
     */
    private static Object methodExample() {
        return null;
    }

    /**
     * default methods only permitted in interfaces
     */
    default void methodExample2() {};
    
    // default static void dontMove() {} -> error: Illegal combination of
    // modifiers for the interface method move; only one of abstract, default,
    // or static permitted


    

    // void method() {} -> error: Non-static interface methods with a body must
    // be explicitly marked private or default

    // protected void method(); -> error: Illegal modifier for the interface
    // method method; only public, private, abstract, default, static and
    // strictfp are permitted
}




interface CanSwim {
    default void move() {
        System.out.print("Jump");
    }
}




class Frog implements CanJump, CanSwim {

    /**
     * inherited method is implicity public -> declare as public to reducing
     * visibility
     */
    @Override
    public boolean canJump(boolean jumps) {
        return jumps;
    }


    /**
     * if a class or interface inherits two interfaces containing default
     * methods with the same signature, it must override the method with its own
     * implementation
     */
    public void move() {
        System.out.print("Sit");
    }


    public void jump() {
        /**
         * The way to access an inherited default method is by using the syntax
         * Interface.super.method()
         */
        CanJump.super.move();
    }


    public void swim() {
        /**
         * The way to access an inherited default method is by using the syntax
         * Interface.super.method()
         */
        CanSwim.super.move();
    }


    public static void main(String... args) {
        System.out.print(new Frog().canJump(true));

    }

}
