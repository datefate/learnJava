package inherit;

/**
 * @author datefate
 * @site create 2020-09-25-下午8:18
 */
public class Chichi extends Persons {
    Chichi(){
        super();
        System.out.println("Chihi");
    }

    @Override
    public void run(Persons c){
        System.out.println(" Chichi run");
    }

    public static void main(String[] args) {
        Persons c = new Chichi();
        c.run(c);
    }
}
