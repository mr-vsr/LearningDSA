package OOPSJLabPrograms;

public class Student {
    private String USN;
    private String name;

    public Student(String USN, String name) {
        this.USN = USN;
        this.name = name;
    }

    public String getUSN() {
        return this.USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
