package Person;
//utilizamos extends para que herede de la clase padre(person)
public class trainer extends person{
    //creamos los atributos
    private int medals;
    public enum Class{AROMALADY,BUGCATCHER,HIKER,FISHERMAN,BIRDKEEPER}
    protected Class classTrainer;
    //creamos los constructores con super para que hereden de la clase padre

    public trainer(String name, int age, String pokemonFav, int pokemonNum, int medals, Class classTrainer) {
        super(name, age, pokemonFav, pokemonNum);
        this.medals = medals;
        this.classTrainer = classTrainer;
    }

    public trainer() {
    }

    public trainer(String name, int age, String pokemonFav, int pokemonNum, Class classTrainer) {
        super(name, age, pokemonFav, pokemonNum);
        this.classTrainer = classTrainer;
        this.medals = 0;
    }
    //generamos getter and setter

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public Class getClassTrainer() {
        return classTrainer;
    }

    public void setClassTrainer(Class classTrainer) {
        this.classTrainer = classTrainer;
    }
    //creamos el metodo ganar medallas
    public void medalWin(){
        this.medals++;
    }
    //cremos el metodo availableligue, que nos devolvera true si su numero de medallas es mayor >= 8
    public boolean availableLigue(){
            return medals >= 8;
    }
    //creamos el tostring

    @Override
    public String toString() {
        return this.classTrainer +" "+ this.getName() +" ("+ this.getAge() +") years old";
    }
}
