public class Patient {
    public boolean isAlive = true;
    public int bloodLevel = 100;
    public int healthLevel = 100;
    public String condition = "Is ill with a fever";
    public String bloodType = "A+";
//    public String patientName = "JohnDoe";

    public Patient(String patientName) {
        super(patientName);
    }

    public void tick() {
        bloodLevel -= 4;
        healthLevel -= 2;
        condition = "getting worse";

    }

    public void drawBlood(){
        bloodLevel +=100;
    }
    public void healHealth(){healthLevel +=100;}





    public boolean isAlive() {
        return isAlive;
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
