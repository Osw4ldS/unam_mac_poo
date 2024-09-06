package semana3;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Fecha {
    public static void main(String[] args) {
        Date birthDayDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("DDMMYYYY");
        String birthYear = "";
        int birthYearInt = 0;
        String birthDay = "";
        Date today = new Date();
        String todayStr = "";
        int todayInt = 0;

        birthDay = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimeinto: " +
                "(en formato DDMMAAAA)");

        birthYear = birthDay.substring(4,8);
        birthYearInt = Integer.parseInt(birthYear);

        try {
            birthDayDate = sdf.parse(birthDay);
        } catch(ParseException e) {
            throw new RuntimeException(e);
        }

        todayStr = sdf.format(today);
        todayInt = Integer.parseInt(todayStr.substring(4,8));

        JOptionPane.showMessageDialog(null, "Tu edad es: " + (todayInt-birthYearInt));
    }
}
