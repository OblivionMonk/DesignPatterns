package lab.lab2.ex1;

public class MedicalEmployee implements MedicalEmployeeInt{
    String name;
    PatientMonitoring pm;

    public MedicalEmployee(String name, PatientMonitoring pm) {
        this.name = name;
        this.pm = pm;
        pm.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + " was notified, position: " + pm.position + " blood pressure: " + pm.bloodPressure + ", pulse oximetry: " + pm.pulseOximetry);
    }
}
