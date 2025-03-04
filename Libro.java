//Definimos clase Libro y sus propiedades
public class Libro{
    String titulo;
    String autor;
    String numeroPaginas;
//Creamos un constructor que asigne por defecto los valores para cada propiedad
    public Libro(){
        this.autor = "Anonimo";
        this.titulo = "Desconocido";
        this.numeroPaginas = "Desconocido";
    }
//Creamos un constructor parametrizado para las propiedades de la clase Libro
    public Libro(String titulo, String autor, String numeroPaginas ){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String toString(){
        return "---- Libro ---- \nTitulo: "+ titulo + " \nAutor: "+ autor+ " \nnumeroPaginas: "+numeroPaginas+"\n";
    }
}
