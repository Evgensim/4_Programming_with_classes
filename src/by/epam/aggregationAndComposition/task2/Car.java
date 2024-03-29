package by.epam.aggregationAndComposition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Car {

    private boolean move;
    private String model;
    private Wheel[] wheel;

    public Car(String model, Wheel[] wheel) {
        this.model = model;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public boolean isMove() {
        return move;
    }

    public void drive() {
        this.move = true;
        System.out.println("Car rides");
    }

    public void stop() {
        this.move = false;
        System.out.println("Car stopped");
    }

    public void refuel(int liters, Engine engine) {
        if (!isMove()) {
            engine.addFuel(liters);
            System.out.println("The car is filled with " + liters + " liters.");
            System.out.println("Now the volume of fuel is: " + engine.getFuel() + " liters.");
        }
    }

    public void replaceWheel(int diameter, int wheelNumber) {
        if (!isMove()) {
            System.out.println("Wheel with number " + wheelNumber + " replaced by wheel with diameter " + diameter);
            wheel[wheelNumber].setDiam(diameter);
        }
    }
}
