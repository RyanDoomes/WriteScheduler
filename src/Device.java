public interface Device {

    void name(String name);

    public int getPendingWrites();

    public int getTotalWrites();

    public int getTotalBytesWritten();

    public void write(String name, byte[] data);



}
