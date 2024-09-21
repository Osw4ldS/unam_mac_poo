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

    public String showInfo() {
        String showSubjects = "";
        String showPlanKeys = "";
        String showEntryReq = "";
        String showDegreeOptions = "";

        for(int i = 0; i < subjects.length; i++) {
            showSubjects += "\t " + (i+1) + ". " + subjects[i] + "\n";
        }

        for(int i = 0; i < planKeys.length; i++) {
            showPlanKeys += "\t " + (i+1) + ". " + planKeys[i] + "\n";
        }

        for(int i = 0; i < entryReq.length; i++) {
            showEntryReq += "\t " + (i+1) + ". " + entryReq[i] + "\n";
        }

        for(int i = 0; i < degreeOptions.length; i++) {
            showDegreeOptions += "\t " + (i+1) + ". " + degreeOptions[i] + "\n";
        }

        return "Título: " + title +
               "\nMaterias: " + showSubjects +
               "\nÁrea: " + area +
               "\nPlan de estudios: " + showPlanKeys +
               "\nEspecialidades: " + specialties +
               "\nRequsitos de ingreso: " + showEntryReq +
               "\nOpciones de titulación: " + showDegreeOptions +
               "\nDuración: " + duration + " años.";
    }
}