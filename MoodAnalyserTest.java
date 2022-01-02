import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    /*
    Test Case 1.1: Sad mood message should return sad
     */
    @Test
    public void givenMessage_WhenSad_shouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("Sad",mood);
    }
    /*
    Test Case 1.2: Happy mood message should return Happy
     */
    @Test
    public void givenMessage_WhenNotSad_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("Happy",mood);
    }

}
