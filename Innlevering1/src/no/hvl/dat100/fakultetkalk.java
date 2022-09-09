package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class fakultetkalk {
	public static void main(String[] args) {
        int n = parseInt(showInputDialog("Input number:"));
        int faculty = n;
        System.out.print(n + "! = " + n);
        do {

            faculty--;
            n = n * faculty;
            System.out.print("*" + faculty);
        }while(faculty != 1);
        System.out.print(" = " + n);
		
	}

}
