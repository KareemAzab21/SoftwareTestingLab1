import org.junit.Test;
import static org.junit.Assert.*;
public class WatermelonTest {
    @Test
    public void test1(){

        Watermelon test1= new Watermelon();
        String output1 = test1.watermelon(30);
        assertEquals(output1,"YES");


    }
    @Test
    public void test2(){

        Watermelon test2= new Watermelon();
        String output2 = test2.watermelon(15);
        assertEquals(output2,"NO");


    }
    @Test
    public void test3(){

        Watermelon test3= new Watermelon();
        String output3 = test3.watermelon(102);
        assertEquals(output3,"NO");


    }

}
