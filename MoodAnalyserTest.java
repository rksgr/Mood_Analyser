import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

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
    /*
    Test Case 2.1: Given Null mood should return happy
     */
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMoodHandleInvalid();
        Assert.assertEquals("Happy",mood);
    }

    /*
    Test Case 3.1: Given Null mood should throw MoodAnalysisException
     */
    @Test
    public void givenNullMoodShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMoodThrowCustomExcept();
            Assert.assertEquals("Happy",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    /*
    Test Case 3.2: Given Empty mood should throw MoodAnalysisException
     */
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMoodThrowCustomExcept();
            Assert.assertEquals("Happy",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}