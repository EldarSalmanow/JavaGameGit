package com.prog;

public class Generators {
    public static Player[] regPlayers() {
        int colPlayers;
        System.out.println("Введите количество игроков (от 1 до 4): ");
        colPlayers = Utilities.scanner.nextInt();
        if (colPlayers >= 1 && colPlayers <= 4) {
            String[] lstNamePlayers = new String[colPlayers];
            Player[] players = new Player[colPlayers];
            for (int col = 0; col < colPlayers; col++) {
                String name;
                name = addName(col + 1);
                lstNamePlayers[col] = name;
                players[col] = new Player(lstNamePlayers[col]);
            }
            return players;
        }
        else {
            System.out.println("Вы ввели слишком большое (маленькое) число! Введите число ещё раз!");
            regPlayers();
        }
        return null;
    }

    private static String addName(int colPlayers) {
        String name;
        System.out.println("Введите имя для " + colPlayers + " игрока(не длиннее 20 символов): ");
        name = Utilities.scanner.next();
        if (name.length() > 20) {
            System.out.println("Вы ввели слишком длинное имя! Введите его ещё раз!");
            addName(colPlayers);
            return null;
        }
        else {
            return name;
        }
    }

    public static Enemy[] genEnemy() {
        int randomColEnemy = randomNum(3, 7);
        Enemy[] enemies = new Enemy[randomColEnemy];
        for (int params = 0; params < randomColEnemy; params++) {
            int xPos, yPos, level;
            xPos = randomNum(-15, 15);
            yPos = randomNum(-15, 15);
            level = randomNum(1, 3);
            enemies[params] = new Enemy(xPos, yPos, level);
        }
        return enemies;
    }

    private static int randomNum(int minNum, int maxNum) {
        int randomNum;
        maxNum -= minNum;
        randomNum =  (int) (Math.random() * ++maxNum) + minNum;
        return randomNum;
    }
}
