package week_2.ch7.ex_12_sealed_classes_optional_permits;
//case 2) PERMITS might be omitted for the nested class
//however, if you want to specify be aware of the syntax
//public sealed class NestedSnake permits NestedSnake.Cobra{
public sealed class NestedSnake {
    final class Cobra extends NestedSnake{
    }
}
