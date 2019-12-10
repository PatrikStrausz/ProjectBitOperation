package Devices;

abstract class Device {

    private String name;
    private static int count;

    public Device(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}
