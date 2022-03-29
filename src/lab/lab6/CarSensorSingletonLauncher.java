package lab.lab6;

import lab.lab6.sensor_manager.*;
import lab.lab6.sensors.RoadConditionSensor;
import lab.lab6.sensors.SpeedSensor;
import lab.lab6.sensors.TemperatureSensor;

/**
 * Lab 6
 * @author scz
 */
public class CarSensorSingletonLauncher {
    
    public CarSensorSingletonLauncher() {
    }
    
    public static void main(String[] args) {
        CarSensorSingletonLauncher launcher = new CarSensorSingletonLauncher();
        launcher.launch();
    }
    
    public void launch() {
        this.test(SimpleSingletonSensorsManager.getInstance());
        this.test(SynchSingletonSensorsManager.getInstance());
        this.test(EagerSingletonSensorsManager.getInstance());
        this.test(DbleCheckedLockingSingletonSensorsManager.getInstance());
    }

    private void test(SingletonSensorManager manager) {
        manager.addSensor(new TemperatureSensor());
        manager.addSensor(new SpeedSensor());
        manager.addSensor(new RoadConditionSensor());
        manager.printState();
    }


}
