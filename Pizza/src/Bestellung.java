import java.util.ArrayList;
import java.util.Scanner;

public class Bestellung {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();
        ArrayList<ZahlungsArt> zahlungsArts = new ArrayList<>();
        KundenWahl kundenWahl = new KundenWahl();
        Scanner scanner = new Scanner(System.in);

        Pizza salami = new Pizza("Salami ", 15);
        Pizza hawaii = new Pizza("Hawaii ", 15);
        Pizza Margherita = new Pizza("Margherita ", 12);
        Pizza vegetarisch = new Pizza("Vegetarisch ", 11);

        pizzas.add(salami);
        pizzas.add(hawaii);
        pizzas.add(Margherita);
        pizzas.add(vegetarisch);

        ZahlungsArt paypal = new ZahlungsArt("PayPal");
        ZahlungsArt klarna = new ZahlungsArt("Klarna");
        ZahlungsArt kreditkarte= new ZahlungsArt("Kreditkarte");
        ZahlungsArt vorkasse= new ZahlungsArt("Vorkasse");

        zahlungsArts.add(paypal);
        zahlungsArts.add(klarna);
        zahlungsArts.add(kreditkarte);
        zahlungsArts.add(vorkasse);


        System.out.println("Wilkommen in der Pizzeria! ");

        System.out.print("Wie viel Pizzas wollen Sie bestellen?\n--> ");

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.println("Es gibt folgende Pizzen zu Auswahl:");

            for (int j = 0; j < pizzas.size(); j++) {
                System.out.println((j + 1) + " - " + pizzas.get(j).getName());
            }
            System.out.print("Geben Sie die Zahl der Pizza ein --> ");

            int pizza = scanner.nextInt();

            kundenWahl.setWahlPizza(pizzas.get(pizza - 1));

        }

        System.out.println("Sie haben " + kundenWahl.getWahlPizza().size() + " Pizza(en) bestellt");

        int price = 0;

        for (int i = 0; i < kundenWahl.getWahlPizza().size(); i++) {

            System.out.println("Sie haben Pizza(en) " + kundenWahl.getWahlPizza().get(i).getName() + " bestellt");
            price = price + kundenWahl.getWahlPizza().get(i).getPrice();
        }

        System.out.println("Die Betrag ist " + price + " Euro");

        System.out.println("Wählen Sie eine Zahlungsmethode aus. ");
        for (int j = 0; j < zahlungsArts.size(); j++) {
            System.out.println((j + 1) + " - " + zahlungsArts.get(j).getNameZahlung());
        }
        
        System.out.print("Geben Sie die Zahl der Zahlungsmethode ein --> ");

        int zahlungsArt = scanner.nextInt();

        kundenWahl.setWahlZahlung(zahlungsArts.get(zahlungsArt - 1));

        System.out.println("Sie haben folgende Zahlungsart gewählt: " + kundenWahl.getZahlungsArt().getNameZahlung());
        System.out.println("Danke");

      

    }

}

