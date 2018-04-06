/**
 * Created by Juan on 30/03/2018.
 * {@link ReportCard} represents a report card of a student, containing its full name and
 * grades of Math, Chemistry, History and English
 *
 */

public class ReportCard {
    /**
     * Default translation for the word
     */
    private char mMathGrade;
    private char mChemistryGrade;
    private char mHistoryGrade;
    private char mEnglishGrade;
    private String mStudentFullName;


    public ReportCard(String name, char mathGrade, char chemistryGrade, char historyGrade, char englishGrade) {
        mMathGrade = mathGrade;
        mChemistryGrade = chemistryGrade;
        mHistoryGrade = historyGrade;
        mEnglishGrade = englishGrade;
        mStudentFullName = name;
    }

    /**
     * This setter method is to set the Full Student Name
     *
     * @param name
     */
    public void setStudentName(String name) {
        mStudentFullName = name;
    }

    /**
     * This setter method is to set the math grade
     *
     * @param grade
     */
    public void setMathGrade(char grade) {
        mMathGrade = grade;
    }

    /**
     * This setter method is to set the chemistry grade
     *
     * @param grade
     */
    public void setmChemistryGrade(char grade) {
        mChemistryGrade = grade;
    }

    /**
     * This setter method is to set the history grade
     *
     * @param grade
     */
    public void setHistoryGrade(char grade) {
        mHistoryGrade = grade;
    }

    /**
     * This setter method is to set the english grade
     *
     * @param grade
     */

    public void setEnglishGrade(char grade) {
        mEnglishGrade = grade;
    }

    /* This method is to get the Student Full Name
    * @return mStudentFullName
    */
    public String getStudentName() {
        return mStudentFullName;
    }

    /* This method is to get the math grade
    * @return mMathGrade
    */

    public char getMathGrade() {
        return mMathGrade;
    }

    /* This method is to get the chemistry grade
    * @return mChemistry
    */

    public char getChemistryGrade() {
        return mChemistryGrade;
    }

    /* This method is to get the history grade
    * @return mHistoryGrade
    */

    public char getHistoryGrade() {
        return mHistoryGrade;
    }

    /* This method is to get the english grade
    * @return mEnglishGrade
    */

    public char getEnglishGrade() {
        return mEnglishGrade;
    }

    /* The most important portion of your project will be the toString() method, which gives
    * a human-readable String representing the data stored in the report card
    */
    @Override
    public String toString() {
        return "Name: " + getStudentName() + "\n" + "\n" + "Math grade: " + getMathGrade() + "\n" +
                "History grade: " + "Chemistry grade: " + getChemistryGrade() + getHistoryGrade() +
                "English grade: " + getEnglishGrade();
    }
}
