package day11;

public class Car {
    private String Brand;
    private String Model;
    Car(){}
     Car(String Brand, String Model) {
        this.Brand = Brand;
        this.Model = Model;
    }
    void SetBrand(String Brand){
        this.Brand = Brand;
    }
    String GetBrand(){
        return this.Brand;
    }

    void SetModel(String Model){
        this.Brand = Model;
    }
    String GetModel(){
        return this.Model;
    }
    Tyre [] tyres = {new Tyre("mrf"),
                        new Tyre("apolo"),
                        new Tyre("Ceat"),
                        new Tyre("jk")};
}

