import java.util.LinkedList;

/**
 * Dealer creates a class with methods to draw cards from deck, 
 * find the size of the deck, and print the cards in the deck
 * 
 * @author Halle Broadnax
 * @version 1.0
 * @see Card
 * @see Deck
 * @see Dealer
 */

public class Dealer
{
    /**
     * Member variable to store the deck of cards
     */
    private Deck m_deck;

    /**
     * default constructor to create a new deck
     * of 52 cards with every combo of rank/suit
     */
    public Dealer()
    { 
        m_deck = new Deck();
    }

    /**
     * deals method that deals a given number of random cards
     * from the deck
     * @param n int represents the # of cards that will be drawn
     * @return dealtCards LinkedList represents the cards that were 
     * drawn from the deck
     */
    public LinkedList<Card> deals(int n)
    {
        LinkedList<Card> dealtCards = new LinkedList<Card>();
        if (n != 0)
        {
            for (int i = 0; i < n; i++)
            {
                Card drawnCard = m_deck.deal();

                dealtCards.add(drawnCard);
            }
        }
        return dealtCards;
    }

    /**
     * size method to print the size of the deck
     * @return numOfCards 
     */
    public int size()
    {
        int numOfCards = m_deck.size();

        return numOfCards;
    }

    /**
     * toString method to print out each card in the deck
     * @return s String representing the list of cards (deck)
     */
    public String toString()
    {
        String s = "";
        
        s += m_deck.toString();

        return s;
    } 
}