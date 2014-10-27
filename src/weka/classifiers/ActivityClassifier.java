package weka.classifiers;

public class ActivityClassifier {

  public static double classify(Object [] i)
    throws Exception {

    double p = Double.NaN;
    p = ActivityClassifier.N42ae944620(i);
    return p;
  }
  static double N42ae944620(Object []i) {
    double p = Double.NaN;
    /* xDev */
    if (i[1] == null) {
      p = 1;
    } else if (((Double)i[1]).doubleValue() < 0.62143891847006) {
      p = 1;
    } else if (true) {
    p = ActivityClassifier.N6a66f4d321(i);
    } 
    return p;
  }
  static double N6a66f4d321(Object []i) {
    double p = Double.NaN;
    /* xDev */
    if (i[1] == null) {
      p = 2;
    } else if (((Double)i[1]).doubleValue() < 1.809180033492746) {
      p = 2;
    } else if (true) {
      p = 0;
    } 
    return p;
  }
}