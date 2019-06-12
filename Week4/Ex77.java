

public class Ex77
{
    public static void main(String[] args)
    {
        LyyraCard pekkaCard = new LyyraCard(20);
        LyyraCard brianCard = new LyyraCard(30);

        pekkaCard.payGourmet();
        brianCard.payEconomical();

        System.out.println(pekkaCard);
        System.out.println(brianCard);

        pekkaCard.loadMoney(20);
        brianCard.payGourmet();

        System.out.println(pekkaCard);
        System.out.println(brianCard);

        pekkaCard.payEconomical();
        pekkaCard.payEconomical();

        brianCard.loadMoney(50);

        System.out.println(pekkaCard);
        System.out.println(brianCard);
       
    }
}