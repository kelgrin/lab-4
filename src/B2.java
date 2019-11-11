public class B2 extends A2{
    int total;

    void sum(){
        total=i+j; //Ошибка: член j в этом классе недоступен
    }

}
