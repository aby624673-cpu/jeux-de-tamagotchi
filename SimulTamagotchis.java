import java.util.Scanner;

public class SimulTamagotchis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("entrer le nombre de tamagotchi : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Tamagotchi[] tamagotchi = new Tamagotchi[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Quel nom pour le nouveau tamagotchi : ");
            tamagotchi [i] = new Tamagotchi();
            sc.nextLine();
        }

         }
    }

