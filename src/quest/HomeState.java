package quest;

public class HomeState {
    static int inHome() {
        System.out.println("Вы находитесь дома");
        System.out.println("Напищите shop чтобы пойти в магазин, напишите garden, чтобы выйти в сад");
        switch (Game.scanner.next()){
            case "shop":return Game.shopState;
            case "garden":return Game.gardenState;
            default:return inHome();
        }
    }
}
