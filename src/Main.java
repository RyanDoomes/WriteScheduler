import java.util.Scanner;

public class Main implements Device, WriteScheduler {
    public static void main(String[] args) {
        System.out.println("***** Welcome to Gray's Write Scheduler System! ***** ");
        System.out.println("Would you like to add a new device? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            System.out.println("What is the name of the device?");
            String deviceName = scanner.nextLine();
            Device addedDevice = new AddedDevice(deviceName);
            System.out.println("New device added: " + ((AddedDevice) addedDevice).deviceName);




            } else {
            System.out.println("Thank you for using Gray's Write Scheduler System!");
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