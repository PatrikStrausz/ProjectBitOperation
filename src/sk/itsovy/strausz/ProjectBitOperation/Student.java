package sk.itsovy.strausz.ProjectBitOperation;

public class Student {
    private String name;
    private byte attWeek;

    public Student(String name, byte attWeek) {
        this.name = name;
        this.attWeek = attWeek;
    }

    public String getName() {
        return name;
    }

    public byte getAttWeek() {
        return attWeek;
    }


    public void setAttDay(Days day){
        switch (day){
            case MON:
                this.attWeek = (byte)(this.attWeek | 1);
                break;

            case TUE:
                this.attWeek = (byte)(this.attWeek | 2);
                break;

            case WED:
                this.attWeek = (byte)(this.attWeek | 4);
                break;

            case THU:
                this.attWeek = (byte)(this.attWeek | 8);
                break;

            case FRI:
                this.attWeek = (byte)(this.attWeek | 16);
                break;
        }

    }



}
