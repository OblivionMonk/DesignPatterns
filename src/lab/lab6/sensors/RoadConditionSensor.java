package lab.lab6.sensors;

/**
 * Lab 6
 * @author scz
 */
public class RoadConditionSensor implements ISensor {
    
    private static final String DESC = "Road condition sensor is running...";
    
    public RoadConditionSensor() {
    }

    public String getDescription() {
        return DESC;
    }

    public String toString() {
        return this.getDescription();
    }
}
