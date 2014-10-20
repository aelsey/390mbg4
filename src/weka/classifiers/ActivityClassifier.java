package weka.classifiers;

public class ActivityClassifier {

  public static double classify(Object [] i)
    throws Exception {

    double p = Double.NaN;
    p = ActivityClassifier.N18a5ac4914(i);
    return p;
  }
  static double N18a5ac4914(Object []i) {
    double p = Double.NaN;
    /* zDev */
    if (i[19] == null) {
      p = 2;
    } else if (((Double)i[19]).doubleValue() < 1.1678495966859646) {
    p = ActivityClassifier.N74b9150015(i);
    } else if (true) {
    p = ActivityClassifier.N73fbc82f16(i);
    } 
    return p;
  }
  static double N74b9150015(Object []i) {
    double p = Double.NaN;
    /* xDev */
    if (i[1] == null) {
      p = 2;
    } else if (((Double)i[1]).doubleValue() < 0.32677019491939674) {
      p = 2;
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N73fbc82f16(Object []i) {
    double p = Double.NaN;
    /* xFFT3 */
    if (i[5] == null) {
      p = 3;
    } else if (((Double)i[5]).doubleValue() < 132.75431353610506) {
      p = 3;
    } else if (true) {
      p = 0;
    } 
    return p;
  }
}