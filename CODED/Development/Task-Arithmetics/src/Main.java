public class Main {
    public static void main(String[] args) {
        double amountKWD=86;
        double amountUS=100;
        double amountEUR=100;
        double USRateExchangeToKWD=3.25;

        double EURRateExchangeToKWD=3.0;
        // with print new line method
        System.out.println(amountKWD+" KWD = "+(amountKWD*USRateExchangeToKWD)+" US");
        System.out.println(amountUS+" US = "+(amountKWD*(1/USRateExchangeToKWD)));


        System.out.println(amountKWD+" KWD = "+(amountKWD*EURRateExchangeToKWD)+" EUR");
        System.out.println(amountEUR+" EUR = "+ (amountEUR*(1/EURRateExchangeToKWD))+" KWD");

        //With printf method
        System.out.printf(" %.2f KWD = %.2f US\n",amountKWD,(amountKWD*USRateExchangeToKWD));
        System.out.printf("%.2f US = %.2f KWD \n",amountUS,(amountKWD*(1/USRateExchangeToKWD)));
        System.out.printf(" %.2f KWD = %.2f EUR\n",amountKWD,(amountKWD*EURRateExchangeToKWD));
        System.out.printf("%.2f EUR = %.2f KWD \n",amountEUR,(amountEUR*(1/EURRateExchangeToKWD)));
    }
}