public class Estudiante {
    String nombre;
    int edad;
    double[] calificaciones=new double[3];

    public Estudiante(String nombre,int edad,double[] calificaciones){
        this.nombre=nombre;
        this.edad=edad;
        this.calificaciones=calificaciones;
    }


    public double calcularPromedio(){
        double promedio=0;
        for(int i=0; i<3; i++){
           promedio+=calificaciones[i]/3;


        }
        return promedio;

    }

    public void mostrarInformacionEstudiante(){
        System.out.println("nombre de alumno: "+nombre);
        System.out.println("edad de alumno: "+edad);
        System.out.println("promedio del alumno: "+calcularPromedio());
        for(int i=0; i<calificaciones.length;i++){
            System.out.println("calificacion: "+calificaciones[i]);
        }

    }


}


