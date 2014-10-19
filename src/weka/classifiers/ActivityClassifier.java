package weka.classifiers;

public class ActivityClassifier {

  public static double classify(Object[] i) {
    double [] sums = new double [3];
    sums[(int) ActivityClassifier_0.classify(i)] += 3.597312260588446;
    sums[(int) ActivityClassifier_1.classify(i)] += 1.0268326062739785;
    sums[(int) ActivityClassifier_2.classify(i)] += 1.206998525242472;
    sums[(int) ActivityClassifier_3.classify(i)] += 3.470306280979577;
    sums[(int) ActivityClassifier_4.classify(i)] += 1.4028057027062708;
    sums[(int) ActivityClassifier_5.classify(i)] += 1.1433117833809883;
    sums[(int) ActivityClassifier_6.classify(i)] += 4.173080615538688;
    sums[(int) ActivityClassifier_7.classify(i)] += 2.222355389813571;
    sums[(int) ActivityClassifier_8.classify(i)] += 1.1415887110768006;
    sums[(int) ActivityClassifier_9.classify(i)] += 3.037360438100634;
    double maxV = sums[0];
    int maxI = 0;
    for (int j = 1; j < 3; j++) {
      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
    }
    return (double) maxI;
  }
}