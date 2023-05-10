package entity;

public class Treatment {

    private long id;
    private String disease;
    private String medicine;

    public Treatment() {
    }

    public Treatment(long id, String disease, String medicine) {
        this.id = id;
        this.disease = disease;
        this.medicine = medicine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}
