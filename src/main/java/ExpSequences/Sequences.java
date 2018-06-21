package ExpSequences;

public class Sequences {

    public static String[] fillWithExpSequencesBG(){
        String[] expSeqBG = new String[5];
        expSeqBG[0] = "[8,6,8,8,3,12,6,3,12,6,10,11,6,12,1,6,8,8,12,12,12,12,1,5,6,7,8,6,7,1,3,3,13,13,13,6,8,13,10,6,13,8,4,10,13,4,7,8,10,7,7,1,6,7,4,8,13,13,6,13,8,5,13,8,6,4,12,1,8,4,4,11,1,6,10,10,8,1,4,4,8,13,9,10,13,8,8,6,4,3,10,3,4,4,4,11,8,11,11,10,10,8,12,13,8,3,5,6,8,12,5,4,12,5,12,6,12,12,13,8,8,12,8,11,12,7,6,7,8,11,4,7,13,9,9,12,8,5,9,9,7,12,8,7,3,9,9,9,9,6,7,6,7,13,11,11,3,11,11,4,11,12,4,8,11,3,11,11,6,11,8,5,11,11,9,9,5,9,8,3,13,13,3,9,9,9,10,5,11,9,9,3,10,6,9,9,9,13,10,9,12,5,12,8,3,12,12,7,4,11,8,6,12,5,5,8,8,11,12,12,10,12,6,5,8,8,6,8,8,3,9,3,8,9,9,9,9,6,4,9,13,8,3,5,9,13,8,12,9,10]";
        expSeqBG[1] = "[9,5,1,9,3,12,5,3,12,5,12,6,5,7,3,5,9,9,4,2,12,4,3,11,5,10,2,5,10,3,3,10,13,13,13,5,10,13,12,5,13,10,12,12,13,12,10,9,11,10,10,9,2,10,7,9,13,13,5,13,9,6,13,9,10,9,4,9,9,12,7,6,1,5,7,4,9,9,7,6,9,13,8,4,13,9,9,12,8,2,2,2,7,12,12,5,2,6,6,4,12,12,4,13,13,3,11,11,12,7,11,2,7,11,7,9,4,7,13,12,12,9,12,6,7,10,5,2,2,12,6,10,9,7,10,4,9,11,7,13,10,4,9,10,3,7,1,7,5,5,10,5,10,13,6,7,3,7,7,4,1,8,4,7,11,3,13,13,5,6,11,6,6,7,8,8,11,8,9,3,13,13,3,8,8,1,9,7,6,11,7,2,9,5,8,8,10,13,9,7,8,11,8,12,3,1,3,10,10,6,12,1,7,11,11,12,8,6,7,4,12,12,5,11,12,9,5,9,9,3,7,1,9,7,7,5,8,3,9,3,13,13,3,12,8,13,9,4,7,9]";
        expSeqBG[2] = "[10,11,1,10,6,12,13,5,7,11,7,5,11,12,7,11,10,10,6,12,11,4,3,6,11,8,2,11,8,3,3,10,13,13,13,11,10,13,7,11,13,10,8,11,13,12,8,6,6,8,8,10,2,8,10,10,13,13,11,13,10,3,13,10,8,10,4,3,10,3,4,5,10,11,7,7,10,11,4,5,10,13,9,7,13,10,10,3,9,2,2,2,4,12,6,11,2,5,5,7,7,10,11,13,13,5,6,11,10,10,6,2,12,6,12,9,5,12,13,10,10,9,10,5,8,8,11,2,2,12,5,8,9,9,8,4,10,6,9,13,8,4,10,10,3,10,3,9,9,11,8,11,8,13,5,10,3,7,7,12,1,11,12,10,10,3,13,13,13,5,10,5,5,10,9,9,6,9,10,3,13,13,10,9,9,10,10,9,5,6,10,2,7,11,9,9,8,13,7,9,12,6,12,10,3,1,8,8,8,5,10,7,10,6,6,10,12,3,10,4,7,8,11,6,10,10,11,10,10,6,9,1,10,9,9,11,9,6,7,4,13,13,13,4,9,13,10,4,9,7]";
        expSeqBG[3] = "[12,11,12,12,5,8,13,11,8,11,8,5,11,9,1,11,9,12,6,8,11,4,9,6,11,10,12,6,10,1,3,12,13,13,13,11,12,13,8,11,13,12,10,8,13,12,10,11,11,10,9,4,6,9,7,9,13,13,11,13,10,3,13,7,12,4,4,8,8,5,7,6,4,11,8,8,1,11,7,4,4,13,10,8,13,4,4,10,3,2,2,2,7,12,5,8,10,4,6,8,8,12,11,13,13,11,5,12,12,7,11,2,7,3,7,12,5,7,6,8,10,9,12,5,12,9,11,2,2,12,5,9,9,10,9,7,3,3,10,2,9,4,9,9,13,7,3,7,7,11,11,11,11,13,5,7,3,8,8,12,1,7,12,8,7,3,13,13,11,5,11,5,5,7,10,10,6,10,9,11,13,13,11,10,10,3,9,7,5,6,7,2,8,3,10,10,9,10,8,7,10,6,10,12,11,10,12,12,12,5,8,1,7,6,6,12,10,4,7,3,8,12,11,6,12,9,11,9,9,6,7,1,9,7,7,3,10,6,8,12,13,13,11,12,10,13,9,4,7,8]";
        expSeqBG[4] = "[12,11,12,12,5,11,4,11,8,12,8,5,11,9,1,11,9,12,3,8,11,4,9,6,11,10,12,6,10,7,3,12,13,13,13,11,12,13,8,11,13,3,10,10,13,12,10,11,11,10,9,4,6,9,7,9,13,13,11,13,10,3,13,7,4,4,1,8,8,5,7,6,4,11,8,8,4,11,7,4,4,13,10,8,13,4,4,10,3,2,2,2,7,12,5,8,4,10,6,8,8,12,11,6,10,11,5,4,4,7,11,4,7,12,7,12,5,7,6,8,4,4,12,4,12,9,11,2,2,12,5,9,9,10,9,7,3,3,10,2,9,4,9,9,13,7,3,3,7,3,11,11,11,13,5,7,3,3,8,3,3,7,12,8,12,3,10,11,11,5,11,5,5,7,10,10,6,10,9,11,13,13,11,10,3,9,9,7,5,6,7,2,8,3,10,10,9,9,8,7,10,6,10,12,11,7,12,12,12,12,8,11,7,3,3,12,10,4,7,4,8,12,11,6,12,9,11,9,9,6,7,9,9,7,7,11,10,9,8,12,13,10,11,12,10,13,9,4,7,8]";
        return expSeqBG;
    }


}
