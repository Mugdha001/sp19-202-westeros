public interface Subject
{
    void attach(Observer o);
    void notifyObservers(int a , int b);
}