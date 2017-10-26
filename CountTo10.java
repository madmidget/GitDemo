/**
 * Created by joacim on 2017-10-26.
 */
public class CountTo10 {


    private int j;

    public CountTo10(int count){

        this.j = count;
    }


    public int Count() {

        for (j = 0; j < 10; j++) {
            System.out.println("Räknar: " + j);
        }
        return Count();
    }
}