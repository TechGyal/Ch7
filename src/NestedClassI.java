/**
 * 4 types:
 * - anonymous class
 * - inner (nested) class
 * - static
 * - local classes
 */

// inner class
public class NestedClassI {
    @SuppressWarnings("unused")
    private int num = 0;

    private NestedClassI() {
    }

    protected class InnerClass {
        private InnerClass() {
        }

        /**
         * an only use final or effectively final variables from
         * the enclosing scope
         */
        int num = 1;

        public void print() {
            System.out.print(num);
        }
    }

    public static void main(String... args) {
        var movie = new NestedClassI();
        movie.new InnerClass().print();

        NestedClassI.InnerClass ic = new NestedClassI().new InnerClass();
        ic.print();
    }
}

// class extendsClass extends NestedClasses {} -> error: NestedClasses
// constructor is not visibe
