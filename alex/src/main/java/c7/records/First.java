package c7.records;

public record First(int number, String name) {

    public First(int number, String name) {
        if (number < 0 || number > 100) throw new IllegalArgumentException();
        else this.number = number;
        this.name = name;
    }

    public static void main(String[] args){
        var var1 = new First(2,"andrei");
        var var2 = new First(3,"daniel");
        var copy = new First(2,"andrei");

        System.out.println(var1.equals(var2));
        System.out.println(var1.equals(copy));
    }
}
