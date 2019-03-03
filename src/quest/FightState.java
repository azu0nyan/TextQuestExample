package quest;

public class FightState {
    static int inFight(){
        System.out.println("На вас напал садовник");
        Creature gardener = new Creature("Gardener", 40, 3, 1);
        while (gardener.isAlive() && Game.player.isAlive()){
            Game.player.attack(gardener);
            gardener.attack(Game.player);
        }
        if(Game.player.isAlive()){
            System.out.println("Вы победили");
            return Game.gardenState;
        } else {
            System.out.println("Вы понесли заслуженное наказание за воровстово");
            return Game.deadSate;
        }
    }
}
