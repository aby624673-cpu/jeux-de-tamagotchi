import java.util.Random;

public class Tamagotchi {

    // 1. Déclaration des attributs
    private int age;
    private int dureeDeVie;
    private int maxEnergie;
    private int energie;
    private String nom;
    Random r=new Random();

    // 2. Constructeur
    public Tamagotchi(String nom) {

        this.nom = nom;
        this.age = 0;

        this.dureeDeVie = r.nextInt(6)+9;
       

        this.maxEnergie = r.nextInt(5)+5 ;

        this.energie = r.nextInt(maxEnergie -2)+3;
        
    }
    public String getNom(){
        return nom;
    }
    // la mehode qui fait parler le tamagotchi
    public void parler(){
        if(energie > 5){
            System.out.println("nom tamagotchi:"+ nom + "Etat: heureux");

        }else{
            System.out.println("nom tamagotchi:"+ nom + "Etat: affamé");

        }
    }
    //la methode manger
    public void manger(){
        if(energie==maxEnergie){
            System.out.println("le tamagotchi n’a pas faim");
        }else{
        int aug=r.nextInt(3)+1;
        energie=energie + aug;
             if(energie > maxEnergie){
                energie=maxEnergie;
           
            } System.out.println(nom + "Merci !");
        }
    }
    // controle si le tamagotchi a atteint son age limite
    public boolean ageLimite(){
        return age==dureeDeVie;
        
    }
    //la methode vire

    
    public boolean vivre() {
        if(age==dureeDeVie){
            return true;
        }
        if(energie <=0){
            System.out.println("je meurs");
            return false;
        }
        if(energie > 0){
            age=age+1;
            energie=energie-1;
            if(ageLimite()){
                System.out.println("j'ai atteint mon age limite!");
            }else{
                parler();
            }

        }return true;
    }
    
}
