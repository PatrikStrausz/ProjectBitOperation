package Devices;

public class Desktop extends Computer {
    private String type;


    public Desktop(String name, String cpu,int ram, String type) {
        super(name, cpu, ram);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
