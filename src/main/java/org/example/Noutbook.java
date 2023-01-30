package org.example;

public class Noutbook {
    private int ozu;
    private int hdd;
    private String processor;
    private String manufacture;
    private String os;
    private String colorBook;

    public Noutbook(int ozu, int hdd, String processor, String manufacture, String os, String colorBook) {
        this.ozu = ozu;
        this.hdd = hdd;
        this.processor = processor;
        this.manufacture = manufacture;
        this.os = os;
        this.colorBook = colorBook;
    }

    public int getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColorBook() {
        return colorBook;
    }

    public void setColorBook(String colorBook) {
        this.colorBook = colorBook;
    }

    @Override
    public String toString() {
        return "Noutbook{" +
                "ozu=" + ozu +
                ", hdd=" + hdd +
                ", processor='" + processor + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", os='" + os + '\'' +
                ", colorBook='" + colorBook + '\'' +
                '}';
    }
}