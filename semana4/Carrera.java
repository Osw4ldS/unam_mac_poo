package semana4;

public class Carrera {
    private String title;
    private String [] subjects;
    private int area;
    private int[] planKeys;
    private String specialties;
    private String[] entryReq;
    private String[] degreeOptions;
    private int duration;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSubjects(String [] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setPlanKeys(int[] planKeys) {
        this.planKeys = planKeys;
    }

    public int[] getPlanKeys() {
        return planKeys;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setEntryReq(String[] entryReq) {
        this.entryReq = entryReq;
    }

    public String[] getEntryReq() {
        return entryReq;
    }

    public void setDegreeOptions(String[] degreeOptions) {
        this.degreeOptions = degreeOptions;
    }

    public String[] getDegreeOptions() {
        return degreeOptions;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}