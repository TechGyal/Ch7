// anonymous class
class NestedClassA {
    public void PancakesOrWaffles() {
        System.out.print("Pancakes");
    }


    final class doesntWork {
    }

    // doesntWork dw = new doesntWork() {} -> error: can not extend a final
    // class

    public static void main(String... args) {
        
        NestedClassA PickyMonster = new NestedClassA() {
            public void PancakesOrWaffles() {
                System.out.print("BACON");
            }
        };
        PickyMonster.PancakesOrWaffles();
        new NestedClassA().PancakesOrWaffles();

    }
}
