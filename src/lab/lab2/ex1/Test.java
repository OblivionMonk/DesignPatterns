package lab.lab2.ex1;

public class Test {
    public static void main(String[] args) {
        PatientMonitoring pm = new PatientMonitoring(1, 140,85);
        MedicalEmployee jean = new MedicalEmployee("Jean ", pm);
        MedicalEmployee pauline = new MedicalEmployee("Pauline ", pm);
        MedicalEmployee matthieu = new MedicalEmployee("Matthieu", pm);
        MedicalEmployee symeon = new MedicalEmployee("Symeon ", pm);
        pm.setBloodPressure(110);
        pm.setPosition(3);
        pm.setPulseOximetry(90);
        pm.setPulseOximetry(70);
        pm.setPosition(7);
        pm.setBloodPressure(150);
        pm.removeObserver(matthieu);
        pm.setBloodPressure(145);
        pm.setPosition(9);
    }
}
