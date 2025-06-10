package level2.exercise1.mode;

public abstract class Phone {

    private String marca;
    private String modelo;

    public Phone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void call(String number);

    public String toString() {
        return "Phone: " +
                "\nMarca = " + marca +
                "\nModelo = " + modelo;
    }
}

