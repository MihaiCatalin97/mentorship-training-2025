package week_2.ch7.ex_12_sealed_classes_optional_permits;
// case 1) Permits list might be omitted when the classes are in the same file
//in other words, every class in this file might extend the sealed class Snake
public sealed class Snake {
}
final class Cobra extends Snake{
}
