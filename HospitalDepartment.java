// src/HospitalDepartment.java
public abstract class HospitalDepartment {
    protected PatientManagement patientManagement;

    protected HospitalDepartment(PatientManagement patientManagement) {
        this.patientManagement = patientManagement;
    }

    public abstract void manage();
}
