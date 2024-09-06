package semana4;

public class Facultad {
    private String careers;
    private String location;
    private String affiliation;
    private int nStudents;
    private int nBuildings;
    private int openingYear;
    private float landArea;

    public void setCareer(String careers){
        this.careers = careers;
    }

    public String getCareer(){
        return careers;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setAffiliation(String affiliation){
        this.affiliation = affiliation;
    }

    public String getAffiliation(){
        return affiliation;
    }

    public void setnStudents(int nStudents){
        this.nStudents = nStudents;
    }

    public int getnStudents(){
        return nStudents;
    }

    public void setnBuildings(int nBuildings){
        this.nBuildings = nBuildings;
    }

    public int getnBuildings(){
        return nBuildings;
    }

    public void setOpeningYear(int openingYear){
        this.openingYear = openingYear;
    }

    public int getOpeningYear(){
        return openingYear;
    }

    public void setLandArea(float landArea){
        this.landArea = landArea;
    }

    public float getLandArea(){
        return landArea;
    }
}
