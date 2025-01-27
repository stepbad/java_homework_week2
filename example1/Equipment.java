package example1;

public class Equipment {
    private String equipmentName;
    private String department;
    private boolean isOperational;

    // Constructor
    public Equipment(String equipmentName, String department, boolean isOperational) {
        this.equipmentName = equipmentName;
        this.department = department;
        this.isOperational = isOperational;
    }

    // Getters and Setters
    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }

    // Methods
    public void serviceEquipment() {
        System.out.println(equipmentName + " is being serviced.");
        isOperational = true;
    }

    
    public String toString() {
        return "Equipment [Name=" + equipmentName + ", Department=" + department +
               ", IsOperational=" + isOperational + "]";
    }
}
