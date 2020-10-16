public class CardRunner {
    public static void main(String args[]){
        // ☕
        // System.out.println("hey");
        TerrapinCard card = new TerrapinCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

    }
}