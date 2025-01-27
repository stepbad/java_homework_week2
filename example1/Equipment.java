package example1;

public class Equipment {
    private String equipmentName;
    private String department;
    private boolean isOperational;

    public Equipment(String equipmentName, String department, boolean isOperational) {
        this.equipmentName = equipmentName;
        this.department = department;
        this.isOperational = isOperational;
    }

    public void serviceEquipment() {
        System.out.println(equipmentName + " is being serviced.");
        isOperational = true;
    }

    public String toString() {
        return "Equipment [Name=" + equipmentName + ", Department=" + department + ", IsOperational=" + isOperational + "]";
    }
}
