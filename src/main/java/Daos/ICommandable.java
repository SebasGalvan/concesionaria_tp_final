package Daos;


public interface ICommandable<T>{


    public void create(T item);
    public void remove();
    public void update();
    public void findAll();
    public void finadById();

}
