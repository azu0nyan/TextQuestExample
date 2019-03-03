package quest;

import java.util.Scanner;

//Главный класс игры с функцией main
public class Game {
    //общий сканнер для всей программы
    static Scanner scanner = new Scanner(System.in);
    //номера создаяний задвать только здесь
    static final int homeState = 1;
    static final int shopState = 2;
    static final int gardenState = 3;
    static final int fightState = 4;
    static final int deadSate = 666;
    //Глобальная переменная с информацией об игроке
    static Player player = new Player();
    public static void main(String[] args) {
	    int state = 1;
	    while (state != deadSate){
	        player.playerStatus();
	        switch (state){
                case homeState:state = HomeState.inHome();break;
                case shopState:state = ShopState.inShop();break;
                case gardenState:state = GardenState.inGarden();break;
                case fightState:state = FightState.inFight();break;
            }
        }
        System.out.println("Игра окончена, вы погибли");


    }
}
