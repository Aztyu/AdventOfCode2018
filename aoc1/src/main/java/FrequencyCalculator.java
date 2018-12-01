import java.util.List;

public class FrequencyCalculator implements Calculator{
    @Override
    public int calculateFrequencyChange(List<String> s) {
        return s.stream().mapToInt(Integer::parseInt).sum();
    }
}
