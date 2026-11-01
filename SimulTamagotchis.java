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
            tamagotchi[i] = new Tamagotchi(sc.nextLine());
        }

        boolean perdu = false;
        boolean gagne = false;
        int cycle = 1;

        while (!perdu && !gagne) {
            System.out.println("-------Cycle no " + cycle + " -------");

            // Faire vivre les Tamagotchis et vérifier la défaite
            for (int i = 0; i < n; i++) {
                if (!tamagotchi[i].vivre()) {
                    System.out.println("PERDU !");
                    perdu = true;
                    break;
                }
            }

            // Vérifier la victoire
            if (!perdu) {
                gagne = true;

                for (int i = 0; i < n; i++) {
                    if (!tamagotchi[i].ageLimite()) {
                        gagne = false;
                        break;
                    }
                }

                if (gagne) {
                    System.out.println("GAGNE !");
                } else {
                    // Choisir le tamagotchi à nourrir
                    for (int i = 0; i < n; i++) {
                        if (!tamagotchi[i].ageLimite()) {
                            System.out.print("(" + i + ") " + tamagotchi[i].getNom() + " ");
                        }
                    }
                    System.out.println("Nourrir quel tamagotchi ? ");

                    int choix = sc.nextInt();
                    tamagotchi[choix].manger();
                }
            }

            cycle++;
        }
    }
}