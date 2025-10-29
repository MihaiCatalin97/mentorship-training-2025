package week_2.ch7.ex_11_sealed_classes;

//it will not compile as long as it is not extended by the classes
//specified in permits list
public sealed class Animal permits Dog, Bear, Horse{

}
