import java.util.Scanner;

public class NeighbourWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peshoDamage=Integer.parseInt(scan.nextLine());
        int goshoDamage=Integer.parseInt(scan.nextLine());
        int count=0;
        int healthPesho=100;
        int healthGosho=100;
        while (healthGosho>0 || healthPesho>0){
            count++;
            if(count%2==0){
                healthPesho-=goshoDamage;
                if(healthPesho<=0){
                    System.out.printf("Gosho won in %dth round.\n",count);
                    break;
                }
                else{
                    System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n",healthPesho );
                }
            }
            else{
                healthGosho-=peshoDamage;
                if(healthGosho<=0){
                    System.out.printf("Pesho won in %dth round.\n",count);
                    break;
                }
                else{
                    System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n",healthGosho );
                }
            }
            if(count%3==0){
                healthGosho+=10;
                healthPesho+=10;
            }
        }
    }
}
