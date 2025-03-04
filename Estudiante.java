class Estudiante{
    String nombre;
    String edad;
    String curso;
    //Constructor por defecto
    public Estudiante(){
        this.nombre = "Jhon Arrieta";
        this.edad = "1000";
        this.curso = "III";
    }
    //Constructor parametrizado
    public Estudiante(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    // Contructor llamado dentro de otro constructor por medio del uso del this
    public Estudiante(String nombre, String edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    //Sobrescritura de metodos
    @Override
    public String toString(){
        return "---- Estudiante ---- \nNombre: "+ nombre +" \nEdad: "+ edad+ " \nCurso: "+curso+"\n";

    }
}