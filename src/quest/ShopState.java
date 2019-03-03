package quest;

public class ShopState {
    static int inShop() {
        System.out.println("Вы в магазине, у вас " + Game.player.money + "  денег");
        System.out.println("sword  ----- 100 gold");
        System.out.println("shield ----- 75 gold");
        System.out.println("apple  ----- 10 gold");
        System.out.println("exit чтобы уйти  домой");
        switch (Game.scanner.next()) {
            case "sword":
                if (Game.player.money >= 100) {
                    Game.player.money -= 100;
                    Game.player.inventory.add("sword");
                } else {
                    System.out.println("нехватает денег");
                }
                break;
            case "shield":
                if (Game.player.money >= 75) {
                    Game.player.money -= 75;
                    Game.player.inventory.add("shield");
                } else {
                    System.out.println("нехватает денег");
                }
                break;
            case "apple":
                if (Game.player.money >= 10) {
                    Game.player.money -= 10;
                    Game.player.inventory.add("apple");
                } else {
                    System.out.println("нехватает денег");
                }
                break;
            case "exit":
                return Game.homeState;
        }
        return inShop();//вызовется если пользователь ошибся при вводе
    }
}
