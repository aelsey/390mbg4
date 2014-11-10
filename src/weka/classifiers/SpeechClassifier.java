package weka.classifiers;

public class SpeechClassifier {

  public static double classify(Object [] i)
    throws Exception {

    double p = Double.NaN;
    p = SpeechClassifier.N59c356911(i);
    return p;
  }
  static double N59c356911(Object []i) {
    double p = Double.NaN;
    /* mfcc1 */
    if (i[0] == null) {
      p = 1;
    } else if (((Double)i[0]).doubleValue() < 69.69174121166023) {
    p = SpeechClassifier.N285a2dad12(i);
    } else if (true) {
    p = SpeechClassifier.N3c55379220(i);
    } 
    return p;
  }
  static double N285a2dad12(Object []i) {
    double p = Double.NaN;
    /* mfcc4 */
    if (i[3] == null) {
      p = 1;
    } else if (((Double)i[3]).doubleValue() < 4.335693772191078) {
    p = SpeechClassifier.N66e7a2ce13(i);
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N66e7a2ce13(Object []i) {
    double p = Double.NaN;
    /* mfcc4 */
    if (i[3] == null) {
      p = 1;
    } else if (((Double)i[3]).doubleValue() < 2.64874774163773) {
    p = SpeechClassifier.N28e14ab14(i);
    } else if (true) {
    p = SpeechClassifier.N665d4eee15(i);
    } 
    return p;
  }
  static double N28e14ab14(Object []i) {
    double p = Double.NaN;
    /* mfcc1 */
    if (i[0] == null) {
      p = 0;
    } else if (((Double)i[0]).doubleValue() < 59.172219624930605) {
      p = 1;
    } else if (true) {
      p = 0;
    } 
    return p;
  }
  static double N665d4eee15(Object []i) {
    double p = Double.NaN;
    /* mfcc11 */
    if (i[10] == null) {
      p = 1;
    } else if (((Double)i[10]).doubleValue() < 0.5620545198710691) {
    p = SpeechClassifier.N1f9330cd16(i);
    } else if (true) {
    p = SpeechClassifier.N3a466d4f19(i);
    } 
    return p;
  }
  static double N1f9330cd16(Object []i) {
    double p = Double.NaN;
    /* mfcc12 */
    if (i[11] == null) {
      p = 1;
    } else if (((Double)i[11]).doubleValue() < 1.7664941039295767) {
    p = SpeechClassifier.N4439002317(i);
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N4439002317(Object []i) {
    double p = Double.NaN;
    /* mfcc1 */
    if (i[0] == null) {
      p = 0;
    } else if (((Double)i[0]).doubleValue() < 65.17240316492055) {
      p = 0;
    } else if (true) {
    p = SpeechClassifier.N36e07f4318(i);
    } 
    return p;
  }
  static double N36e07f4318(Object []i) {
    double p = Double.NaN;
    /* mfcc2 */
    if (i[1] == null) {
      p = 1;
    } else if (((Double)i[1]).doubleValue() < 7.738075793406426) {
      p = 1;
    } else if (true) {
      p = 0;
    } 
    return p;
  }
  static double N3a466d4f19(Object []i) {
    double p = Double.NaN;
    /* mfcc1 */
    if (i[0] == null) {
      p = 1;
    } else if (((Double)i[0]).doubleValue() < 59.485707347825695) {
      p = 0;
    } else if (true) {
      p = 1;
    } 
    return p;
  }
  static double N3c55379220(Object []i) {
    double p = Double.NaN;
    /* mfcc1 */
    if (i[0] == null) {
      p = 0;
    } else if (((Double)i[0]).doubleValue() < 73.22509071539845) {
    p = SpeechClassifier.N3061002321(i);
    } else if (true) {
      p = 0;
    } 
    return p;
  }
  static double N3061002321(Object []i) {
    double p = Double.NaN;
    /* mfcc8 */
    if (i[7] == null) {
      p = 0;
    } else if (((Double)i[7]).doubleValue() < -1.3329237709875306) {
      p = 0;
    } else if (true) {
      p = 1;
    } 
    return p;
  }
}