public class VariablesAndNames {
    public static void main(String[] args) {
        
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //Initialize cars as 100
        cars = 100;
        //4.0 is not actually necessary for space_in_a_car, but if it is just 4, then it is accurate.
        //A "floating point" number has a decimal point.
        //Initialize space_in_a_car as 4.0
        space_in_a_car = 4.0;
        //Initialize drivers as 30
        drivers = 30;
        //Initialize passengers as 90
        passengers = 90;
        //Initialize cars_not_driven as cars minus drivers
        cars_not_driven = cars - drivers;
        //Initialize cars_driven as the value of drivers
        cars_driven = drivers;
        //Initialize carpool_capacity as cars_driven times space_in_a_car 
        carpool_capacity = cars_driven * space_in_a_car;
        //Initialize average_passengers_per_car as passengers divided by cars_driven
        average_passengers_per_car = passengers / cars_driven;

        // = assigns value on the right to variable on the right
        // _ is an underscore character

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
        
    }
}
