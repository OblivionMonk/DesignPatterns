package lab.lab6.sensor_manager;

import cours.SingletonPattern.Singleton;

public class DbleCheckedLockingSingletonSensorsManager extends SingletonSensorManager {
    private static SingletonSensorManager uniqueInstance = new DbleCheckedLockingSingletonSensorsManager();

    private DbleCheckedLockingSingletonSensorsManager(){super();}

    public static SingletonSensorManager getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new DbleCheckedLockingSingletonSensorsManager();
                }
            }
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a Singleton";
    }
}

