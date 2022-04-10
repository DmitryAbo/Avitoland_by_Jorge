import java.util.Collection;
import java.util.List;

public class Avito {
    public static void main(String[] args) {
        String input = "(()))(()()";
        char open = 40;
        int numOpen = 0;
        int numClose = 0;


        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == open){
                numOpen++;
            }else{
                numClose++;
            }

            if ((numOpen - numClose) < 0){
                System.out.println("Ошибочка вышла закрылась несуществующая октрытая скобка");
                break;
            }
        }
        if ((numOpen - numClose) != 0){
            System.out.println("Ошибочка вышла не соблюдается равеноство октрытых и закрытых скобок");
        }else if((numOpen - numClose) == 0){
            System.out.println("Послеовательность удовлетворяет условиям");
        }

    }
}
