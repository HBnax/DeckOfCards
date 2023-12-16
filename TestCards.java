public class TestCards
{
    public static void main(String[] args)
    {
        //testing Card.java
        Card faceCard = new Card(Card.ACE, Card.SPADES);
        Card numberedCard = new Card(8, Card.HEARTS);

        Card newCard = new Card();
        Card copiedCard = new Card(numberedCard);

        System.out.println(faceCard.toString()); //Ace of Spades
        System.out.println(numberedCard.toString()); //8 of Hearts
        System.out.println(newCard.toString()); //Ace of Spades
        System.out.println(copiedCard.toString()); //8 of Hearts

        System.out.println(faceCard.equals(newCard)); //true
        System.out.println(newCard.equals(numberedCard)); //false
        System.out.println(numberedCard.equals(copiedCard)); //true

        //testing Deck.java
        Deck newCards = new Deck();

        System.out.println(newCards.toString()); //4 of each rank
        System.out.println(newCards.size()); //52

        System.out.println(newCards.deal()); //random carrd
        System.out.println(newCards.toString()); //list without the random card
        System.out.println(newCards.size()); //51

        //testing Dealer.java
        Dealer newDeck = new Dealer();

        System.out.println(newDeck.size()); //52
        System.out.println(newDeck.deals(12)); //list of 12 cards
        System.out.println(newDeck.toString()); //list without the 12 cards
        System.out.println(newDeck.size()); //40

    }
}