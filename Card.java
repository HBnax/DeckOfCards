/**
 * The Card class creates a card with
 * a rank (2-10, jack, queen, king, ace)
 * and a suit (hearts, spades, clubs, diamonds)
 * 
 * @author Halle Broadnax
 * @version 1.0
 * @see Card
 * @see Deck
 * @see Dealer
 */

public class Card
{
    /**
     * Member variable to store the card's rank
     */
    private int m_rank;

    /**
     * Member variable to store the card's suit
     */
    private int m_suit;

    /**
     * public ints that stores the suits as integers 
     * for better understanding
     */
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    /**
     * public ints that store jack, queen, king, and ace
     * as their int equivalent
     */
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    /**
     * default constructor for a card
     * defaults to an ace of spades
     */
    public Card()
    {
        m_rank = ACE;
        m_suit = SPADES;
    }

    /**
     * overloaded constructor for a card
     * @param userRank int to represent the number value of the card
     * @param userSuit int to represent int equivalent of the card's suit
     */
    public Card(int userRank, int userSuit)
    {
        m_rank = userRank;
        m_suit = userSuit;
    }

    /**
     * Copy constructor for a card
     * @param cardToCopy card that will be copied
     */

    public Card(Card cardToCopy)
    {
        this.m_rank = cardToCopy.m_rank;
        this.m_suit = cardToCopy.m_suit;
    }

    /**
     * Accessor for private variable m_rank
     * @return m_rank representing the card's rank
     */
    public int getRank()
    {
        return m_rank;
    }

    /**
     * Accessor for private variable m_suit
     * @return m_suit representing the card's suit
     */
    public int getSuit()
    {
        return m_suit;
    }

    /**
     * Mutator for private variable m_rank
     * @param userRank int representing the card's rank
     */
    public void setRank(int userRank)
    {
        m_rank = userRank;
    }

    /**
     * Mutator for private variable m_suit
     * @param userSuit int representing the card's suit
     */
    public void setSuit(int userSuit)
    {
        m_suit = userSuit;
    }

    /**
     * toString method to print member variables
     * @return s String displaying the card's suit and rank
     */
    public String toString()
    {
        String s = "";
        if (m_rank <= 10)
        {
            s += String.valueOf(m_rank);
        }
        else if (m_rank == JACK)
        {
            s += "Jack";
        }
        else if (m_rank == QUEEN)
        {
            s += "Queen";
        }
        else if (m_rank == KING)
        {
            s += "King";
        }
        else if (m_rank == ACE)
        {
            s += "Ace";
        }

        s += " of ";

        if (m_suit == HEARTS)
        {
            s += "Hearts";
        }
        else if (m_suit == SPADES)
        {
            s += "Spades";
        }
        if (m_suit == CLUBS)
        {
            s += "Clubs";
        }
        if (m_suit == DIAMONDS)
        {
            s += "Diamonds";
        }

        return s;
    }

    /**
     * equals method to check if two cards are the same
     * @param obj Object to represent the object that will be compared
     * @return boolean that states if two cards are equal to eachother
     */
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(!(obj instanceof Card))
        {
            return false;
        }

        Card cardToCheck = (Card) obj;

        return(this.m_rank == cardToCheck.m_rank && 
               this.m_suit == cardToCheck.m_suit);
    }
}