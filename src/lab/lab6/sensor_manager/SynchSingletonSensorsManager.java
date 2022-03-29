package lab.lab6.sensor_manager;

public class SynchSingletonSensorsManager extends SingletonSensorManager{
    private static SingletonSensorManager uniqueInstance;

    private SynchSingletonSensorsManager(){}

    public static synchronized SingletonSensorManager getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SynchSingletonSensorsManager();
            return uniqueInstance;
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a Singleton";
    }
}

