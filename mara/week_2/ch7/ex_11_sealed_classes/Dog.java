package week_2.ch7.ex_11_sealed_classes;
/*Discussing *subclass modifiers*
 a subclass of a sealed class must contain one of the following modifiers
   * final, sealed, non-sealed
   * if sealed, non-sealed - it also allows the abstract modifier
 >>>>sealed - event - you mention who is invited, only them would join
                 all of them must appear at the event
             -also when typing sealed the permits list is required/ it must be extended
 >>>>final - won t invite anyone - the last one, the hierarchy ends here
 >>>>non-sealed - everyone can join by knowing this class name
 */
public sealed class Dog extends Animal permits LittleDog{
}
