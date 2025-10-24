interface CanHop {}
public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}