package c7.records;

record Bmw(String model, int yearOfFabrication){}

public class Car {
    public static void main(String[] args)
    {
        var car = new Bmw("Series 3",2021);
        if(car instanceof Bmw(String modelbmw, int year)) // nu ne trebuie reference variables
                                                        // redefinim un pattern compatabil cu bmw ca sa folosim ca var locale
        {
            System.out.println("Bmw model " + modelbmw);
            System.out.println("year of fabrication " + year);
        }
        var car2 = new Bmw("Series 4",2021);
        /*if(car2 instanceof Bmw(String model2,int year2 ) mybmw){
            nu le putem folosi pe ambele, nu comp
        }*/
    }

}
