public class TruyenCoTich extends Book {  
    public TruyenCoTich(int maSach, String tenSach, Tacgia tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {  
        super(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);  
    }  

    public static void main(String[] args) {  
        Tacgia tacGia = new Tacgia("Tao la Q");  
        TruyenCoTich truyen = new TruyenCoTich(2, "Vo Van", tacGia, 2023, "Lung ta lung tung", 120.0);  
        truyen.display();  
    }  
}
