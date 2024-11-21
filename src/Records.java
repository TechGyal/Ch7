/*
 * Illegal Modifiers: abstract and static]
 * 
 * When you explicitly define a method with the same name and signature as the
 * automatically generated accessor in a record, your implementation replaces
 * the generated one
 */
public final record Records(int age) { // canonical constructor

    // Overloaded constructor
    public Records() {
        this(-1); // call canonical constructor with a default age
    }


    // Compact constructor - for validation or pre-processing logic
    public Records {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }


    /**
     * Does not need an override annotation because it does not override a
     * method from a super class or interface > defines a mthod that happens to
     * have the same name as record's automatically generated accesor method
     * 
     * @return good
     */
    public int age() {
        return age;
    }

    // no setter methods
}
