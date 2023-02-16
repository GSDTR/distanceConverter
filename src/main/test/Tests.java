import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testFirst() {
        Main dist = new Main();
        Assert.assertEquals(0.621, dist.kilToMil(1),3);
        Assert.assertEquals(16.093, dist.milToKil(10),3);
        Assert.assertEquals(13.257, dist.verToMil(20),3);
        Assert.assertEquals(32.004, dist.verToKil(30),3);

    }

    @Test
    public void testSecond() {
        Main dist = new Main();
        Assert.assertEquals(1.989, dist.verToMil(3),3);
        Assert.assertEquals(7.542, dist.milToVer(5),3);
        Assert.assertEquals(3.750, dist.kilToVer(4),3);
        Assert.assertEquals(62.137, dist.kilToMil(100),3);
    }

}