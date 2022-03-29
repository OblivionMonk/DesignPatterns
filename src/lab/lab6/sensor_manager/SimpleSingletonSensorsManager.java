package lab.lab6.sensor_manager;

public class SimpleSingletonSensorsManager extends SingletonSensorManager {
    private static SingletonSensorManager uniqueInstance;

    private SimpleSingletonSensorsManager(){}

    public static SingletonSensorManager getInstance(){
        if(uniqueInstance == null){
            return uniqueInstance = new SimpleSingletonSensorsManager();
        }
            return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a Singleton";
    }
}
