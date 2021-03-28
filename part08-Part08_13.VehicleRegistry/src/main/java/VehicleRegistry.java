
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licensMap;

    public VehicleRegistry() {
        this.licensMap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.licensMap.containsKey(licensePlate)) {
            return false;
        } else {
            this.licensMap.put(licensePlate, owner);
        }

        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.licensMap.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.licensMap.containsKey(licensePlate)) {
            this.licensMap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : this.licensMap.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        for (String owner : this.licensMap.values()) {
            System.out.println(owner);
        }
    }
}
