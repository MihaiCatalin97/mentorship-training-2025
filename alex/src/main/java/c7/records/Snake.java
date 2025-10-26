package c7.records;

record SnakeRecord(Object data) {}

public class Snake{
    static long show(SnakeRecord snakeRecord){
        return switch(snakeRecord){
            case SnakeRecord(Long a) -> a + 1;
            case SnakeRecord(Integer a) -> a + 2;
            case SnakeRecord(Number a) -> a.intValue() + 3;
            case SnakeRecord(Object a) -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(show(new SnakeRecord(1)));
        System.out.println(show(new SnakeRecord(2L)));
        System.out.println(show(new SnakeRecord(3.0)));
    }
}
