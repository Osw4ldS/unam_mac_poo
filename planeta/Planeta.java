package planeta;

public class Planeta {
    private double size;
    private double[] position;
    private String orbit;
    private String color;
    private int nRings;
    private String chemicalComp;
    private boolean athmosphere;
    private Double magneticField;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getPosition() {
        return position;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setnRings(int nRings) {
        this.nRings = nRings;
    }

    public int getnRings() {
        return nRings;
    }

    public void setChemicalComp(String chemicalComp) {
        this.chemicalComp = chemicalComp;
    }

    public String getChemicalComp() {
        return chemicalComp;
    }

    public void setAthmosphere(int athmosphere) {
        this.athmosphere = athmosphere == 1;
    }

    public String getAthmosphere() {
        if(athmosphere) return "Sí.";
        else return "No.";
    }

    public void setMagneticField(Double magneticField) {
        this.magneticField = magneticField;
    }

    public Double getMagneticField() {
        return magneticField;
    }
}
