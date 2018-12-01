import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class FrequencyCalculatorTest {

    @Test
    public void should_calculate_frequency_after_adding_1(){
        Calculator freqCalc = new FrequencyCalculator();
        int frequency = freqCalc.calculateFrequencyChange(Arrays.asList("+1"));

        Assert.assertEquals( 1, frequency);
    }

    @Test
    public void should_calculate_frequency_after_removing_2(){
        Calculator freqCalc = new FrequencyCalculator();
        int frequency = freqCalc.calculateFrequencyChange(Arrays.asList("-2"));

        Assert.assertEquals( -2, frequency);
    }

    @Test
    public void should_calculate_frequency_after_removing_2_and_adding_5(){
        Calculator freqCalc = new FrequencyCalculator();
        int frequency = freqCalc.calculateFrequencyChange(Arrays.asList("-2", "5"));

        Assert.assertEquals( 3, frequency);
    }

    @Test
    public void should_calculate_frequency_after_removing_125_and_adding_799(){
        Calculator freqCalc = new FrequencyCalculator();
        int frequency = freqCalc.calculateFrequencyChange(Arrays.asList("-125", "799", "45"));

        Assert.assertEquals( 719, frequency);
    }
}
