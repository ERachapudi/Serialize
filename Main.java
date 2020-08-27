import java.io.*;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Eshan", 13, "01");
        File f = new File("C:\\Users\\V R\\IdeaProjects\\Serialization\\src\\Objects.obj");
        try{
            FileOutputStream o = new FileOutputStream(f);
            ObjectOutputStream out = new ObjectOutputStream(o);
            out.writeObject(person);
            out.close();
            o.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream i = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(i);
            Person bob = (Person)(in.readObject());
            System.out.println(bob);
            System.out.println(Person.serialversionUID);
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}