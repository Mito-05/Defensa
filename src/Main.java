import Person.gymLeader;
import Person.trainer;
import Pokemon.pokemon;
import Pokemon.potion;

//Importamos los paquetes necesarios para el codigo
public class Main {
    public static void main(String[] args) {
        pokemon pokemon1 = new pokemon("Absol", 38, 80,37, Pokemon.pokemon.type.DARK);
        pokemon pokemon2 = new pokemon("Lucario", 45, 125,42, Pokemon.pokemon.type.NORMAL);
        pokemon pokemon3 = new pokemon("Greninja", 58, 115,54, Pokemon.pokemon.type.WATER);
        pokemon pokemon4 = new pokemon("Infernape", 60, 130,69, pokemon.type.FIRE);

        System.out.println("\n"+pokemon1.getName()+ " ataca a "+ pokemon2.getName());
        pokemon1.stroke(pokemon2);
        System.out.println(pokemon2.getName()+ " a quedado a "+ pokemon2.getHp()+ " HP");
        System.out.println(pokemon4.getName()+ " ataca a "+ pokemon3.getName());
        pokemon4.stroke(pokemon3);
        System.out.println(pokemon3.getName()+ " a quedado a "+ pokemon3.getHp()+ " HP");

        potion potion1= new potion(20, 30.5);
        System.out.println("\n"+"Utilizan una posion sobre "+ pokemon3.getName());
        potion1.health(pokemon3);
        System.out.println("Ahora "+pokemon3.getName()+ " a "+pokemon3.getHp()+" HP");

        trainer trainer1= new trainer("Capi",24,"Charizar",6, trainer.Class.HIKER);
        trainer trainer2= new trainer("Mito",20,"Lucario",6, trainer.Class.BIRDKEEPER);
        System.out.println(trainer1.toString()+ "\n" + trainer2.toString());

        gymLeader leader1 = new gymLeader("Brandom", 22, "Rayquaza",6, "Alola", "Malei", true);
        System.out.println("\n"+leader1.toString());
    }

    }