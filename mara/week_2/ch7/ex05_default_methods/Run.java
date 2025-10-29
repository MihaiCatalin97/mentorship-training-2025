package week_2.ch7.ex05_default_methods;

public interface Run {
    public default int getSpeed() {
        return 100;
    }
}
