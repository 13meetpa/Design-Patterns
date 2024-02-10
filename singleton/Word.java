/**
 * The Word class represents a word with its type, definition, and sentence usage
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;
    /**
     * Constructs a new Word object with the specified word, type, definition, and sentence
     * @param word The word itself
     * @param type The type or part of speech of the word
     * @param definition The definition of the word
     * @param sentence  A sentence demonstrating the usage of the word
     */
    public Word(String word, String type, String definition,String sentence ) {

        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;

    }
    /**
     * Retrieves the word
     * @return The word
     */
    public String getWord() {
        return word;

    }
    /**
     * Retrieves a description of the word including its type, definition, and usage in a sentence
     * @return A formatted string containing the type, definition, and sentence
     */
    public String getDescription() {
        return "Type: " + type + "\nDefinition: " + definition + "\nSentence: " + sentence;
    }
   
}