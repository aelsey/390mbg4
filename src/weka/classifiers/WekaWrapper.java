
/*=== Run information ===

Scheme:weka.classifiers.meta.MultiBoostAB -C 3 -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump
Relation:     activity
Instances:    75
Attributes:   44
              xMean
              xDev
              xCrossRate
              xFFT1
              xFFT2
              xFFT3
              xFFT4
              xVelocityChange
              xDistance
              yMean
              yDev
              yCrossRate
              yFFT1
              yFFT2
              yFFT3
              yFFT4
              yVelocityChange
              yDistance
              zMean
              zDev
              zCrossRate
              zFFT1
              zFFT2
              zFFT3
              zFFT4
              zVelocityChange
              zDistance
              speedMean
              speedDev
              speedCrossRate
              speedFFT1
              speedFFT2
              speedFFT3
              energyMean
              energyDev
              energyCrossRate
              energyFFT1
              energyFFT2
              energyFFT3
              energyFFT4
              energyXYMean
              energyXYDev
              energyXYCrossRate
              class
Test mode:10-fold cross-validation

=== Classifier model (full training set) ===

MultiBoostAB: Base classifiers and their weights: 

Decision Stump

Classifications

zFFT1 <= 740.6222164891099 : jumping
zFFT1 > 740.6222164891099 : stationary
zFFT1 is missing : stationary

Class distributions

zFFT1 <= 740.6222164891099
jumping	stationary	walking	
0.9285714285714286	0.0	0.07142857142857142	
zFFT1 > 740.6222164891099
jumping	stationary	walking	
0.01639344262295082	0.9836065573770492	0.0	
zFFT1 is missing
jumping	stationary	walking	
0.18666666666666668	0.8	0.013333333333333334	


Weight: 3.6

Decision Stump

Classifications

energyXYMean <= 3.302098346042888 : stationary
energyXYMean > 3.302098346042888 : jumping
energyXYMean is missing : stationary

Class distributions

energyXYMean <= 3.302098346042888
jumping	stationary	walking	
0.0	0.6137566137566136	0.38624338624338644	
energyXYMean > 3.302098346042888
jumping	stationary	walking	
0.9611650485436893	0.03883495145631069	0.0	
energyXYMean is missing
jumping	stationary	walking	
0.3390410958904111	0.4109589041095889	0.2500000000000001	


Weight: 1.03

Decision Stump

Classifications

zVelocityChange <= 50676.01433170905 : stationary
zVelocityChange > 50676.01433170905 : walking
zVelocityChange is missing : walking

Class distributions

zVelocityChange <= 50676.01433170905
jumping	stationary	walking	
0.4377260981912146	0.5622739018087854	0.0	
zVelocityChange > 50676.01433170905
jumping	stationary	walking	
-4.9965105619660054E-17	-2.7168526180690153E-16	1.0000000000000004	
zVelocityChange is missing
jumping	stationary	walking	
0.23023255813953503	0.29574146783449107	0.474025974025974	


Weight: 1.21

Decision Stump

Classifications

energyXYDev <= 1.8695079374079557 : stationary
energyXYDev > 1.8695079374079557 : jumping
energyXYDev is missing : stationary

Class distributions

energyXYDev <= 1.8695079374079557
jumping	stationary	walking	
0.02250497306164342	0.9774950269383567	0.0	
energyXYDev > 1.8695079374079557
jumping	stationary	walking	
0.924612884375174	-1.3482606335587295E-15	0.07538711562482736	
energyXYDev is missing
jumping	stationary	walking	
0.15324468837173744	0.8358296896364459	0.010925621991816846	


Weight: 3.47

Decision Stump

Classifications

yDistance <= 519408.1334745105 : stationary
yDistance > 519408.1334745105 : jumping
yDistance is missing : stationary

Class distributions

yDistance <= 519408.1334745105
jumping	stationary	walking	
0.0	0.6960277119505477	0.3039722880494523	
yDistance > 519408.1334745105
jumping	stationary	walking	
0.9596899278278206	0.04031007217217942	0.0	
yDistance is missing
jumping	stationary	walking	
0.3880113295066584	0.430915131507774	0.1810735389855676	


Weight: 1.4

Decision Stump

Classifications

zDistance <= 50676.01433170905 : stationary
zDistance > 50676.01433170905 : walking
zDistance is missing : walking

Class distributions

zDistance <= 50676.01433170905
jumping	stationary	walking	
0.44655209025439524	0.5534479097456048	0.0	
zDistance > 50676.01433170905
jumping	stationary	walking	
-5.163306218488175E-17	-1.9039691680675146E-16	1.0000000000000002	
zDistance is missing
jumping	stationary	walking	
0.24171283258869108	0.29957414795369147	0.45871301945761755	


Weight: 1.14

Decision Stump

Classifications

energyDev <= 1.6630387249563745 : stationary
energyDev > 1.6630387249563745 : jumping
energyDev is missing : stationary

Class distributions

energyDev <= 1.6630387249563745
jumping	stationary	walking	
0.0012152986329634007	0.9987847013670366	0.0	
energyDev > 1.6630387249563745
jumping	stationary	walking	
0.8981908237044575	-5.33504472134873E-16	0.10180917629554306	
energyDev is missing
jumping	stationary	walking	
0.12565572759189916	0.860219943241858	0.014124329166242847	


Weight: 4.17

Decision Stump

Classifications

zVelocityChange <= 50676.01433170905 : stationary
zVelocityChange > 50676.01433170905 : walking
zVelocityChange is missing : walking

Class distributions

zVelocityChange <= 50676.01433170905
jumping	stationary	walking	
0.1829026824218404	0.8170973175781596	0.0	
zVelocityChange > 50676.01433170905
jumping	stationary	walking	
-1.2719969115540206E-17	-2.1782947110362602E-16	1.0000000000000002	
zVelocityChange is missing
jumping	stationary	walking	
0.09776085335147686	0.4367356999905054	0.4655034466580177	


Weight: 2.22

Decision Stump

Classifications

energyXYMean <= 3.302098346042888 : walking
energyXYMean > 3.302098346042888 : jumping
energyXYMean is missing : jumping

Class distributions

energyXYMean <= 3.302098346042888
jumping	stationary	walking	
0.0	0.47238728072753833	0.5276127192724617	
energyXYMean > 3.302098346042888
jumping	stationary	walking	
0.9783595975964381	0.021640402403561985	0.0	
energyXYMean is missing
jumping	stationary	walking	
0.5000000000000001	0.24202879115410425	0.25797120884589575	


Weight: 1.14

Decision Stump

Classifications

zFFT1 <= 740.6222164891099 : jumping
zFFT1 > 740.6222164891099 : stationary
zFFT1 is missing : stationary

Class distributions

zFFT1 <= 740.6222164891099
jumping	stationary	walking	
0.8571974601361766	0.0	0.14280253986382332	
zFFT1 > 740.6222164891099
jumping	stationary	walking	
0.017093735525426583	0.9829062644745734	0.0	
zFFT1 is missing
jumping	stationary	walking	
0.20871065676785344	0.7587179092143017	0.03257143401784486	


Weight: 3.04

Number of performed Iterations: 10


Time taken to build model: 0.1 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances          70               93.3333 %
Incorrectly Classified Instances         5                6.6667 %
Kappa statistic                          0.788 
Mean absolute error                      0.0444
Root mean squared error                  0.2105
Relative absolute error                 19.5733 %
Root relative squared error             63.7251 %
Total Number of Instances               75     

=== Detailed Accuracy By Class ===

               TP Rate   FP Rate   Precision   Recall  F-Measure   ROC Area  Class
                 0.857     0.033      0.857     0.857     0.857      0.943    jumping
                 0.967     0.2        0.951     0.967     0.959      0.906    stationary
                 0         0          0         0         0          0.074    walking
Weighted Avg.    0.933     0.166      0.921     0.933     0.927      0.901

=== Confusion Matrix ===

  a  b  c   <-- classified as
 12  2  0 |  a = jumping
  2 58  0 |  b = stationary
  0  1  0 |  c = walking

=== Source code ===

// Generated with Weka 3.6.11
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Thu Oct 16 07:30:28 EDT 2014*/

package weka.classifiers;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;

public class WekaWrapper
  extends Classifier {

  /**
   * Returns only the toString() method.
   *
   * @return a string describing the classifier
   */
  public String globalInfo() {
    return toString();
  }

  /**
   * Returns the capabilities of this classifier.
   *
   * @return the capabilities
   */
  public Capabilities getCapabilities() {
    weka.core.Capabilities result = new weka.core.Capabilities(this);

    result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enableDependency(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enableDependency(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enableDependency(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enableDependency(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);
    result.enableDependency(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);

    result.setMinimumNumberInstances(1);

    return result;
  }

  /**
   * only checks the data against its capabilities.
   *
   * @param i the training data
   */
  public void buildClassifier(Instances i) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(i);
  }

  /**
   * Classifies the given instance.
   *
   * @param i the instance to classify
   * @return the classification result
   */
  public double classifyInstance(Instance i) throws Exception {
    Object[] s = new Object[i.numAttributes()];
    
    for (int j = 0; j < s.length; j++) {
      if (!i.isMissing(j)) {
        if (i.attribute(j).isNominal())
          s[j] = new String(i.stringValue(j));
        else if (i.attribute(j).isNumeric())
          s[j] = new Double(i.value(j));
      }
    }
    
    // set class value to missing
    s[i.classIndex()] = null;
    
    return ActivityClassifier.classify(s);
  }

  /**
   * Returns the revision string.
   * 
   * @return        the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("1.0");
  }

  /**
   * Returns only the classnames and what classifier it is based on.
   *
   * @return a short description
   */
  public String toString() {
    return "Auto-generated classifier wrapper, based on weka.classifiers.meta.MultiBoostAB (generated with Weka 3.6.11).\n" + this.getClass().getName() + "/ActivityClassifier";
  }

  /**
   * Runs the classfier from commandline.
   *
   * @param args the commandline arguments
   */
  public static void main(String args[]) {
    runClassifier(new WekaWrapper(), args);
  }
}

class ActivityClassifier_0 {
  public static double classify(Object[] i) {
    /* zFFT1 */
    if (i[21] == null) { return 1; } else if (((Double)i[21]).doubleValue() <= 740.6222164891099) { return 0; } else { return 1; }
  }
}
class ActivityClassifier_1 {
  public static double classify(Object[] i) {
    /* energyXYMean */
    if (i[40] == null) { return 1; } else if (((Double)i[40]).doubleValue() <= 3.302098346042888) { return 1; } else { return 0; }
  }
}
class ActivityClassifier_2 {
  public static double classify(Object[] i) {
    /* zVelocityChange */
    if (i[25] == null) { return 2; } else if (((Double)i[25]).doubleValue() <= 50676.01433170905) { return 1; } else { return 2; }
  }
}
class ActivityClassifier_3 {
  public static double classify(Object[] i) {
    /* energyXYDev */
    if (i[41] == null) { return 1; } else if (((Double)i[41]).doubleValue() <= 1.8695079374079557) { return 1; } else { return 0; }
  }
}
class ActivityClassifier_4 {
  public static double classify(Object[] i) {
    /* yDistance */
    if (i[17] == null) { return 1; } else if (((Double)i[17]).doubleValue() <= 519408.1334745105) { return 1; } else { return 0; }
  }
}
class ActivityClassifier_5 {
  public static double classify(Object[] i) {
    /* zDistance */
    if (i[26] == null) { return 2; } else if (((Double)i[26]).doubleValue() <= 50676.01433170905) { return 1; } else { return 2; }
  }
}
class ActivityClassifier_6 {
  public static double classify(Object[] i) {
    /* energyDev */
    if (i[34] == null) { return 1; } else if (((Double)i[34]).doubleValue() <= 1.6630387249563745) { return 1; } else { return 0; }
  }
}
class ActivityClassifier_7 {
  public static double classify(Object[] i) {
    /* zVelocityChange */
    if (i[25] == null) { return 2; } else if (((Double)i[25]).doubleValue() <= 50676.01433170905) { return 1; } else { return 2; }
  }
}
class ActivityClassifier_8 {
  public static double classify(Object[] i) {
    /* energyXYMean */
    if (i[40] == null) { return 0; } else if (((Double)i[40]).doubleValue() <= 3.302098346042888) { return 2; } else { return 0; }
  }
}
class ActivityClassifier_9 {
  public static double classify(Object[] i) {
    /* zFFT1 */
    if (i[21] == null) { return 1; } else if (((Double)i[21]).doubleValue() <= 740.6222164891099) { return 0; } else { return 1; }
  }
}
