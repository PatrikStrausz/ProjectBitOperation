package sk.itsovy.strausz.ProjectBitOperation;

public class Student {
    private String name;
    private byte attWeek;
    private Adress address;
    private static int count = 0;
    private int hobby;

  public  class Adress{
        private String city;
        private String zip;

        public Adress(String city, String zip) {
            this.city = city;
            this.zip = zip;
        }

        public String getCity() {
            return city;
        }

        public String getZip() {
            return zip;
        }
    }


    public Student(String name, byte attWeek, String city, String zip) {
        this.name = name;
        this.attWeek = attWeek;
        this.address = new Adress(city, zip);
        count++;
        System.out.println("A new student has been created: id: " +count + " name: " +name);
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

public void setHobby(Hobbies hobby){
      switch (hobby){
          case  DANCE:
              this.hobby |= 1;
              break;

          case FOTBALL:
              this.hobby |= 2;
              break;

          case HOCKEY:
              this.hobby |= 4;
              break;

          case GOLF:
              this.hobby |= 8;
              break;
      }

 }



}
