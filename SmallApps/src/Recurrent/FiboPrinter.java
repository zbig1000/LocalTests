package Recurrent;

public class FiboPrinter {
    private int i;
    private int c;
    public FiboPrinter(int i) {
        this.c = i;
        this.i = i;
    }

    public void printer(int a) {
            if ((a >=0) && (i>0)){
                System.out.println(a);
                i--;
                printer(a-1);
            }
            else {
                i = c;
            }
        }
    }

