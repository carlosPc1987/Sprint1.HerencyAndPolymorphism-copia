package level2.exercise1.mode;


import level2.exercise1.interfaces.Camera;
import level2.exercise1.interfaces.Reloj;

public class Smartphone extends Phone implements Camera, Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void call(String numero) {
        System.out.println("Calling number: " + numero + "...\n");
    }

    public void takePic() {
        System.out.println("Camera is taking a photo\n");
    }

    public void alarm() {
        System.out.println("Its playing alarm\n");
    }

    public String toString() {
        return "Smartphone: " +
                "\nMarca = " + super.getMarca() +
                "\nModelo = " + super.getModelo();
    }
}

