package uts;

import java.util.Scanner;

public class Suit {
  static Scanner Input = new Scanner(System.in);

  public static void main(String[] args) {
    int compPlay = (int) Math.floor(Math.random() * 3 + 1);
    String compTake = "";
    int userPlay;
    String userTake = "";
    boolean isPlaying = true;

    while (isPlaying) {
      System.out.println("1. Batu");
      System.out.println("2. Kertas");
      System.out.println("3. Gunting");
      System.out.print("Masukkan pilihanmu: ");
      userPlay = Input.nextInt();
      if (userPlay < 1 || userPlay > 3) {
        System.out.println("Input yang dimasukkan tidak valid");
        System.exit(0);
      }

      switch (compPlay) {
        case (1) -> compTake = "batu";
        case (2) -> compTake = "kertas";
        case (3) -> compTake = "gunting";
      }
      switch (userPlay) {
        case (1) -> userTake = "batu";
        case (2) -> userTake = "kertas";
        case (3) -> userTake = "gunting";
      }

      System.out.println("Komputer memilih: " + compTake);
      System.out.println("Kamu memilih: " + userTake);
      System.out.println();
      if (userPlay == compPlay) {
        System.out.println("Seri");
      } else if ((userPlay == 1 && compPlay == 2) || (userPlay == 2 && compPlay == 3)
          || (userPlay == 3 && compPlay == 1)) {
        System.out.println("Kamu Kalah");
      } else {
        System.out.println("Kamu Menang");
      }

      System.out.println("Apakah ingin bermain lagi? (y/t): ");
      char isPlayAgain = Input.next().charAt(0);
      if (isPlayAgain == 't' || isPlayAgain == 'T') {
        isPlaying = false;
      }
      compPlay = (int) Math.floor(Math.random() * 3 + 1);
    }
  }
}
