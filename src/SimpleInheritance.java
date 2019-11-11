public class SimpleInheritance {
    public static  void  call(){
        A superOb = new A();
        B subOb = new B();

        //Суперкласс может использоваться самостоятельно
        superOb.i=10;
        subOb.j=20;
        System.out.println("Содержимое объекта superOb:");
        superOb.showij();
        System.out.println();

        //Подкласс имеет право доступа ко всем открытым членам своего суперкласса
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Содержимое объекта subOb:");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb: ");
        subOb.sum();
    }

}
