package BaseDeDatos;


import java.util.ArrayList;

public interface Comandos <T>{


    public T create();
    public void remove();
    public void update();
    public ArrayList<T> getAll();
    public T getById();

}
