package Pokemon;

public class potion {
    //creamos los atributos
    private int restoredPoints;
    private double price;
    //creamos los constructores vacio y completo

    public potion(int restoredPoints, double price) {
        this.restoredPoints = restoredPoints;
        this.price = price;
    }

    public potion() {
    }
    //creamos los getter and setter

    public int getRestoredPoints() {
        return restoredPoints;
    }

    public void setRestoredPoints(int restoredPoints) {
        this.restoredPoints = restoredPoints;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //creamos el metodo health que hara que se lu sumen al pokemon la cantidad de hp que de la pocion
    public void health(pokemon pokemon){
        pokemon.setHp(pokemon.getHp()+this.restoredPoints);
    }
    //creamos el metodo getPriceWithTaxes que nos dara el precio con un impuesto aplicado
    public double getPriceWithTax(int tax){
        return (this.price * tax/100)+this.price;
    }

    @Override
    public String toString() {
        return "Potion: " + this.price + " pokedolares";
    }
}
