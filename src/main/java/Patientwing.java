import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class Patientwing {
    public HashMap<String, Patient> patientHashMap = new HashMap<>();

    public void admitPatient(Patient newPatient) {
        this.patientHashMap.put(newPatient.getName(), newPatient);
    }

    public void releasePatient(String newPatient) {
        this.patientHashMap.remove(newPatient);
    }



}
