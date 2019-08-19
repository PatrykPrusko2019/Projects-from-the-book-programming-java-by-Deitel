package chapter_7.exercise;

/**
 *
 64 moves of the jumper on the chessboard
 */
public class Exercise_7_22_64MovesOfJumper {
    static int[][] board = new int[8][8];
    static int[][] accessibility = new int[8][8];//poziom trudnosci -> najmniejsza dostepnosc pol heudestyka
    static int currentRow = 0, currentColumn = 0; //ustawiamy
    static int jumpCounter = 1;
    //osiem ruchow skoczka
    static int[] horizontal = new int[8];//poziomo
    static int[] vertical = new int[8];//pionowo
    static int[] difficultyLevel = new int[8]; // poziom trudnosci numer
    static int[] movementsOfJumper = new int[8]; //dane ruchy skoczka dostepne

    public static void main(String[] args) {
        //board 8 x 8

        fillTheBoardAccessibility();
        fillTheBoardsWithZeros();
        fillTheTabWithZeros(difficultyLevel);
        fillTheTabWithZeros(movementsOfJumper);

        //      showArray();

        startJumper();

    }

    private static void fillTheTabWithZeros(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 0;
        }
    }

    //fill the array difficulty level
    private static void fillTheBoardAccessibility() {
        int zero_seven[] = {2, 3 ,4, 4, 4, 4, 3, 2}; // 2 , 3, 4 ,6, 8
        int six_one[] = {3, 4, 6, 6, 6, 6, 4, 3};
        int two_three_four_five[] = {4, 6, 8, 8, 8, 8, 6, 4};
        for(int i = 0; i < accessibility.length; i++) {
            switch (i) {
                case 0: case 7:
                    accessibility[i] = zero_seven;
                    break;

                case 2: case 3: case 4: case 5:
                    accessibility[i] = two_three_four_five;
                    break;
                case 1: case 6:
                    accessibility[i] = six_one;
                    break;
            }
        }



    }

    private static void startJumper() {
        board[0][0] = jumpCounter;
        //  showArray();
        //osiem ruchow skoczka
        createValueFOrEightJumperMovements();


        nextJumpInArray();


    }

    private static void createValueFOrEightJumperMovements() {
        for (int i = 0; i < vertical.length; i++) {//rows
            for (int j = i; j == i ; j++) { //columns
                {
                    switch (i) {
                        case 0: {
                            horizontal[j] = 2;
                            vertical[i] = -1;
                            break;
                        }
                        case 1: {
                            horizontal[j] = 1;
                            vertical[i] = -2;
                            break;
                        }
                        case 2: {
                            horizontal[j] = -1;
                            vertical[i] = -2;
                            break;
                        }
                        case 3: {
                            horizontal[j] = -2;
                            vertical[i] = -1;
                            break;
                        }
                        case 4: {
                            horizontal[j] = -2;
                            vertical[i] = 1;
                            break;
                        }
                        case 5: {
                            horizontal[j] = -1;
                            vertical[i] = 2;
                            break;
                        }
                        case 6: {
                            horizontal[j] = 1;
                            vertical[i] = 2;
                            break;
                        }
                        case 7: {
                            horizontal[j] = 2;
                            vertical[i] = 1;
                            break;
                        }
                    }
                }
            }

        }
    }

    private static void nextJumpInArray () {
        int i = 0;
        System.out.println("jump 1 !!!");
        showArray(); //jump first
        while(jumpCounter < 65) {
            checkJumperMovements();
            if(jumpCounter != 65) {
                System.out.println("next jump " + jumpCounter + "\n");
                showArray(); //pokazuje ruchy skoczka 1 - 64 mozliwych ruchow
            }
            i++;
        }
        System.out.println("\n\n**************\nthe last array :\nmovements found is -> " + i);
        showArray();


    }

    private static void checkJumperMovements() {
        boolean foundAnEmptyField = false, exit = false, searchEmptyField = false;
        int row = 0, column = 0;

        while(! exit) {
            for (int i = 0; i < 8; i++) { // 8 movements
                switch (i) {
                    case 0: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 1: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 2: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 3: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 4: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 5: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 6: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }
                    case 7: {
                        row = currentRow + vertical[i];
                        column = currentColumn + horizontal[i];
                        foundAnEmptyField = calculateResult(row, column);
                        break;
                    }

                }
                if(foundAnEmptyField) { //found movement
                    checkDifficultyLevel(i , row, column);
                    searchEmptyField = true;
                }


            }
            if(searchEmptyField) { //jesli sa jakies wolne pola dostepne to rusz sie skoczkiem !!!!
                //gdy zakonczy to znajdz najlepsze pole do ruszenia sie skoczkiem
                int minValue = foundMinValueInTabdifficultyLevel(difficultyLevel); //mamy min wartosc poziomu trudnosci
                for (int j = 0; j < difficultyLevel.length; j++) {
                    if (difficultyLevel[j] == minValue) {
                        int actuallMovements = movementsOfJumper[j];
                        //przypisujemy dany wybrany najlepszy ruch 0 - 7 !!!!!
                        row = currentRow + vertical[actuallMovements]; // dany najlepszy ruch skoczka wybrany ustawiamy
                        column = currentColumn + horizontal[actuallMovements];

                        fillTheTabWithZeros(movementsOfJumper); //zerujemy tablice dwie
                        fillTheTabWithZeros(difficultyLevel);

                        currentRow = row; //zmieniamy pozycje skoczka
                        currentColumn = column;
                        board[currentRow][currentColumn] = ++jumpCounter;
                        exit = true;


                    }
                }
            } else { // jesli nie to zakoncz program
                System.out.println("finish search new movements !!!");
                exit = true;
                jumpCounter = 65;
            }

        }//koniec petli while

    }

    private static int foundMinValueInTabdifficultyLevel(int[] difficultyLevel) {
        int min = difficultyLevel[0];
        for(int i = 0; i < difficultyLevel.length; i++) {
            if(min > difficultyLevel[i] && (! (0 == difficultyLevel[i])) ) {
                min = difficultyLevel[i];
            }
        }
        return min;
    }

    //sprawdzamy dany poziom trudnosci
    private static void checkDifficultyLevel(int numberMovements,int row, int column) {
        //todo tablica z poziomami, potem przypisac do nowej tablicy
        //static int[][] availableFieldsTab = new int[8][8]; //numer poziom trudnosci, numer ruchu 0-7
        for(int i = 0; i < difficultyLevel.length; i++) {
            if(difficultyLevel[i] == 0) {
                difficultyLevel[i] = accessibility[row][column]; //przypisuje poziom trudnosci
                movementsOfJumper[i] = numberMovements; //dany ruch skoczka wolny
                break;
            }
        }


    }

    private static boolean calculateResult(int row, int column) {
        if(row >= 0 && row < board.length) {
            if(column >= 0 && column < board.length) {
                if( checkValueBoard(row, column) ) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }



    private static boolean checkValueBoard(int row, int column) {
        if(board[row][column] == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void showArray () {
        System.out.println("\n**********************");
        for (int[] row : board) {
            for (int column : row) {
                System.out.printf("%4d", column);
            }
            System.out.println();
        }
        System.out.println("**********************\n");
    }

    private static void fillTheBoardsWithZeros () {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }
}