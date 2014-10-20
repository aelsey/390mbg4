/*=== Run information ===

Scheme:weka.classifiers.trees.REPTree -M 2 -V 0.001 -N 3 -S 1 -L -1
Relation:     activity
Instances:    102
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


REPTree
============

zDev < 1.17
|   xDev < 0.33 : stationary (24/0) [13/0]
|   xDev >= 0.33 : driving (17/0) [8/0]
zDev >= 1.17
|   xFFT3 < 132.75 : walking (20/0) [9/0]
|   xFFT3 >= 132.75 : running (7/0) [4/0]

Size of the tree : 7

Time taken to build model: 0.01 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances          98               96.0784 %
Incorrectly Classified Instances         4                3.9216 %
Kappa statistic                          0.9451
Mean absolute error                      0.0269
Root mean squared error                  0.1377
Relative absolute error                  7.4978 %
Root relative squared error             32.51   %
Total Number of Instances              102     

=== Detailed Accuracy By Class ===

               TP Rate   FP Rate   Precision   Recall  F-Measure   ROC Area  Class
                 0.909     0.011      0.909     0.909     0.909      0.944    running
                 0.92      0          1         0.92      0.958      0.974    driving
                 1         0.015      0.974     1         0.987      0.988    stationary
                 0.966     0.027      0.933     0.966     0.949      0.972    walking
Weighted Avg.    0.961     0.015      0.962     0.961     0.961      0.975

=== Confusion Matrix ===

  a  b  c  d   <-- classified as
 10  0  0  1 |  a = running
  0 23  1  1 |  b = driving
  0  0 37  0 |  c = stationary
  1  0  0 28 |  d = walking

=== Source code ===

// Generated with Weka 3.6.11
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Mon Oct 20 09:34:15 EDT 2014
*/
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
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_CLASS);
    result.enable(weka.core.Capabilities.Capability.DATE_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);

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
    return "Auto-generated classifier wrapper, based on weka.classifiers.trees.REPTree (generated with Weka 3.6.11).\n" + this.getClass().getName() + "/ActivityClassifier";
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