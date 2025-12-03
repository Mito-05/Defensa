package Person;
//creamos la clase y usamos extends para que herede de persona
public class gymLeader extends person{
    private String region;
    private String city;
    private boolean undefeated;
    //creamos los constructores
    public gymLeader(String name, int age, String pokemonFav, int pokemonNum, String region, String city, boolean undefeated) {
        super(name, age, pokemonFav, pokemonNum);
        this.region = region;
        this.city = city;
        this.undefeated = undefeated;
    }

    public gymLeader() {
    }
    //generamos los getter and setter

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isUndefeated() {
        return undefeated;
    }

    public void setUndefeated(boolean undefeated) {
        this.undefeated = undefeated;
    }
    //creamos su tostring

    @Override
    public String toString() {
        return "Leader: "+ this.getName() +" from city "+ this.city+ " ("+ this.getAge() +") years";
    }
}
