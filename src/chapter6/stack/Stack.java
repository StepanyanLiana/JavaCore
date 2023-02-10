package chapter6.stack;

public class Stack {
    int stck[] = new int[10];
    private int tos;
   public Stack() {
        tos = -1;
    }

   public void push(int item) {
        if (tos == 9) {
            System.out.println("Cтeк заполнен.");
        } else {
            stck[++tos] = item;
        }
    }
       public int pop() {
            if(tos < 0) {
                System.err.println("Cтeк не загружен.");
                return 0;
            }else{
                return stck[tos--];
            }
    }
    }


