import java.util.ArrayList;
import java.util.List;

/**
 * Created by andyfeng on 2017/12/20.
 */
public class App {
    public static void main(String [] args) {
        List<String> tempTxList = new ArrayList<String>();
        tempTxList.add("v");
        tempTxList.add("a");
        tempTxList.add("s");
        tempTxList.add("u");
        tempTxList.add("j");

        MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
        merkleTrees.merkle_tree();
        System.out.println("root : " + merkleTrees.getRoot());
    }
}