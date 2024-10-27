// src/HospitalDepartment.java
//ADIL
public abstract class HospitalDepartment {
    protected PatientManagement patientManagement;

    protected HospitalDepartment(PatientManagement patientManagement) {
        this.patientManagement = patientManagement;
    }

    public abstract void manage();
}
