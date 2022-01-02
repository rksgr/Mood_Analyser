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
    /*
    Test Case 1.1  repeat: Sad mood message should return sad
                            Message passed in constructor in place of method
     */
    @Test
    public void givenMessageInConstructor_WhenSad_shouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }
    /*
    Test Case 1.2 repeat: Happy mood message should return Happy
                          Message passed in constructor in place of method
     */
    @Test
    public void givenMessageInConstructor_WhenNotSad_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

}
