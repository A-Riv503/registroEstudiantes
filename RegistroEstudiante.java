import javax.swing.*;

public class RegistroEstudiante {
    public static void main(String[] args) {
        /*crea una clase llamada estudiante que represente a una estudiante y tenga los siguientes atributos nombre, edad y calificaciones
        (como un array de notas(max3)) la clase debe tener metodos para calcular el promedio de las calificaciones y mostrar la informacion del estudiante.
        luego cree una clase llamada registro estudiantes que contenga un array de objeto de tipo estudiante, el programa debe permitir al usuario
        ingresar los datos de varios estudiantes y luego mostrar la informacion de cada estudiante junto con su promedio.
        * */
        int numEstudiantes=Integer.parseInt(JOptionPane.showInputDialog("cuantos estudiantes desea registrar"));//cantidad de estudiantes que se registraran
        Estudiante[] registroAlumnos=new Estudiante[numEstudiantes];//intento de llenar un arreglo con la distinta informacion de estudiantes

        for(int i=0;i<numEstudiantes;i++){//repite el ciclo de registros para ingresar toda la informacion
            String nombreEstudiante= JOptionPane.showInputDialog("ingrese el nombre del alumno");//informacion de estudiantes
            int edadEstudiante=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
            double[] notaEstudiante=new double[3];

            for(int j=0;j<3;j++){
                notaEstudiante[j]=Double.parseDouble(JOptionPane.showInputDialog("ingrese las notas del estudiante"));//ingresar las 3 notas
            }

            registroAlumnos[i]=new Estudiante(nombreEstudiante,edadEstudiante,notaEstudiante);//darle valor a los atributos de estudiante

           }

           for(Estudiante estudiante : registroAlumnos){
            estudiante.mostrarInformacionEstudiante();
            System.out.println("------------------------------------------");
          }

    }


}

