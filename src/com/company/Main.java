package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
            //se definesc variabilele conform definitiei
        double val1 = 5; double val2 = 9; double val3 = 32;
            //se interogheaza utilizatorul care introduce valoarea in Fah
        double Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog( "Introdu valoarea in grade Fahrenheit"));
            //se aplica formula si se face conversia
        double Celsius = val1 / val2 * (Fahrenheit - val3);
            //se afiseaza mesajul care contine valoarea in Celsius
        JOptionPane.showMessageDialog(null, "Grade Celsius   " + Celsius);
    }
}
