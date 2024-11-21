public sealed class SealedClass permits NonSealedClass, SealedClassChild {
    @Override
    public String toString() {
        return "SealedClass";
    }


    public static void main(String[] args) {
        var obj = new NonSealedClass("Example", 42);
        System.out.println("Instance created: " + obj);

        SealedClass sc = new SealedClass();
        SealedClass fc = new FinalClass();

        System.out.println(sc.toString());
        System.out.println(fc.toString());
    }
}




// Can not set as public -> error: in seperate file
non-sealed class NonSealedClass extends SealedClass {
    public NonSealedClass(String s, Integer i) {
        super();
    }


    @Override
    public String toString() {
        return "NonSealedClass";
    }
}




sealed class SealedClassChild extends SealedClass permits FinalClass {
    public String toString() {
        return "SealedClassChild";
    }

}




final class FinalClass extends SealedClassChild {

    public String toString() {
        return "FinalClass";
    }


    public FinalClass() {

    }
}
