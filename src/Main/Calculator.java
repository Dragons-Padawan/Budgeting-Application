package Main;

public class Calculator {
    // Default fields
    public double x = 0;
    public double y = 0;

    // Setters & Getters
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }

    public void setY(double y){ this.y = y; }
    public double getY(){
        return y;
    }

    public static double Subtraction(double x, double y){
        return x-y;
    }

    public static double Addition(double x, double y){
        return x+y;
    }

    public static double Divide(double x, double y){
        return x/y;
    }

    public static double Multiply(double x, double y){
        return x*y;
    }

    public static double Remainder(double x, double y){
        return x%y;
    }

    public static double Sum(double[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }



}
