package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //part 1
       int bobSalary = 3000;
       int garySalary = 7000;
       int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("HighestSalary is: $" + highestSalary);

        //part 2
        int carPrice = 2000;
        int truckPrice = 700;
        int SmallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Smallest Price is: $" + SmallestPrice);

        //part 3
        double radius = 7.25;
        double AreaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius "+ radius +"is: "+ AreaOfCircle);

        //part 4
        double number = 5.0;
        double solution = Math.sqrt(number);
        System.out.println("Our solution after square root of " + number + "is: "+ solution);

        //part 5
        int [] a = {5,10};
        int [] b = {85, 50};
        double ans = Math.pow((b[0]-a[0]),2) + Math.pow((b[1]-a[1]),2);
        double distance = Math.sqrt(ans);
        System.out.println("distance is: "+ distance);

        //part 6
        double GivenNumber = -3.8;
        System.out.println("Absolute value of -3.8 is : "+Math.abs(GivenNumber));

        //part 7
        System.out.println(Math.random() * 1);

    }
}
