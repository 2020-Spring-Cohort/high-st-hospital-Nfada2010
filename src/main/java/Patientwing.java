import java.util.HashMap;

public class Patientwing {
    public HashMap<String, Patient> patientHashMap = new HashMap<>();

    public void admitPatient(Patient newPatient) {
        this.patientHashMap.put(newPatient.getPatientName(), newPatient);
    }

    public void releasePatient(String newPatient) {
        this.patientHashMap.remove(newPatient);
    }

    public boolean allPatientsAlive() {
        return true;
    }


    public void tickAllPatients() {
        for (Patient patient : patientHashMap.values()) {
            patient.tick();
        }
    }
    public void drawBlood() {
        for (Patient patient : patientHashMap.values()) {
            patient.drawBlood();
        }
    }
    public void healHealth() {
        for (Patient patient : patientHashMap.values()) {
            patient.healHealth();
        }
    }


//    public String checkStatus() {
//        String status = "";
//        return status();
//    }
}
