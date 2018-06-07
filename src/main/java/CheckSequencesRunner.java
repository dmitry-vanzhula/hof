import ExpSequences.Sequences;

public class CheckSequencesRunner extends JsHandler {
    public static void main(String[] args) throws Exception {
        String [] expSeqBG = Sequences.fillWithExpSequencesBG();
        System.out.println(AssertEquals.isEqual(expSeqBG, convertSequencesFromJsArrayToJavaArray(5, getJsArraySequencesBG(
                (convertJsStringToJsObject((Client.sendGET(Url.INIT))))))));
    }
}
