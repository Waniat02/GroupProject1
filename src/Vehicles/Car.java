package Vehicles;

/**
 * Represents a car in the parking system.
 * 
 * This class extends the Vehicle abstract class and provides specific
 * functionality for cars. Cars have a higher hourly parking rate compared
 * to motorcycles, reflecting their larger size and space requirements.
 * 
 * @author Group Project Team
 * @version 1.0
 * @since 2025
 */
public class Car extends Vehicle<String> {
    
    /**
     * Constructs a new Car with the specified license plate and state.
     * 
     * @param licensePlate the car's license plate number
     * @param state the state where the car is registered
     */
    public Car(String licensePlate, String state) {
        super(licensePlate, state);
    }

    /**
     * Constructs a new Car with the specified license plate, state, and car type.
     * 
     * @param licensePlate the car's license plate number
     * @param state the state where the car is registered
     * @param carType the specific type of car (e.g., "Sedan", "SUV", "Sports")
     */
    public Car(String licensePlate, String state, String carType) {
        super(licensePlate, state, carType);
    }

    /**
     * Gets the hourly parking rate for cars.
     * 
     * Cars have a higher hourly rate ($2.50) compared to motorcycles
     * due to their larger size and space requirements.
     * 
     * @return the hourly rate for cars as a double value (2.5)
     */
    @Override
    public double getRatePerHour() {
        return 2.5;
    }
}
