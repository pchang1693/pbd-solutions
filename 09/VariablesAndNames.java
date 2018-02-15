public class VariablesAndNames {
    public static void main(String[] args) {
        
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInACar, carpoolCapacity, averagePassengersPerCar;

        //Initialize cars as 100
        cars = 100;
        //4.0 is not actually necessary for spaceInACar, but if it is just 4, then it is less accurate.
        //A "floating point" number has a decimal point.
        //Initialize spaceInACar as 4.0
        spaceInACar = 4.0;
        //Initialize drivers as 30
        drivers = 30;
        //Initialize passengers as 90
        passengers = 90;
        //Initialize carsNotDriven as cars minus drivers
        carsNotDriven = cars - drivers;
        //Initialize carsDriven as the value of drivers
        carsDriven = drivers;
        //Initialize carpoolCapacity as carsDriven times spaceInACar 
        carpoolCapacity = carsDriven * spaceInACar;
        //Initialize averagePassengersPerCar as passengers divided by carsDriven
        averagePassengersPerCar = passengers / carsDriven;

        // = assigns value on the right to variable on the right
        // _ is an underscore character

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
        
    }
}
