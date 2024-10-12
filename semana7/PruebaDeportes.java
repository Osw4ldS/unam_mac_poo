package semana7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PruebaDeportes {
    public static void main(String[] args) {
        int numDeportes;
        int totalHorarios;
        List<Deporte> deportes = new ArrayList<Deporte>();

        numDeportes = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingrese el número de deportes que va a registrar",
                "Club de Deportes",
                3
        ));

        for(int i = 0; i < numDeportes; i++) {
            Deporte deporte = new Deporte();

            deporte.setNombre(JOptionPane.showInputDialog(
                    null,
                    "Nombre del deporte: ",
                    "CLub de Deportes",
                    3
            ));
            deporte.setLugarEntrenamiento(JOptionPane.showInputDialog(
                    null,
                    "Ingrese el lugar de entrenamiento: ",
                    "CLub de Deportes",
                    3
            ));
            deporte.setEdadesObjetivo(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la edad objetivo: ",
                    "CLub de Deportes",
                    3
            )));
            totalHorarios = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Ingrese el número de horarios: ",
                    "CLub de Deportes",
                    3
            ));

            for(int j = 0; j < totalHorarios; j++) {
                deporte.getHorario().add(JOptionPane.showInputDialog("Ingrese el " + (j+1) + "° horario:"));
            }

            Nivel[] niveles = Nivel.values();

            Nivel seleccion = (Nivel) JOptionPane.showInputDialog(
                    null,
                    "Selecciona un nivel:",
                    "Entrada de Nivel",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    niveles,
                    niveles[0]
            );

            deporte.getEntrenador().setNombre((JOptionPane.showInputDialog(
                    null,
                    "Nombre del entrenador: ",
                    "CLub de Deportes",
                    3
            )));
            deporte.getEntrenador().setApellidoPaterno((JOptionPane.showInputDialog(
                    null,
                    "Apellido paterno: ",
                    "CLub de Deportes",
                    3
            )));
            deporte.getEntrenador().setApellidoMaterno((JOptionPane.showInputDialog(
                    null,
                    "Apellido materno: ",
                    "CLub de Deportes",
                    3
            )));
            deporte.getEntrenador().setSalario(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Ingrese el salario del entrenador: ",
                    "CLub de Deportes",
                    3
            )));
            deporte.getEntrenador().setNumEmpleado(Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Ingrese el número de empleado del entrenador: ",
                    "CLub de Deportes",
                    3
            )));

            deporte.setHorario(deporte.getHorario());
            deportes.add(deporte);
        }

        JOptionPane.showMessageDialog(
                null,
                "Mostrando información...",
                "Club de Deportes",
                1
        );

        for(Deporte deporte : deportes) {
            JOptionPane.showMessageDialog(
                    null,
                    deporte.imprimirInfo(),
                    "Información de " + deporte.getNombre(),
                    1
            );
        }
    }
}
