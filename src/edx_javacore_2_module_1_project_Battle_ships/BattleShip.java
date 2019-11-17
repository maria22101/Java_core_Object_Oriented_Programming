package edx_javacore_2_module_1_project_Battle_ships;

public class BattleShip {

    static void displayOceanMap() {
        char[][] oceanMap = new char[12][14];
        for (int i = 0; i < oceanMap.length; i++) {
            for (int j = 0; j < oceanMap[i].length; j++) {

                if (i == 0 || i == oceanMap.length - 1) {
                    if (j != 0 && j != 1 && j != oceanMap[i].length - 1 && j != oceanMap[i].length - 2) {
                            oceanMap[i][j] = (char) (j - 2 + '0');
                    }
                } else {
                    if (j == 0 || j == oceanMap[i].length - 1) {
                        oceanMap[i][j] = (char) (i - 1 + '0');
                    } else {
                        if (j == 1 || j == oceanMap[i].length - 2) {
                            oceanMap[i][j] = '|';
                        }
                    }
                }

            }
        }

        for (int i = 0; i < oceanMap.length; i++) {
            for (int j = 0; j < oceanMap[i].length; j++){
                System.out.print(oceanMap[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayOceanMap();

    }
}
