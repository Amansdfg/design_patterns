package CreationalDesignPatterns.Asa;

import java.util.List;

public class User {
    private List<Device> devices;
    public Laptop addDevice(Laptop laptop) {
        devices.add(laptop);
        return laptop;
    }
}
