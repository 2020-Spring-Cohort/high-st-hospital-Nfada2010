public class Patient {
    public boolean isAlive = true;
    public int bloodLevel = 100;
    public int healthLevel = 100;
    public String condition = "Is ill with a fever";
    public String bloodType = "A+";
    public String patientName;

    public Patient(String patientName) {
        this.patientName = patientName;
//        super();
    }

    public void tick() {
        bloodLevel -= 10;
        healthLevel -= 10;
        condition = "getting worse";

    }

    public void drawBlood(){
        bloodLevel +=100;
    }
    public void healHealth(){healthLevel +=100;}





    public boolean isAlive() {
        return true;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getCondition() {
        return condition;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getPatientName() {
        return patientName;
    }
}
