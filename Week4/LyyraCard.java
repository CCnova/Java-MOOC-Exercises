

public class LyyraCard
{
    private double balance;

    public LyyraCard(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public String toString()
    {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical()
    {
        if(this.balance > 2.50) {this.balance = this.balance - 2.50;}
    }

    public void payGourmet()
    {
        if(this.balance > 4) {this.balance = this.balance - 4;}
    }

    public void loadMoney(double amount)
    {
        if(amount > 0) {this.balance += amount;}
        
        if(this.balance > 150) {this.balance = 150;}
    }
}