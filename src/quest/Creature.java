package quest;
/*любое существо в игре, чтобы его создать используйте
Creature enemy = new Creature(жизни, урон, защита);  */
public class Creature {
    //этот код выполняется при создании нового существа
    public Creature(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    String name;
    int hp;
    int atk;
    int def;
    //атаковать другое существо
    void attack(Creature other){
        System.out.println(name + " атакует " + name);
        other.receiveDamage(atk);
    }
    //получить урон от кого-то
    void receiveDamage(int dmg){
        //что бы нельзя было получить отрицательный урон
        int toReceive = Math.max(dmg - def, 0);
        hp -= toReceive;
    }
    //живо ли существо
    boolean isAlive(){
        return hp > 0;
    }
}
