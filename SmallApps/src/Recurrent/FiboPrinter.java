package Recurrent;

public class FiboPrinter {
    int i = 10;
    public void printer(int a) {

            if ((a >=0) && (i>0)){
                System.out.println(a);
                i--;
                printer(a-1);
                return;
            }
            else {
                return;
            }
        }
    }

