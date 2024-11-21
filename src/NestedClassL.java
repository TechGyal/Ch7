// local class - definied within a constructor, method, or initializer block
class NestedClassL {

    public void OuterMethod() {
        int num = 0; // must be final or effectively final

        /**
         * class localClass {} -> error: illegal access modifier only final or
         * abstract for local classes
         */
        final class LocalClass {
            {
                System.out.print(num);
                final int num = 1;
                System.out.print(num);
            }
        }
        @SuppressWarnings("unused")
        LocalClass lc = new LocalClass();
    }
}
