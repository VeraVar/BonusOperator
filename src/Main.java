public class Main {
    public static void main(String[] args) {
        long replenishmentInKopecks = 100001;
        long limitInKopecks = 100000;
        int indexBonus = 100;
        long bonusResult;

        if (replenishmentInKopecks > limitInKopecks) {
            bonusResult = replenishmentInKopecks / indexBonus / 100;
        }
        else {
            bonusResult = 0;
        }
        System.out.println(bonusResult);
    }
}