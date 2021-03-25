package InnerClass;

/**
 * @author datefate
 * @site create 2021-03-17-下午11:19
 */
public class Hero {
    String name;
    int leval;

    private class singleHurt{
        int fight;

        public singleHurt(int rate) {
            this.fight = rate;

        }

        public void run(int years){

            System.out.println("The heart has been run "+years);
        }

    }
}
