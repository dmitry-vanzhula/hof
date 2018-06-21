package Runners;

import ExpSequences.Sequences;
import Logic.*;

public class CheckSequencesRunner extends JsHandler {
    public static void main(String[] args) throws Exception {
      /*  String [] expSeqBG = Sequences.fillWithExpSequencesBG();
        System.out.println(AssertEquals.isEqual(expSeqBG, convertSequencesFromJsArrayToJavaArray(5, getJsArraySequencesBG(
                (convertJsStringToJsObject((Client.sendGET(Url.INIT))))))));
                */
        String[] expectedSequencesBG = Sequences.fillWithExpSequencesBG();
        String[] actualSequencesBG = convertSequencesFromJsArrToJavaArr(5, getJsArraySequencesBG((convertJsStrToJsObject((FileReader.convertFromFileToString(FileReader.readFile("E:\\dimatest\\src\\main\\resources\\init.json")))))));
        AssertEquals.isEqualSequences(expectedSequencesBG,actualSequencesBG);
    }
}
