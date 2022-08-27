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
        byte bananaAmount =5;
        byte banana1Weight = 80;
        int bananaWeight = bananaAmount*banana1Weight;
        short milkAmount =200;
        short milk100Weight = 105;
        int milkWeight = milkAmount*milk100Weight/100;
        byte iceCreamAmount =2;
        byte iceCream1Weight = 100;
        int iceCreamWeight = iceCreamAmount*iceCream1Weight;
        byte eggAmount =4;
        byte egg1Weight = 70;
        int eggWeight = eggAmount*egg1Weight;
        int allWeightGr = bananaWeight+milkWeight+iceCreamWeight+eggWeight;
        double allWeightKg = allWeightGr/(double)1000;
        System.out.println("Общий вес завтрака  " +allWeightGr+" грамм, или " +allWeightKg+ " килограмм");

        //Задание 7
        System.out.println ("Задание 7");
        byte excessWeight = 7;
        int excessWeightGram = excessWeight*1000;
        int day250=excessWeightGram/250;
        int day500=excessWeightGram/500;
        int dayAverage = (day500+day250)/2;
        System.out.println("Если сбрасывать по 250 гр, то спортсмену понадобиться  "+day250+ " дней");
        System.out.println("Если сбрасывать по 500 гр, то спортсмену понадобиться  "+day500+ " дней");
        System.out.println("В среднем спортсмену понадобиться  "+dayAverage+ " дней");

        //Задание 8
        System.out.println ("Задание 8");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        double zpMashaNew = zpMasha*1.1;
        double zpDenisNew = zpDenis*1.1;
        double zpKristinaNew = zpKristina*1.1;
        int year = 12;
        double differenceZpMasha = (zpMashaNew-zpMasha)*year;
        double differenceZpDenis = (zpDenisNew-zpDenis)*year;
        double differenceZpKristina = (zpKristinaNew-zpKristina)*year;
        System.out.println("Маша теперь получает  "+zpMashaNew+ " рублей. Годовой доход вырос на " +differenceZpMasha+ " рублей");
        System.out.println("Денис теперь получает  "+zpDenisNew+ " рублей. Годовой доход вырос на " +differenceZpDenis+ " рублей");
        System.out.println("Кристина теперь получает  "+zpKristinaNew+ " рублей. Годовой доход вырос на " +differenceZpKristina+ " рублей");











    }
}