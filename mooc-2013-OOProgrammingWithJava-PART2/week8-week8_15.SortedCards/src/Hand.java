import java.util.*;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card card: hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int getSum(){
        int sum = 0;
        for(Card card: this.hand){
            sum = sum + card.getValue();
        }
        return sum;
    }
    
    public int compareTo(Hand hand){
        if(this.getSum() == hand.getSum()){
            return 0;
        }else if (this.getSum() < hand.getSum()){
            return -1;
        }else{
            return 1;
        }
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, suitSorter);
    }
    
}
