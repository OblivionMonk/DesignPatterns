package lab.lab6.sensor_manager;

public class EagerSingletonSensorsManager extends SingletonSensorManager{
    private static SingletonSensorManager uniqueInstance = new EagerSingletonSensorsManager();

    private EagerSingletonSensorsManager(){}

    public static SingletonSensorManager getInstance(){
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a Singleton";
    }
}

