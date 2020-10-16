public class CardRunner {
    public static void main(String args[]){
        // ☕
        // System.out.println("hey");
        // TerrapinCard card = new TerrapinCard(10);
        // System.out.println("Billy: " + card);
        // card.loadMoney(-15);
        // System.out.println("Billy: " + card);

        TerrapinCard cardBilly = new TerrapinCard(20);
        TerrapinCard cardBrian = new TerrapinCard(30);
        cardBilly.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);
        cardBilly.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);
        cardBilly.payEconomical();
        cardBilly.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Billy: " + cardBilly);
        System.out.println("Brian: " + cardBrian);
    }
}