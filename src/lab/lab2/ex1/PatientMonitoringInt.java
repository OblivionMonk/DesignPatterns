package lab.lab2.ex1;

public interface PatientMonitoringInt {
    void registerObserver(MedicalEmployee me);
    void removeObserver(MedicalEmployee me);
    void notifyObserver();
}
