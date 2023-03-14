public class Main {
    public static void main(String[] args) {

        Chigo chigo = new Chigo("Chigo", "У современных Chigo автоматическое выравнивание " +
                "громкости,\nобъемное звучание, стереозвук.", EnumColor.BLACK,
                120, 60);
        Lg lg = new Lg("LG", "Сегодня у LG с экраном QLED можно назвать улучшенным " +
                "вариантом LED-экрана.", EnumColor.WHITE, 120, 60);

        Sony sony = new Sony("Sony", "Некоторые современные " +
                "телевизоры, произведенные компанией Sony, оснащаются специальными " + "\n" +
                "слотами для подключения фирменных карт памяти стандарта Memory Stick.",
                120, 60, EnumColor.GRAY);

        Redmi redmi = new Redmi("6GB", "redmi", "13 mpx");
        Huawei huawei = new Huawei("8GB", "huawei", "Lite/10i HB396286");
        Samsung samsung = new Samsung("12GB", "samsung", "micro SDHC 32GB");
////
        System.out.println(createObject(huawei.toString()));
        System.out.println(createObject(redmi.toString()));
        System.out.println(createObject(samsung.toString()));
        System.out.println("---------------");
        System.out.println(createObject(chigo.toString()));
        System.out.println(createObject(lg.toString()));
        System.out.println(createObject(sony.toString()));
    }


    //    public class  {
    public static Object createObject(String className) {
        switch (className) {

            case "Chigo":
                Chigo chigo = new Chigo ("Chigo", "У современных Chigo автоматическое выравнивание " +
                        "громкости,\nобъемное звучание, стереозвук.", EnumColor.BLACK,
                        120, 60);
                chigo.print();
                return chigo;

            case "LG":
                Lg lg = new Lg("LG", "Сегодня у LG с экраном QLED можно назвать улучшенным " +
                        "вариантом LED-экрана.", EnumColor.WHITE, 120, 60);
                lg.print();
                return lg;

            case "Sony":
                Sony sony = new Sony("Sony", "Некоторые современные " +
                        "телевизоры, произведенные компанией Sony, оснащаются специальными " + "\n" +
                        "слотами для подключения фирменных карт памяти стандарта Memory Stick.",
                        120, 60, EnumColor.GRAY);
                sony.print();
                return sony;

            case "Redmi":
                Redmi redmi = new Redmi("6GB", "redmi", "13 mpx");
                redmi.print();
                return redmi;

            case "Huawei":
                Huawei huawei = new Huawei("8GB", "huawei", "Lite/10i HB396286");
                huawei.print();
                return huawei;
            case "Samsung":
                Samsung samsung = new Samsung ("12GB", "samsung",
                        "micro SDHC 32GB");
                samsung.print();
                return samsung;
        }
        return createObject(className);
    }
}

