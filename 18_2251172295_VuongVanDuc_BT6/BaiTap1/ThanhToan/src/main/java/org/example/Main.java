package org.example;
interface IThanhToan {
    void thanhToan();
}

class ThanhToanTienMat implements IThanhToan {
    private String id;
    private String name;
    private double soTien;

    public ThanhToanTienMat(String id, String name, double soTien) {
        this.id = id;
        this.name = name;
        this.soTien = soTien;
    }

    @Override
    public void thanhToan() {
        System.out.println("Giao dịch " + id + ": " + name + " đã thanh toán " + soTien + " VND bằng tiền mặt.");
    }
}

class ThanhToanTheTinDung implements IThanhToan {
    private String id;
    private String name;
    private double soTien;


    public ThanhToanTheTinDung(String id, String name, double soTien) {
        this.id = id;
        this.name = name;
        this.soTien = soTien;
    }

    @Override
    public void thanhToan() {
        System.out.println("Giao dịch " + id + ": " + name + " đã thanh toán " + soTien + " VND bằng thẻ tín dụng.");
    }
}

public class Main {
    public static void main(String[] args) {


        IThanhToan thanhToanTienMat = new ThanhToanTienMat("GD001", "Nguyen Van Dat", 1000000);
        thanhToanTienMat.thanhToan();

        IThanhToan thanhToanTheTinDung = new ThanhToanTheTinDung("GD002", "Tran Thi Ngoc", 2500000);
        thanhToanTheTinDung.thanhToan();



    }
}