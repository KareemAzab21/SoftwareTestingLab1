import org.junit.Test;
import static org.junit.Assert.*;


public class EquillibriumTest {

    @Test
    public void test1(){
        int[][] arr1 = { { 4, 1, 7 }, { -2, 4, -1 },{1,-5,-3} };
        Equillibrium test1= new Equillibrium();
        String output1= test1.equib(arr1,3);
        assertEquals(output1,"NO");
    }

    @Test
    public void test2(){
        int[][] arr2 = { { 3,-1,7 }, { -5,2,-4 },{2,-1,-3} };
        Equillibrium test2= new Equillibrium();
        String output1= test2.equib(arr2,3);
        assertEquals(output1,"YES");

    }

}
