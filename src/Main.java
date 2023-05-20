import java.util.Scanner;


public class Main implements Device, WriteScheduler {
    public static void main(String[] args) {
        System.out.println("***** Welcome to Gray's Write Scheduler System! ***** ");

        addNewDevice();

        System.out.println("Thank you for using Gray's Write Scheduler System!");
    }









        public static void addNewDevice() {
            Scanner scanner = new Scanner(System.in);
            String answer = "";
            while(!answer.equalsIgnoreCase("N")) {

                System.out.println("Would you like to add a new device? (Y/N)?");

                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("Y")) {
                    System.out.println("What is the name of the device?");
                    String deviceName = scanner.nextLine();
                    Device addedDevice = new AddedDevice(deviceName);
                    System.out.println("New device added: " + ((AddedDevice) addedDevice).deviceName);
                    System.out.println("How many writes would you like to schedule for this device?");
                    int i = scanner.nextInt();
                    ((AddedDevice) addedDevice).pendingWrites = i;
                    System.out.println("You have scheduled "+((AddedDevice)addedDevice).pendingWrites+" writes for " +((AddedDevice) addedDevice).deviceName);
                }

                }


            }



    @Override
    public void name(String name) {

    }

    @Override
    public int getPendingWrites() {
        return 0;
    }

    @Override
    public int getTotalWrites() {
        return 0;
    }

    @Override
    public int getTotalBytesWritten() {
        return 0;
    }

    @Override
    public void write(String name, byte[] data) {

    }

    @Override
    public Device Write(String name, byte[] data) {
        return null;
    }
}


