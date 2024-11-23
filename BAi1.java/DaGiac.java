package Bai1;

class DaGiac {  
    protected int soCanh;  
    protected int[] canh;  

    public DaGiac(int soCanh) {  
        this.soCanh = soCanh;  
        this.canh = new int[soCanh];  
    }  

    public void setCanh(int[] canh) {  
        this.canh = canh;  
    }  

    public double tinhChuVi() {  
        double chuVi = 0;  
        for (int i = 0; i < soCanh; i++) {  
            chuVi += canh[i];  
        }  
        return chuVi;  
    }  

    public void inCanh() {  
        System.out.print("Kích thước các cạnh: ");  
        for (int i = 0; i < soCanh; i++) {  
            System.out.print(canh[i] + " ");  
        }  
        System.out.println();  
    }  
}

class TamGiac extends DaGiac {  
    public TamGiac() {  
        super(3);  
    }  

    @Override  
    public double tinhChuVi() {  
        return super.tinhChuVi();  
    }  

    public boolean kiemTraHopLe() {  
        return (canh[0] + canh[1] > canh[2]) &&  
               (canh[0] + canh[2] > canh[1]) &&  
               (canh[1] + canh[2] > canh[0]);  
    }  

    public double tinhDienTich() {  
        double p = tinhChuVi() / 2;  
        return Math.sqrt(p * (p - canh[0]) * (p - canh[1]) * (p - canh[2]));  
    }  
}

