package Pokemon;

public class pokemon {
    //creacion de atributos
    private String name;
    private int level;
    private int hp;
    private int atack;
    public enum type{NORMAL,FIRE,WATER,GHOST,GRASS,DARK}
    protected  type Type;
    //creacion de constructores
    public pokemon(String name, int level, int hp, int atack, type Type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.atack = atack;
        this.Type = Type;
    }

    public pokemon() {
    }
    //en este constructor si no se especifica el tipo se le dara por defecto el tipo normal al pokemon
    public pokemon(String name, int level, int hp, int atack) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.atack = atack;
        this.Type = pokemon.type.NORMAL;
    }
    //generamos getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public type getType() {
        return Type;
    }

    public void setType(type type) {
        Type = type;
    }
    //creamos el metodo debilitado tipo boolean
    public boolean fainted(){
            return this.hp <=0;
    }
    //creamos el metodo stroke que hara que un pokemon ataque a otro restando la cantidad de ataque de pokemon1 a pokemon2
    public void stroke(pokemon pokemonr){
        pokemonr.setHp(pokemonr.getHp()-this.atack);
    }

    @Override
    public String toString() {
        return this.name + " level: " + this.level;
    }
}
