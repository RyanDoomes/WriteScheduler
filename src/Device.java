public interface Device {
    
    public int pendingWrites = 0;

    void name(String name);

    public int getPendingWrites();

    public int getTotalWrites();

    public int getTotalBytesWritten();

    public void write(String name, byte[] data);



}
