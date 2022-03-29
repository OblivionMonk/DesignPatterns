package lab.lab2.ex1;

import java.util.ArrayList;
import java.util.List;

public class PatientMonitoring implements PatientMonitoringInt {
    List<MedicalEmployee> meList = new ArrayList<>();
    int position = 0;
    int bloodPressure = 0;
    int pulseOximetry = 0;
    Problem problem;

    public PatientMonitoring(int position, int bloodPressure, int pulseOximetry) {
        this.position = position;
        this.bloodPressure = bloodPressure;
        this.pulseOximetry = pulseOximetry;
        this.problem = Problem.NO_PROBLEM;
    }

    @Override
    public void registerObserver(MedicalEmployee me) {
        meList.add(me);
    }

    @Override
    public void removeObserver(MedicalEmployee me) {
        meList.remove(me);
    }

    @Override
    public void notifyObserver() {
        for (MedicalEmployee me : meList){
            me.update();
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        if(bloodPressure > 135 || bloodPressure < 90)
            this.notifyObserver();
    }

    public int getPulseOximetry() {
        return pulseOximetry;
    }

    public void setPulseOximetry(int pulseOximetry) {
        this.pulseOximetry = pulseOximetry;
        if(pulseOximetry > 109 || pulseOximetry < 40)
            this.notifyObserver();
    }
}
