public class AddedDevice implements Device {

    public String deviceName;
    public int pendingWrites = 0;

    public AddedDevice(String deviceName){
        this.deviceName = deviceName;
    }

    @Override
    public void name(String name) {
        this.deviceName = name;
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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
