package main.javacore.Ycolecoes.dominio;


public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
//      Refelixivel: x.equals(x) tem que ser true para tudo que for diferente de null
//      Simétrico: para x e y diferente de null, se x.equals(y) == true logo y equals(x) == true
//      Transitividade: para x,y,z diferente de null, se  x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
//      Consistente: x.equals(x) sempre retorna true se x for diferente de null
//      Para x diferente de x de null, x.equals(null) tem que retorna false

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // Se o obj for == nulo, retorne false
        if (this == obj) return true; // Se os dois objetos forem iguais, retorne true
        if (this.getClass() != obj.getClass())
            return false; // Se this.getclass for diferente de obj.getclass, retorne false
        Smartphone smartphone = (Smartphone) obj; // Obj é igual ao objeto Smartphone
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber) // Se SerialNumber for diferente ou igual
                // é SerialNumber diferente de smartphone.serialNumber retorne false
                && marca != null && marca.equals(smartphone.marca); // Se marca for diferente ou igual
        // é marca diferente de equals(martphone.marca) retorne false
    }

    // Se x.equal(y) == true, y.hascode(x) == x.hascode()
// y.hashcode() == x.hashcode() não necessariamente o equals do y.equals(x) tem que ser true
// x.equals(y) == false
// y.hashcode() != x.hashcode() x.equals(y) deverá ser false.

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}