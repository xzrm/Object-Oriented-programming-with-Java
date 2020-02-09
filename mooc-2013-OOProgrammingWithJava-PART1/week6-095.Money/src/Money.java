
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int sumEuros = this.euros + added.euros;
        int sumCents = this.cents + added.cents;
        Money sumObj = new Money(sumEuros, sumCents);
        return sumObj;

    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if ((this.euros() == compared.euros()) && (this.cents() < compared.cents())) {
            return true;

        } else {
            return false;

        }
    }

    public Money minus(Money decremented) {
        int decEuros = 0;
        int decCents = 0;
        
        if (this.less(decremented)) {
            return new Money(decEuros, decCents);
        } else {
            decEuros = this.euros - decremented.euros;
            decCents = this.cents - decremented.cents;
            
            if (decCents < 0) {
                decCents = 100 + this.cents - decremented.cents;
                decEuros = decEuros - 1;
            }
        }
        return new Money(decEuros, decCents);
    }
}
