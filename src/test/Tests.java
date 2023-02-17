import org.junit.Assert;
import org.junit.Test;

public class Tests {
    public Tests() {
    }

    @Test
    public void testFirst() {
        Main dist = new Main();
        Assert.assertEquals(0.621, dist.kilToMil(1.0), 3.0);
        Assert.assertEquals(16.093, dist.milToKil(10.0), 3.0);
        Assert.assertEquals(13.257, dist.verToMil(20.0), 3.0);
        Assert.assertEquals(32.004, dist.verToKil(30.0), 3.0);
    }

    @Test
    public void testSecond() {
        Main dist = new Main();
        Assert.assertEquals(1.989, dist.verToMil(3.0), 3.0);
        Assert.assertEquals(7.542, dist.milToVer(5.0), 3.0);
        Assert.assertEquals(3.75, dist.kilToVer(4.0), 3.0);
        Assert.assertEquals(62.137, dist.kilToMil(100.0), 3.0);
    }
}