package semana4;

public class Edificio {
    private String materials;
    private int nFloors;
    private String[] colors;
    private String location;
    private String design;
    private String style;
    private String usage;
    private int antiquity;
    private String currentStatus;

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
    }

    public void setnFloors(int nFloors) {
        this.nFloors = nFloors;
    }

    public int getnFloors() {
        return nFloors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String[] getColors() {
        return colors;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getDesign() {
        return design;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }
}
