package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int boardHeight = 5;
    private static int boardWidth = 5;
    private static String[][] gameBoard = new String[boardWidth][boardHeight];

    public static void main(String[] args) {
        // write your code here
        System.out.println("BATTLESHIP LIMITED! This is a simple version of the game for one person." +
                "Would you like to play? Yes or No");
         Scanner sc = new Scanner(System.in);
        // String playGame = sc.nextLine();
        //   while (playGame.equalsIgnoreCase("Yes")){
        //code block for board grid


        gameBoard[0][0] = "A1";
        gameBoard[1][0] = "A2";
        gameBoard[2][0] = "A3";
        gameBoard[3][0] = "A4";
        gameBoard[4][0] = "A5";
        gameBoard[0][1] = "B1";
        gameBoard[1][1] = "B2";
        gameBoard[2][1] = "B3";
        gameBoard[3][1] = "B4";
        gameBoard[4][1] = "B5";
        gameBoard[0][2] = "C1";
        gameBoard[1][2] = "C2";
        gameBoard[2][2] = "C3";
        gameBoard[3][2] = "C4";
        gameBoard[4][2] = "C5";
        gameBoard[0][3] = "D1";
        gameBoard[1][3] = "D2";
        gameBoard[2][3] = "D3";
        gameBoard[3][3] = "D4";
        gameBoard[4][3] = "D5";
        gameBoard[0][4] = "E1";
        gameBoard[1][4] = "E2";
        gameBoard[2][4] = "E3";
        gameBoard[3][4] = "E4";
        gameBoard[4][4] = "E5";

        //  for (int i = 0; i < boardWidth; i++) {
        //   for (int j = 0; j <boardHeight ; j++) {
//
//                }
//
//            }
        printMap();
        Random shipSelection = new Random();
        int shipRandomX = shipSelection.nextInt(boardWidth);
        int shipRandomY = shipSelection.nextInt(boardHeight);

        System.out.println("Random ship selection is: "+ shipRandomX + " " + shipRandomY);

        //  System.out.println("okay, Goodbye");

    }
    public static void printMap(){
        /* Exterior*/
        for (int y = 0; y < boardHeight; y++) {
            /*Interior*/
            for (int x = 0; x < boardWidth; x++) {
                System.out.print(gameBoard[x][y] + " ");

            }
            System.out.println("");

        }
    }
}