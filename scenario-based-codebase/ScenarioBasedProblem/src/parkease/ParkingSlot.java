package com.parkease;

public class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot() {
        if (!isOccupied) {
            isOccupied = true;
        }
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    public String getSlotDetails() {
        return "Slot ID: " + slotId + ", Location: " + location +
               ", Vehicle Allowed: " + vehicleTypeAllowed +
               ", Available: " + !isOccupied;
    }
}

