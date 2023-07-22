package OOPSJLabPrograms;

public class PGStudent extends Student {
    private String specialization;
    private final String UGDegree;

    public PGStudent(String USN, String name, String specialization, String UGDegree) {
        super(USN, name);
        this.specialization = specialization;
        this.UGDegree = UGDegree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUGDegree() {
        return UGDegree;
    }

    // The setUGDegree() method will give error as the UGDegree attribute
    // is set to final and hence the value of it can be only initialized via a
    // constructor
    // which has already been done.

    // public void setUGDegree(String UGDegree) {
    // this.UGDegree = UGDegree;
    // }

}
