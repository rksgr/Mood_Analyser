import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyser {
    private static String message;
    enum UserMood {
        NULL,
        EMPTY
    }

    // Default constructor (no arguments)
    public MoodAnalyser(){}

    // Parameterised constructor (Message as argument)
    public MoodAnalyser(String message){
        this.message = message;
    }

    /*
    Use Case 1: Ability to analyse and respond Happy or sad mood given a message
     */
    public static String analyseMood(String message){
        String mood = "";
        Pattern pattern1 = Pattern.compile("[H][a][p][p][y]");
        Pattern pattern2 = Pattern.compile("[S][a][d]");
        Matcher matcher1 = pattern1.matcher(message);
        Matcher matcher2 = pattern2.matcher(message);
        if (matcher1.find()){
            mood = "Happy";
        } else if (matcher2.find()){
            mood = "Sad";
        }
        return mood;
    }
    /*
    Use Case 1 refactored: Ability to analyse and respond Happy or sad mood given a message
                            Mood message in constructor
     */
    public static String analyseMood(){
        String mood = "";
        Pattern pattern1 = Pattern.compile("[H][a][p][p][y]");
        Pattern pattern2 = Pattern.compile("[S][a][d]");
        Matcher matcher1 = pattern1.matcher(message);
        Matcher matcher2 = pattern2.matcher(message);
        if (matcher1.find()){
            mood = "Happy";
        } else if (matcher2.find()){
            mood = "Sad";
        }
        return mood;
    }
    /*
    Use Case 2: Handle Exception if entered invalid mood
     */
    public static String analyseMoodHandleInvalid(){
        String mood = "";
        try{
            Pattern pattern1 = Pattern.compile("[H][a][p][p][y]");
            Pattern pattern2 = Pattern.compile("[S][a][d]");
            Matcher matcher1 = pattern1.matcher(message);
            Matcher matcher2 = pattern2.matcher(message);
            if (matcher1.find()){
                mood = "Happy";
            } else if (matcher2.find()){
                mood = "Sad";
            }
        }
        // Catch exception if a user provides invalid mood
        catch (NullPointerException e) {
            mood = "Happy";
        }
        return mood;
    }
    /*
    Use Case 3: Inform user if entered invalid mood
     */

    public static String analyseMoodThrowCustomExcept() throws MoodAnalysisException{
        String mood = "";
        try{
            Pattern pattern1 = Pattern.compile("[H][a][p][p][y]");
            Pattern pattern2 = Pattern.compile("[S][a][d]");
            Matcher matcher1 = pattern1.matcher(message);
            Matcher matcher2 = pattern2.matcher(message);
            if (matcher1.find()){
                mood = "Happy";
            } else if (matcher2.find()){
                mood = "Sad";
            }
        }
        // Catch exception if a user provides invalid mood
        catch (NullPointerException e) {
            System.out.println(message);
            throw new MoodAnalysisException("Please enter an appropriate message.");
        }
        return mood;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall analyse mood of a person.");
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        try {
            String mood = moodanalyser.analyseMoodThrowCustomExcept();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        UserMood um = UserMood.EMPTY;
    }
}
