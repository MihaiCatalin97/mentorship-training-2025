package week_2.ch7.ex_14_sealed_classes_pattern_matching;
//without abstract keyword - compile error - default case needed
public abstract sealed class Fish permits Trout, Bass {
}
final class Trout extends Fish {
}
final class Bass extends Fish {
}
