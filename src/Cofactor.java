public class Cofactor {
    private int components;
    private int maxIter;
    private int batchSize;
    private float initStd;
    private float lamTheta;
    private float lamBeta;
    private float lamGamma;
    private float c0;
    private float c1;

    public Cofactor(int components, int maxIter, int batchSize, float initStd,
                    float lamTheta, float lamBeta, float lamGamma, float c0, float c1) {
        this.components = components;
        this.maxIter = maxIter;
        this.batchSize = batchSize;
        this.initStd = initStd;
        this.lamTheta = lamTheta;
        this.lamBeta = lamBeta;
        this.lamGamma = lamGamma;
        this.c0 = c0;
        this.c1 = c1;
        assert c0 < c1: "c0 must be smaller than c1";
    }


}
