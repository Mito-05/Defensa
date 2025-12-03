package Person;

public class person {
    //creamos los atributos
    private String name;
    private int age;
    private String pokemonFav;
    private int pokemonNum;
    //creamos los constructores completo y vacio

    public person(String name, int age, String pokemonFav, int pokemonNum) {
        this.name = name;
        this.age = age;
        this.pokemonFav = pokemonFav;
        this.pokemonNum = pokemonNum;
    }

    public person() {
    }
    //generamos getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPokemonFav() {
        return pokemonFav;
    }

    public void setPokemonFav(String pokemonFav) {
        this.pokemonFav = pokemonFav;
    }

    public int getPokemonNum() {
        return pokemonNum;
    }

    public void setPokemonNum(int pokemonNum) {
        this.pokemonNum = pokemonNum;
    }
    //creamos el metodo greet que hara que la persona salude
    public void greet(){
        System.out.println("Hello im, "+this.name + " and my favourite Pokémon its: " + this.pokemonFav);
    }

    @Override
    public String toString() {
        return this.name+", "+this.age+" years";
    }
}
