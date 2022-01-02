import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MoodAnalyser {
    private static String message;

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
    Use Case 2: Handle exception if user provides invalid mood
     */
    public static String analyseMoodHandleInvalid() {
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
            mood =  "Happy";
        }
        return mood;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall analyse mood of a person.");
        MoodAnalyser moodanalyser = new MoodAnalyser("Feeling Sad");
        String mood = moodanalyser.analyseMoodHandleInvalid();
        System.out.println("The mood of the person is: "+ mood);
    }
}
