package quest;

public class GardenState {
    static int applesLeft = 5;

    static int inGarden() {
        System.out.println("Вы находитесь в саду, apple чтобы сорвать яблоко, exit чтобы вернутся домой");
        switch (Game.scanner.next()) {
            case "apple":
                if (applesLeft > 0) {
                    Game.player.inventory.add("apple");
                    applesLeft--;
                    return Game.fightState;//на вас напал садовник
                } else {
                    System.out.println("Яблок больше не осталось");
                }
                break;
            case  "exit":
                return Game.homeState;
        }
        return inGarden();
    }
}
