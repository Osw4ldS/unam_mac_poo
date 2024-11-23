package semana8creandoObjetos;

import javax.swing.*;

public class MenuJOptionPane {
    public static void menu() {
        //Opciones Que Apareceran En El OptionDialog
        String[] opciones = {
                "MessageDialog",
                "InputDialog",
                "ConfirmDialog",
                "OptionDialog",
                "Salir"
        };

        //Variable Donde Se Guarda El OptionDialog
        int opcion = 0;

        do {
            //Para Opciones Multiples
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción",
                    "Opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            //para elegir el menu
            if (opcion >= 0 && opcion < 4) subMenu(opcion); //invoca funcion submenu
            else {
                //MessageDialog Sin Icono
                JOptionPane.showMessageDialog(
                        null,
                        "Gracias Por Usar El Programa",
                        "Ay Un Gato, Jose Y Mas",
                        JOptionPane.PLAIN_MESSAGE
                );
            }

        } while(opcion != 4 && opcion != JOptionPane.CLOSED_OPTION);
    }

    public static void subMenu(int id) {
        //Opciones Para El JOptionPane.showOptionDialog
        String[] opcionesMessage = {
                "Informativo",
                "De Pregunta",
                "Error",
                "Advertencia",
                "Sin Icono",
                "Salir"
        };
        //Opciones Para El JOptionPane.showOptionDialog
        String[] opcionesConfirm = {
                "YES",
                "YES/NO",
                "YES/NO/CANCEL",
                "Salir"
        };

        int opcion = 0;

        if (id == 0) {

            do {
                //Para Opciones Multiples
                opcion = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona una opción",
                        "Opciones",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesMessage,
                        opcionesMessage[0]
                );

                //para elegir el menu
                if (opcion >= 0 && opcion < 6) crearMessageDialog(opcion);

            } while(opcion != 6 && opcion != JOptionPane.CLOSED_OPTION);

        } else if(id == 1) {
            crearInputDialog();
        } else if(id == 2) {

            do {
                //Para Opciones Multiples
                opcion = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona una opción",
                        "Opciones",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesConfirm,
                        opcionesConfirm[0]
                );

                //para elegir el menu
                if(opcion >= 0 && opcion < 3) crearConfirmDialog(opcion);

            } while(opcion != 3 && opcion != JOptionPane.CLOSED_OPTION);
        } else if(id == 3) {
            crearOptionDialog();
        }
    }

    public static void crearMessageDialog(int id) {
        if (id == 0) { //showMessageDialog De Información
            JOptionPane.showMessageDialog(
                    null,
                    "Mensaje Informativo",
                    "Information Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else if(id == 1) {//showMessageDialog De Pregunta
            JOptionPane.showMessageDialog(
                    null,
                    "Mensaje De Pregunta",
                    "Question Message",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else if(id == 2) { //showMessageDialog De Error
            JOptionPane.showMessageDialog(
                    null,
                    "Mensaje De Error",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if(id == 3) { //showMessageDialog De Advertencia
            JOptionPane.showMessageDialog(
                    null,
                    "Mensaje De Advertencia",
                    "Warning Message",
                    JOptionPane.WARNING_MESSAGE
            );
        } else if(id == 4) {//showMessageDialog De Sin Icono
            JOptionPane.showMessageDialog(
                    null,
                    "Mensaje Sin Icono",
                    "Plain Message",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }

    public static void crearInputDialog() {
        String adivina = "";

        //showInputDialog
        adivina = JOptionPane.showInputDialog(
                null,
                "Ingrese Un Numero",
                "Pensamiento Cognitivo",
                JOptionPane.PLAIN_MESSAGE
        );

        if (adivina != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "El Numero Que Estas Pensando Es " + adivina,
                    "Pensamiento Cognitivo",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No Ingresaste Nada",
                    "Pensamiento Cognitivo",
                    JOptionPane.CANCEL_OPTION
            );
        }

    }

    public static void crearConfirmDialog(int id) {
        int adivina = 0;

        if(id == 0) {
            adivina = JOptionPane.showConfirmDialog(
                    null,
                    "OK",
                    "OK",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if(adivina == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Gracias",
                        "Thanks",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        } else if(id == 1) {
            adivina = JOptionPane.showConfirmDialog(
                    null,
                    "¿Deseas continuar?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if(adivina == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresaste Si",
                        "Pensamiento Cognitivo",
                        JOptionPane.PLAIN_MESSAGE
                );
            } else if (adivina == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresaste No",
                        "Pensamiento Cognitivo",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        } else if(id == 2) {
            adivina = JOptionPane.showConfirmDialog(
                    null,
                    "¿Deseas continuar?",
                    "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if(adivina == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresaste Si",
                        "Pensamiento Cognitivo",
                        JOptionPane.PLAIN_MESSAGE
                );
            } else if(adivina == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresaste No",
                        "Pensamiento Cognitivo",
                        JOptionPane.PLAIN_MESSAGE
                );
            } else if (adivina == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Cancelaste Opcion",
                        "Pensamiento Cognitivo",
                        JOptionPane.CANCEL_OPTION
                );
            }
        }
    }

    public static void crearOptionDialog() {
        //Opciones Que Apareceran En El OptionDialog
        String[] opciones = {
                "Opcion1",
                "Opcion2",
                "OpcionSecreta",
                "Salir"
        };

        //Variable Donde Se Guarda El OptionDialog
        int opcion = 0;

        do{
            //Para Opciones Multiples
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción",
                    "Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            //para elegir el menu
            switch(opcion) {
                case 0:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion 1",
                            "Titulo De Opcion 1",
                            JOptionPane.PLAIN_MESSAGE
                    );
                    break;
                case 1:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion 2",
                            "Titulo De Opcion 2",
                            JOptionPane.PLAIN_MESSAGE
                    );
                    break;
                case 2:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion Secreta",
                            "Titulo De Opcion Secreta",
                            JOptionPane.PLAIN_MESSAGE
                    );
                    break;
                case 3:
                    break;
            }
        } while(opcion != 3 && opcion != JOptionPane.CLOSED_OPTION);
    }

    public static void main(String[] args) {
        menu();
    }
}