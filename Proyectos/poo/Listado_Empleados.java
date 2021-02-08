package poo;

    class Empleados{

        public static String dameIdSiguiente(){
            return "id siguiente: " + IdSiguiente;
        }

        private final String nombre; // es una forma de evitar que se cambie el valor de una variable y ahora sea una constante de uso final
        private String seccion;
        private int Id;
        private static int IdSiguiente=1;

        public Empleados(String nom){
            nombre = nom;
            seccion = "Administracion";
            Id = IdSiguiente;
            IdSiguiente++;
        }


        public void CambiaSeccion(String seccion){ // setter
            this.seccion = seccion; // this se utiliza para poder diferenciar el campo de clase de lo que es el argumento

        }

        public String nombreEmpleado(){ // getter
            return "Nomnbre: " + nombre + " Seccion: " + seccion + " ID: " + Id;
        }

        /*
        public void CambiaNombre(String nombre){ // setter
            this.nombre = nombre;  // lo converti en una constante
        }
        */
    }


    class Jefatura extends Empleado{
        public Jefatura(String nom, double sue, int año, int mes, int dia){
            super(nom, sue, año, mes, dia);

        }

        public void estableceIncentivo(double b){
            incentivo = b;
        }

        public double dameSueldo(){
            double sueldoJefe = super.dameSueldo();  // remplaza el otro metodo, invalida el anterior

            return sueldoJefe + incentivo;
        }

        private double incentivo;

    }

    class Director extends Jefatura{

        public Director(String nombre, double sue, int agno, int mes, int dia){
            super(nombre,sue,agno,mes,dia);

        }
    }