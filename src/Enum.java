public class Enum {
    enum Fruits {
        // Enum constants
        MANGO {
            public String getColor() {
                return "Yellow";
            }
        },
        STRAWBERRY {
            public String getColor() {
                return "Red";
            }
        },
        GRAPES {
            public String getColor() {
                return "Purple";
            }
        },
        MELON {
            public String getColor() {
                return "Green";
            }
        }; // needs a semi colon

        static final Fruits DEFAULT = MANGO;

        /**
         * Enum constructors are implicitly private only
         */
        private Fruits() {
        }


        public String getFruit() {
            /**
             * using an enum in a switch expression, the case statement must be
             * made up of the enum values only not including the name: Fruits
             */
            return switch (this) { // this is based on the object that calls it
                case MANGO -> "Mango";
                case STRAWBERRY -> "Strawberry";
                case GRAPES -> "Grapes";
                case MELON -> "Melon";
            };
        }


        // Abstarct method for each enum constant
        /**
         * access modifier needs to be public
         * because all enum constants must
         * implement it, and their
         * mplementations will be public by
         * default.
         * 
         * @return
         */
        public abstract String getColor(); 
    }

    public static void main(String... args) {
        Fruits mango = Fruits.MANGO;
        Fruits defaultFruit = Fruits.DEFAULT;
        System.out.print(defaultFruit.getFruit());
        System.out.print(mango.getColor());

        // Ordinal starts at 0
        for (Fruits e : Fruits.values())
            System.out.print(e.ordinal() + " "); 
    }
}
