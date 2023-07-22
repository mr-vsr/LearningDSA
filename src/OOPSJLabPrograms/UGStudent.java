
package OOPSJLabPrograms;

public class UGStudent extends Student {
    private int semester;
    private String branch;

    public UGStudent(String USN, String name, int semester, String branch) {
        super(USN, name);
        this.semester = semester;
        this.branch = branch;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
