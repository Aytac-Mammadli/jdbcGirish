package entity;

public class Muellim {
    private int Id;
    private String fullName;
    private String tevellud;
    private String ise_giris;
    private Double maas;
    private String phone;

    public Muellim(int id, String fullName, String tevellud, String ise_giris, Double maas, String phone) {
        Id = id;
        this.fullName = fullName;
        this.tevellud = tevellud;
        this.ise_giris = ise_giris;
        this.maas = maas;
        this.phone = phone;
    }

    public int getId() {
        return Id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTevellud() {
        return tevellud;
    }

    public String getIse_giris() {
        return ise_giris;
    }

    public Double isMaas() {
        return maas;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Muellim{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                ", tevellud='" + tevellud + '\'' +
                ", ise_giris='" + ise_giris + '\'' +
                ", maas=" + maas +
                ", phone='" + phone + '\'' +
                '}';
    }
}
