/**
 * Video67 - La clase Object
 * */
public class Animal extends Object{
    private String especie;
    private int numeroDePatas;

    public Animal(String especie, int numeroDePatas){
        this.especie = especie;
        this.numeroDePatas = numeroDePatas;
    }

    public String obtenerEspecie(){
        return especie;
    }
    public int obtenerNumeroDePatas(){
        return numeroDePatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", numeroDePatas=" + numeroDePatas +
                '}';
    }
}
