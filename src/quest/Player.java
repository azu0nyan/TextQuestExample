package quest;

import java.util.ArrayList;

//Игрок является существом, но у него
//есть дополнительные параметры, т.к.
//деньги инвентарь и т.д.
public class Player extends Creature{
    int money = 100;
    int hunger = 0;
    ArrayList<String> inventory = new ArrayList<>();//инвентарь
    public Player() {
        //жизни урон и защита существа
        super("Player", 100, 2, 1);
    }
    //вызывется между каждым состоянием
    public void playerStatus(){
        if (Game.player.hunger > 50) System.out.println("Вы  голодны");
        System.out.println("Ваши жизни: " +  hp);
        System.out.println("Чтобы использовать предмет напишите \"use\", что угодно другое чтобы продолжить");
        if(Game.scanner.next().equals("use")){
            useItem();
        }
    }
    public void useItem(){
        System.out.println("Ваш инвентарь: " + inventory.toString());
        //Ради простоты пока храним предметы как их названия, но можно сделать
        //и класс Item с методом void use(Creature target)
        String itemName = Game.scanner.next();//считывает одно слово до пробела
        //Проверяем наличе предмета в инвентаре
        if(inventory.contains(itemName)){
            switch (itemName){
                case "apple": hp += 10; hunger -= 10; inventory.remove("apple");break;//лечение и сытость
                case "sword": atk += 1; inventory.remove("sword");break;//плюс атака
                case "shield": def += 1;inventory.remove("shield");break;//плюс защита
            }
        }
    }

}
