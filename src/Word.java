public class Word {
    String mainWord,answer;
    public Word(String mainWord,String answer){
        this.mainWord=mainWord;
        this.answer=answer;
    }
    public String getMainWord(){
        return mainWord;
    }
    public String getAnswer(){
        return answer;
    }
    public boolean compare(String arg){
        return answer.equals(arg);
    }
    public void print(){
        System.out.println("main: "+mainWord+" answer: "+answer);
    }
}
