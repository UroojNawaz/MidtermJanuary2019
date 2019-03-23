package design;

public abstract class AbstractClass implements Employee{

    final String empName = "Marilyn Monroe";
    static String resignationDate = "05/10/1960";
    int rating;

    //Method overloading
    public void performance (){}
    public void performance(String rating) {}

    //Method overloading
    public void farewell(){}
    public void farewell(int date) {}

}
