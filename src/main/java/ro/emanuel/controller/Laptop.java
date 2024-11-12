package ro.emanuel.controller;

public class Laptop {
    private String brand;
    private int pret;
    private int ram;

    // Constructorul
    public Laptop(String brand, int pret, int ram) {
        this.brand = brand;
        this.pret = pret;
        this.ram = ram;
    }

    // Getters pentru fiecare atribut
    public String getBrand() {
        return brand;
    }

    public int getPret() {
        return pret;
    }

    public int getRam() {
        return ram;
    }
}

