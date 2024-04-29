public class Notebook {
    private int id;
    private String brand;
    private String model;
    private int ram;
    private int hardDriveCapacity;
    private String os;
    private double screenSize;
    private String color;

    public Notebook(int id, String brand, String model, int ram, int hardDriveCapacity, String os, double screenSize,
            String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hardDriveCapacity = hardDriveCapacity;
        this.os = os;
        this.screenSize = screenSize;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public String getOs() {
        return os;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return String.format(
                "ID: %d, Бренд: %s, Модель: %s, RAM: %d, Память: %d, Операционная система: %s, Диагональ экрана: %.1f, Цвет: %s",
                id, brand, model, ram, hardDriveCapacity, os, screenSize, color);
    }

    public boolean findId(int id) {
        if (this.id == id) {
            return true;
        } else
            return false;
    }

    public boolean findBrand(String brand) {
        if (this.brand.equals(brand)) {
            return true;
        } else
            return false;
    }

    public boolean findModel(String model) {
        if (this.model.equals(model)) {
            return true;
        } else
            return false;
    }

    public boolean findRam(int ram) {
        if (this.ram == ram) {
            return true;
        } else
            return false;
    }

    public boolean findHardDriveCapacity(int hardDriveCapacity) {
        if (this.hardDriveCapacity == hardDriveCapacity) {
            return true;
        } else
            return false;
    }

    public boolean findOs(String os) {
        if (this.os.equals(os)) {
            return true;
        } else
            return false;
    }

    public boolean findScreenSize(double inInt) {
        if (this.screenSize == inInt) {
            return true;
        } else
            return false;
    }

    public boolean findColor(String color) {
        if (this.color.equals(color)) {
            return true;
        } else
            return false;
    }

}
