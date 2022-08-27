public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println ("Задание 1");
        int dog = 1;
        byte coffee = 126;
        short milk = 230;
        long cat = 2309l;
        float spring = 3.3f;
        double winter = 3.3;
        System.out.println("Значение пременной dog c типом int равно " +dog);
        System.out.println("Значение пременной coffee c типом byte равно " +coffee);
        System.out.println("Значение пременной milk c типом short равно " +milk);
        System.out.println("Значение пременной cat c типом long равно " +cat);
        System.out.println("Значение пременной spring c типом float равно " +spring);
        System.out.println("Значение пременной winter c типом double равно " +winter);

        //Задание 2
        System.out.println ("Задание 2");
        double egg = 27.12;
        long banana = 987678965549l;
        float apple=2.786f;
        boolean cake = false;
        short cocaCola = 569;
        short pepsi = -159;
        short sprite = 27897;
        byte iceCream = 67;

        //Задание 3
        System.out.println ("Задание 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        int allStudent = classLP+classAS+classEA;
        short paper = 480;
        int paperStudent = paper/allStudent;
        System.out.println("На каждого ученика рассчитано " +paperStudent+ " листов бумаги");

        //Задание 4
        System.out.println ("Задание 4");
        byte outputPerMinute = 16/2;
        int outputPer20Minute = 20*outputPerMinute;
        short dayInMinute = 24*60;
        int outputPerDay = dayInMinute*outputPerMinute;
        int threeDayInMinute = 3*dayInMinute;
        int outputPer3Day = threeDayInMinute*outputPerMinute;
        int monthInMinute=30*dayInMinute;
        int outputPerMonth = monthInMinute*outputPerMinute;
        System.out.println("За 20 минут машины произвели бутылок " +outputPer20Minute+" штук");
        System.out.println("За день машины произвели бутылок " +outputPerDay+" штук");
        System.out.println("За 3 дня машины произвели бутылок " +outputPer3Day+" штук");
        System.out.println("За Месяц машины произвели бутылок " +outputPerMonth+" штук");

        //Задание 5
        System.out.println ("Задание 5");
        byte allPaint =120;
        byte whiteFor1Office = 2;
        byte brownFor1Office = 4;
        int paintFor1Office =whiteFor1Office+brownFor1Office;
        int allOffice = allPaint/paintFor1Office;
        int allWhitePaint = allOffice*whiteFor1Office;
        int allBrownPaint = allOffice*brownFor1Office;
        System.out.println("В школе, где " +allOffice+ " классов, нужно " +allWhitePaint+ " банок белой краски и " +allBrownPaint+ " банок коричневой краски");

        //Задание 6
        System.out.println ("Задание 6");










    }
}