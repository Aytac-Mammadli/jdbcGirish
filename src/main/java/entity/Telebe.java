package entity;

public class Telebe {
    private int id;
    private String fullName;
    private boolean telebe_odenis;
    private String phone;

    public Telebe(int id, String fullName, boolean telebe_odenis, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.telebe_odenis = telebe_odenis;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isTelebe_odenis() {
        return telebe_odenis;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", telebe_odenis=" + telebe_odenis +
                ", phone='" + phone + '\'' +
                '}';
    }
}
