package jenkins.plugins.testlink.examples;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */
public class TestCurrentTime 
{
    public void testCurrentTime()
    {

    Assert.assertNotNull(System.currentTimeMillis());
    Assert.assertTrue(System.currentTimeMillis()>0);
    }
}
