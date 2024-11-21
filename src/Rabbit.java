
public class Rabbit implements CanJump {
    static public void main(String[] args) {
        CanJump rabbit1 = new Bunny();
        Rabbit rabbut2 = new Bunny();
        Bunny rabbit3 = new Bunny();
        var rabbit4 = new Bunny();
        Object rabbit5 = new Bunny();
// Hare rabbit6 = new Bunny(); Type mismatch: can not convert from Hare to Bunny
    }


    @Override
    public boolean canJump(boolean jumps) {
        return jumps;
    }
}




class Hare extends Rabbit {
}




class Bunny extends Rabbit {
}
