package libsvm;

import java.io.IOException;

/**
 * Created by luoluyao on 2017/11/20.
 */
public class TestLibsvm {
    public static void main(String[] args) throws IOException{
        String[] argvTrain = {"E:\\luoluyao\\java\\svm\\train_bc", "E:\\luoluyao\\java\\svm\\train_model"};
        String[] argvPredict = {"E:\\luoluyao\\java\\svm\\test_bc", "E:\\luoluyao\\java\\svm\\train_model", "E:\\luoluyao\\java\\svm\\predict"};
        System.out.println("start----------------------");
        svm_train.main(argvTrain);
        svm_predict.main(argvPredict);
        System.out.println("end------------------------");
    }
}
