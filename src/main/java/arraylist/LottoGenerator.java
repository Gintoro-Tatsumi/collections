package arraylist;

import arraylist.interfaces.IIntList;

public class LottoGenerator {
    public static IIntList generateLottoNumbers() {
        IIntList lottoNumbers = new IntArrayList();
        for (int i = 0; i < 6; i++){
            int rand = (int)(Math.random() * 42) + 1;
            lottoNumbers.add(rand);

        }
        return lottoNumbers;
    }
}
