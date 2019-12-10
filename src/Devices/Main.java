package Devices;

public class Main {
    public static void main(String[] args) {
        // vytvori notebook typu Movable
        Movable m1 = new Notebook("Lenovo", "Intel i5", 2, 16.2);

        //pretypuje m1 z typu Movable na typ Notebook
        System.out.println("CPU: " + ((Notebook) m1).getCpu());

        // \"P30\" vypise p30 v uvodzovkach
        Mobile mobile = new Mobile("Huawei \"P30\" Pro", 5.8);

        //pretypuje mobile na typ Device
        System.out.println(((Device) mobile).getName());
        System.out.println("Number of devices: " + Device.getCount());

        // vytvori d1 a priradi mu a pretypuje m1 na device
        Device d1;
        d1 = (Device) m1;

        Computer c1 = new Desktop("Dell 466 AMD 3,5GHz", "AMD", 16, "BigTower");
        System.out.println("RAM: "+((Param) c1).getRam());

        Object o1 = new Notebook("Acer 885", "AMD", 2, 14);

        // da do pola vytvorene objekty
        Device[] arr = new Device[5];
        arr[0] = (Device) o1;
        arr[1] = mobile;
        arr[2] = (Device) m1;
        arr[3] = c1;
        arr[4] = new Mobile("Samsung A80", 4.5);

        System.out.println("List of mobiles: ");
        for (Device dev:arr) {
            if(dev instanceof Mobile){ // zisti ci sa typ instancie rovna Mobile
                System.out.println("       "+dev.getName());
            }

        }

        Computer c2 = new Computer("IBM 1001", "Intel i9", 32);
//        System.out.println(((Notebook)c2).getDiagonal()); // neda sa pretypovat objekt rovnakeho typu smerom dole

        System.out.println("List of computers: ");
        for(Device dev:arr){
            if(dev instanceof Computer){
                System.out.println("       "+dev.getName());
            }
        }

    }
}
