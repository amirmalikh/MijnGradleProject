import fraction.Breuk;
import org.junit.Assert;
import org.junit.Test;

public class testFout {
    private Breuk a ;
    private Breuk b ;
    private Breuk c ;

    @Test
    public void breukenOptellenFout() {
        c = a.plus(b);
        Assert.assertEquals(25,c.getTeller());
        Assert.assertEquals(5,c.getNoemer());
    }




}
