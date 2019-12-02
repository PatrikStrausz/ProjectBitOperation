package sk.itsovy.strausz.ProjectBitOperation;

public class Main {

    public final static byte MONDAY = 1;
    public final static byte WEDNESDAY = 4;
    public final static byte FRIDAY = 16;
    public final static byte wholeWEEK = 31;


    public static void main(String[] args) {

        Student[] list = new Student[5];

        list[0] = new Student("Viliam", (byte) 23,"KE","04001");
        list[1] = new Student("Daniela", (byte) 10, "PO", "08004");
        list[2] = new Student("Marian", (byte) 21, "MI", "07101");
        list[3] = new Student("Anastazia", (byte) 7, "PP", "05801");
        list[4] = new Student("Roman", (byte) 31, null, "");

        //vypis studentov ktori boli v pondelok v skole
        System.out.println("List of students , Monday:");
        for (Student student : list) {
            if ((student.getAttWeek() & MONDAY) == 1) { // mozne vysledky 0 alebo 1
                System.out.println("    " + student.getName());

            }
        }
        System.out.println("List of students , Wednesday:");
            for (Student student : list) {
            if ((student.getAttWeek() & WEDNESDAY) == 4) {  // mozne vysledky 0 alebo 4
                System.out.println("    " + student.getName());

            }
        }

        System.out.println("List of students , Friday:");
        for (Student student : list) {
            if ((student.getAttWeek() & FRIDAY) == 16) {  // mozne vysledky 0 alebo 16
                System.out.println("    " + student.getName());

            }
        }

        System.out.println("List of students , Whole week:");
        for (Student student : list) {
            if ((student.getAttWeek() & wholeWEEK) == 31) {  // mozne vysledky 0 alebo 31
                System.out.println("    " + student.getName());

            }
        }

        //nastavim Anastazii dochadzka na piatok
        list[3].setAttDay(Days.FRI);


        // vypis mena a poctu dni v skole
        System.out.println("List of students + att days");
        for(Student student: list){
           byte copyAtt = student.getAttWeek();
           int count = 0;
            for (int i = 0; i <5 ; i++) {
                if((copyAtt & 1 ) ==1){
                    count++;
                    copyAtt =(byte) (copyAtt >>1);
                }

            }
            System.out.println("   " +student.getName() + "  " + count);
        }


    }
}
