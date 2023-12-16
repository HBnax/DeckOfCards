import java.util.LinkedList;
import java.util.Random;

/**
 * The Deck class creates a deck of cards with 
 * every combination of ranks & suits
 * 
 * @author Halle Broadnax
 * @version 1.0
 * @see Card
 * @see Deck
 * @see Dealer
 */
public class Deck
{
    /**
     * Member variable to store the cards in a list
     * that represents the deck
     */
    private LinkedList<Card> m_cards;

    /**
     * default constructor that creates a deck
     * of 52 cards with each combination of rank/suit
     */
    public Deck()
    {
        m_cards = new LinkedList<Card>();

        for (int rank = 2; rank <= 14; rank++)
        {
            for (int suit = 0; suit <= 3; suit++)
            {
                m_cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * copy constructor to copy a deck
     * @param deckToCopy deck that will be copied
     */
    public Deck(Deck deckToCopy)
    {
        m_cards = new LinkedList<Card>();

        for(Card card : deckToCopy.m_cards)
        {
            Card newCard = new Card(card);
            this.m_cards.add(newCard);
        }
    }

    /**
     * toString method to print each card in the deck
     * @return s String representing the list of cards (deck)
     */
    public String toString()
    {
        String s = "";

        for (Card card : m_cards)
        {
            s += card.toString() + "\n";
        }

        return s;
    }

    /**
     * size method to print out the # of cards in the deck
     * @return count int representing the amount of cards in the deck
     */
    public int size()
    {
        int count = 0;

        for (Card card : m_cards)
        {
            count += 1;
        }

        return count;
    }

    /**
     * deal method to deal out a random card from the deck
     * @return cardToRemove Card representing the card "drawn" from the deck
     */
    public Card deal()
    {
        Random random = new Random();
        int sizeOfDeck = m_cards.size();
        int randomCardIndex = random.nextInt(sizeOfDeck);

        Card cardToRemove = m_cards.get(randomCardIndex);
        m_cards.remove(randomCardIndex);

        return cardToRemove;
    }

}