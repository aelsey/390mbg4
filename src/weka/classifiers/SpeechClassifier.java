package weka.classifiers;

public class SpeechClassifier 
{
	  public static double classify(Object[] i)
	    throws Exception {
	    	
	    double p = Double.NaN;
	    p = SpeechDetector.N6df6e48a0(i);
	    return p;
	  }
	  static double N6df6e48a0(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 78.35207681529955) {
	    p = SpeechDetector.N6c16586c1(i);
	    } else if (((Double) i[0]).doubleValue() > 78.35207681529955) {
	    p = SpeechDetector.N290f50de426(i);
	    } 
	    return p;
	  }
	  static double N6c16586c1(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 47.418442508143585) {
	    p = SpeechDetector.N2f0751e42(i);
	    } else if (((Double) i[0]).doubleValue() > 47.418442508143585) {
	    p = SpeechDetector.N4991a0c13(i);
	    } 
	    return p;
	  }
	  static double N2f0751e42(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.329480374757958) {
	    p = SpeechDetector.N99167db3(i);
	    } else if (((Double) i[1]).doubleValue() > 5.329480374757958) {
	    p = SpeechDetector.N6405560110(i);
	    } 
	    return p;
	  }
	  static double N99167db3(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.313199350756233) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.313199350756233) {
	    p = SpeechDetector.N29395fc54(i);
	    } 
	    return p;
	  }
	  static double N29395fc54(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.215854778858806) {
	    p = SpeechDetector.N75be93a75(i);
	    } else if (((Double) i[3]).doubleValue() > 2.215854778858806) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N75be93a75(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.43893445865277836) {
	    p = SpeechDetector.N32cff5556(i);
	    } else if (((Double) i[11]).doubleValue() > 0.43893445865277836) {
	    p = SpeechDetector.N5f1840c38(i);
	    } 
	    return p;
	  }
	  static double N32cff5556(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.1560589723216241) {
	    p = SpeechDetector.N72f3b9827(i);
	    } else if (((Double) i[4]).doubleValue() > 1.1560589723216241) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N72f3b9827(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 0.12399451947194566) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 0.12399451947194566) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5f1840c38(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.130503657068581) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -3.130503657068581) {
	    p = SpeechDetector.N3143f2fb9(i);
	    } 
	    return p;
	  }
	  static double N3143f2fb9(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.576499256769231) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 3.576499256769231) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6405560110(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.2097500222293687) {
	    p = SpeechDetector.N1a518ef411(i);
	    } else if (((Double) i[3]).doubleValue() > 2.2097500222293687) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1a518ef411(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.2297735798375165) {
	    p = SpeechDetector.N608042ab12(i);
	    } else if (((Double) i[2]).doubleValue() > 5.2297735798375165) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N608042ab12(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.7904170269065283) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -3.7904170269065283) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4991a0c13(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 4.474763842153856) {
	    p = SpeechDetector.N5f7d0c2f14(i);
	    } else if (((Double) i[3]).doubleValue() > 4.474763842153856) {
	    p = SpeechDetector.N6b52bdbf339(i);
	    } 
	    return p;
	  }
	  static double N5f7d0c2f14(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -0.8233752571956168) {
	    p = SpeechDetector.Naab12a315(i);
	    } else if (((Double) i[1]).doubleValue() > -0.8233752571956168) {
	    p = SpeechDetector.Ne9714ab51(i);
	    } 
	    return p;
	  }
	  static double Naab12a315(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -4.92007462070183) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -4.92007462070183) {
	    p = SpeechDetector.N655490cd16(i);
	    } 
	    return p;
	  }
	  static double N655490cd16(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 1.6055044745148186) {
	    p = SpeechDetector.N12eeb6b417(i);
	    } else if (((Double) i[6]).doubleValue() > 1.6055044745148186) {
	    p = SpeechDetector.N34f16cf39(i);
	    } 
	    return p;
	  }
	  static double N12eeb6b417(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.868869607876039) {
	    p = SpeechDetector.N761ced2118(i);
	    } else if (((Double) i[7]).doubleValue() > 1.868869607876039) {
	    p = SpeechDetector.N3df55c9c31(i);
	    } 
	    return p;
	  }
	  static double N761ced2118(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 7.246222904108994) {
	    p = SpeechDetector.N65144e1b19(i);
	    } else if (((Double) i[2]).doubleValue() > 7.246222904108994) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N65144e1b19(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 73.4907906169487) {
	    p = SpeechDetector.N1814027520(i);
	    } else if (((Double) i[0]).doubleValue() > 73.4907906169487) {
	    p = SpeechDetector.N51a0d68d28(i);
	    } 
	    return p;
	  }
	  static double N1814027520(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 1.9072599723581207) {
	    p = SpeechDetector.N49ad5bac21(i);
	    } else if (((Double) i[8]).doubleValue() > 1.9072599723581207) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N49ad5bac21(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 59.290789781065) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 59.290789781065) {
	    p = SpeechDetector.N145d9efe22(i);
	    } 
	    return p;
	  }
	  static double N145d9efe22(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -2.2300994221373367) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -2.2300994221373367) {
	    p = SpeechDetector.Ne71402423(i);
	    } 
	    return p;
	  }
	  static double Ne71402423(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.8453272071927747) {
	    p = SpeechDetector.N2d2a02e424(i);
	    } else if (((Double) i[2]).doubleValue() > 0.8453272071927747) {
	    p = SpeechDetector.N39bd380926(i);
	    } 
	    return p;
	  }
	  static double N2d2a02e424(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -1.1441534897114924) {
	    p = SpeechDetector.N2123dde625(i);
	    } else if (((Double) i[1]).doubleValue() > -1.1441534897114924) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2123dde625(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 60.868509438554156) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 60.868509438554156) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N39bd380926(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 70.44069765752633) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 70.44069765752633) {
	    p = SpeechDetector.N35a9f47c27(i);
	    } 
	    return p;
	  }
	  static double N35a9f47c27(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.704470610387127) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 4.704470610387127) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N51a0d68d28(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.3949759781186771) {
	    p = SpeechDetector.N1665ecd929(i);
	    } else if (((Double) i[5]).doubleValue() > -0.3949759781186771) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1665ecd929(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -4.132234217178788) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -4.132234217178788) {
	    p = SpeechDetector.N7da0a60b30(i);
	    } 
	    return p;
	  }
	  static double N7da0a60b30(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -1.7284581983047254) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > -1.7284581983047254) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3df55c9c31(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.687016568329994) {
	    p = SpeechDetector.N3793258b32(i);
	    } else if (((Double) i[0]).doubleValue() > 61.687016568329994) {
	    p = SpeechDetector.N194f526735(i);
	    } 
	    return p;
	  }
	  static double N3793258b32(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 3.7891786749281655) {
	    p = SpeechDetector.N1d85e52e33(i);
	    } else if (((Double) i[7]).doubleValue() > 3.7891786749281655) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1d85e52e33(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.893645329638074) {
	    p = SpeechDetector.N41893e2634(i);
	    } else if (((Double) i[9]).doubleValue() > 2.893645329638074) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N41893e2634(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -1.918320496368491) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -1.918320496368491) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N194f526735(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.8971092254537786) {
	    p = SpeechDetector.N26aaf52c36(i);
	    } else if (((Double) i[2]).doubleValue() > -0.8971092254537786) {
	    p = SpeechDetector.N5a5adcb138(i);
	    } 
	    return p;
	  }
	  static double N26aaf52c36(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 1.149336411417622) {
	    p = SpeechDetector.N21c62f8937(i);
	    } else if (((Double) i[9]).doubleValue() > 1.149336411417622) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N21c62f8937(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -5.9499756351121675) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -5.9499756351121675) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5a5adcb138(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7.103664912667898) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 7.103664912667898) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N34f16cf39(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.2422049218796982) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -1.2422049218796982) {
	    p = SpeechDetector.N3d6271bb40(i);
	    } 
	    return p;
	  }
	  static double N3d6271bb40(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.1106430137314018) {
	    p = SpeechDetector.Na18cb7941(i);
	    } else if (((Double) i[11]).doubleValue() > 1.1106430137314018) {
	    p = SpeechDetector.N13d8dce949(i);
	    } 
	    return p;
	  }
	  static double Na18cb7941(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -0.737450458824869) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -0.737450458824869) {
	    p = SpeechDetector.N61d67a1c42(i);
	    } 
	    return p;
	  }
	  static double N61d67a1c42(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.614886849635871) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 2.614886849635871) {
	    p = SpeechDetector.N47eaf67243(i);
	    } 
	    return p;
	  }
	  static double N47eaf67243(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 4.739637674766209) {
	    p = SpeechDetector.N12d9db4144(i);
	    } else if (((Double) i[6]).doubleValue() > 4.739637674766209) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N12d9db4144(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.1191435463988952) {
	    p = SpeechDetector.N1cc9921245(i);
	    } else if (((Double) i[2]).doubleValue() > 1.1191435463988952) {
	    p = SpeechDetector.N3aff77647(i);
	    } 
	    return p;
	  }
	  static double N1cc9921245(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.34241360492267) {
	    p = SpeechDetector.N7594ea8146(i);
	    } else if (((Double) i[0]).doubleValue() > 62.34241360492267) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7594ea8146(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= -1.1084872217325588) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > -1.1084872217325588) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3aff77647(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.804564233298531) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 0.804564233298531) {
	    p = SpeechDetector.N159f65de48(i);
	    } 
	    return p;
	  }
	  static double N159f65de48(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 2.3854428667725305) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 2.3854428667725305) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N13d8dce949(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.00700010270603) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 64.00700010270603) {
	    p = SpeechDetector.N28f4f2d50(i);
	    } 
	    return p;
	  }
	  static double N28f4f2d50(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.28833058452961896) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -0.28833058452961896) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne9714ab51(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 4.981717408605396) {
	    p = SpeechDetector.N60cdee0852(i);
	    } else if (((Double) i[4]).doubleValue() > 4.981717408605396) {
	    p = SpeechDetector.N6b4c00d3302(i);
	    } 
	    return p;
	  }
	  static double N60cdee0852(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -4.675787294832549) {
	    p = SpeechDetector.N6fc680de53(i);
	    } else if (((Double) i[4]).doubleValue() > -4.675787294832549) {
	    p = SpeechDetector.N5d1a16a387(i);
	    } 
	    return p;
	  }
	  static double N6fc680de53(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.7521278696122558) {
	    p = SpeechDetector.N5136a82654(i);
	    } else if (((Double) i[5]).doubleValue() > -2.7521278696122558) {
	    p = SpeechDetector.N5700f18267(i);
	    } 
	    return p;
	  }
	  static double N5136a82654(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -7.48997393011161) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -7.48997393011161) {
	    p = SpeechDetector.N5b59807155(i);
	    } 
	    return p;
	  }
	  static double N5b59807155(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.1133236778859061) {
	    p = SpeechDetector.N50ffa99156(i);
	    } else if (((Double) i[7]).doubleValue() > -1.1133236778859061) {
	    p = SpeechDetector.N6f7016f58(i);
	    } 
	    return p;
	  }
	  static double N50ffa99156(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -3.3739648567419076) {
	    p = SpeechDetector.N40d5982257(i);
	    } else if (((Double) i[8]).doubleValue() > -3.3739648567419076) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N40d5982257(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -5.31808589464079) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -5.31808589464079) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f7016f58(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.3171459205111522) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -0.3171459205111522) {
	    p = SpeechDetector.N427f21fb59(i);
	    } 
	    return p;
	  }
	  static double N427f21fb59(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 2.1407152658252566) {
	    p = SpeechDetector.N289007d860(i);
	    } else if (((Double) i[2]).doubleValue() > 2.1407152658252566) {
	    p = SpeechDetector.N654436cd62(i);
	    } 
	    return p;
	  }
	  static double N289007d860(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.73329998519785) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 64.73329998519785) {
	    p = SpeechDetector.N7f30ab661(i);
	    } 
	    return p;
	  }
	  static double N7f30ab661(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 76.74474431136585) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 76.74474431136585) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N654436cd62(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -6.819322606647316) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -6.819322606647316) {
	    p = SpeechDetector.N616a00ab63(i);
	    } 
	    return p;
	  }
	  static double N616a00ab63(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -0.1664317089288672) {
	    p = SpeechDetector.N76520c8364(i);
	    } else if (((Double) i[9]).doubleValue() > -0.1664317089288672) {
	    p = SpeechDetector.N2f25be8c66(i);
	    } 
	    return p;
	  }
	  static double N76520c8364(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.0684899475978438) {
	    p = SpeechDetector.N4b3a92565(i);
	    } else if (((Double) i[7]).doubleValue() > 2.0684899475978438) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4b3a92565(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.212825576093366) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.212825576093366) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2f25be8c66(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 1.3773007818524432) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 1.3773007818524432) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5700f18267(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 7.493157667519271) {
	    p = SpeechDetector.N7eefba6d68(i);
	    } else if (((Double) i[2]).doubleValue() > 7.493157667519271) {
	    p = SpeechDetector.N410581b785(i);
	    } 
	    return p;
	  }
	  static double N7eefba6d68(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.577402239610638) {
	    p = SpeechDetector.N2cb88b3669(i);
	    } else if (((Double) i[1]).doubleValue() > 6.577402239610638) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2cb88b3669(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -8.191766052056995) {
	    p = SpeechDetector.N7bb9d2a70(i);
	    } else if (((Double) i[4]).doubleValue() > -8.191766052056995) {
	    p = SpeechDetector.N3a7e3f2573(i);
	    } 
	    return p;
	  }
	  static double N7bb9d2a70(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 2.6960850290928104) {
	    p = SpeechDetector.N2e4b345d71(i);
	    } else if (((Double) i[11]).doubleValue() > 2.6960850290928104) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2e4b345d71(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.7391833590505965) {
	    p = SpeechDetector.N4b5add6972(i);
	    } else if (((Double) i[3]).doubleValue() > -1.7391833590505965) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4b5add6972(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -9.30739703384766) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -9.30739703384766) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3a7e3f2573(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 4.395844723445684) {
	    p = SpeechDetector.N3663b42374(i);
	    } else if (((Double) i[7]).doubleValue() > 4.395844723445684) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3663b42374(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -5.231580761177665) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -5.231580761177665) {
	    p = SpeechDetector.N4bc781ba75(i);
	    } 
	    return p;
	  }
	  static double N4bc781ba75(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 70.46100622778026) {
	    p = SpeechDetector.N1716013476(i);
	    } else if (((Double) i[0]).doubleValue() > 70.46100622778026) {
	    p = SpeechDetector.N27d456182(i);
	    } 
	    return p;
	  }
	  static double N1716013476(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.465523602506885) {
	    p = SpeechDetector.N25a908c377(i);
	    } else if (((Double) i[0]).doubleValue() > 62.465523602506885) {
	    p = SpeechDetector.N4813969d79(i);
	    } 
	    return p;
	  }
	  static double N25a908c377(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.268876534167063) {
	    p = SpeechDetector.N7c7e4d8578(i);
	    } else if (((Double) i[2]).doubleValue() > 3.268876534167063) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7c7e4d8578(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 53.22021808240659) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 53.22021808240659) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4813969d79(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -1.5936370096277561) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -1.5936370096277561) {
	    p = SpeechDetector.N7e05426280(i);
	    } 
	    return p;
	  }
	  static double N7e05426280(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -5.605762463552262) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -5.605762463552262) {
	    p = SpeechDetector.Nb49709181(i);
	    } 
	    return p;
	  }
	  static double Nb49709181(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 4.978184214253696) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 4.978184214253696) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N27d456182(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.3863405368790972) {
	    p = SpeechDetector.N6e55e48d83(i);
	    } else if (((Double) i[9]).doubleValue() > 0.3863405368790972) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6e55e48d83(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -2.9070433707402303) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -2.9070433707402303) {
	    p = SpeechDetector.N49101d9284(i);
	    } 
	    return p;
	  }
	  static double N49101d9284(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.6556557918929036) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 2.6556557918929036) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N410581b785(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -0.8689792423491697) {
	    p = SpeechDetector.N508736ba86(i);
	    } else if (((Double) i[8]).doubleValue() > -0.8689792423491697) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N508736ba86(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.224693930769699) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 3.224693930769699) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5d1a16a387(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 8.50549770789708) {
	    p = SpeechDetector.N5bc4571588(i);
	    } else if (((Double) i[1]).doubleValue() > 8.50549770789708) {
	    p = SpeechDetector.N88cfe5284(i);
	    } 
	    return p;
	  }
	  static double N5bc4571588(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -1.379329431779172) {
	    p = SpeechDetector.N373152c489(i);
	    } else if (((Double) i[2]).doubleValue() > -1.379329431779172) {
	    p = SpeechDetector.N39317bd2109(i);
	    } 
	    return p;
	  }
	  static double N373152c489(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.5751421897758355) {
	    p = SpeechDetector.N730de2b90(i);
	    } else if (((Double) i[5]).doubleValue() > -2.5751421897758355) {
	    p = SpeechDetector.N5a4e8a197(i);
	    } 
	    return p;
	  }
	  static double N730de2b90(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 1.3688691933151085) {
	    p = SpeechDetector.N1949dcbd91(i);
	    } else if (((Double) i[10]).doubleValue() > 1.3688691933151085) {
	    p = SpeechDetector.Nbb14fe195(i);
	    } 
	    return p;
	  }
	  static double N1949dcbd91(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.4865976594035488) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -0.4865976594035488) {
	    p = SpeechDetector.N403b094392(i);
	    } 
	    return p;
	  }
	  static double N403b094392(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.3759166397846132) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > -0.3759166397846132) {
	    p = SpeechDetector.N63dd2ea693(i);
	    } 
	    return p;
	  }
	  static double N63dd2ea693(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -2.0554600882125924) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -2.0554600882125924) {
	    p = SpeechDetector.N4e21c78294(i);
	    } 
	    return p;
	  }
	  static double N4e21c78294(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 71.49369495431591) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 71.49369495431591) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nbb14fe195(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 0.633080043786954) {
	    p = SpeechDetector.N25f342c696(i);
	    } else if (((Double) i[6]).doubleValue() > 0.633080043786954) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N25f342c696(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -3.7555333105828694) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -3.7555333105828694) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5a4e8a197(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.7528205599702225) {
	    p = SpeechDetector.Nda4a4ec98(i);
	    } else if (((Double) i[6]).doubleValue() > 2.7528205599702225) {
	    p = SpeechDetector.N29a7082d107(i);
	    } 
	    return p;
	  }
	  static double Nda4a4ec98(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.6008110846585689) {
	    p = SpeechDetector.N344788f399(i);
	    } else if (((Double) i[11]).doubleValue() > 0.6008110846585689) {
	    p = SpeechDetector.N67f1380b103(i);
	    } 
	    return p;
	  }
	  static double N344788f399(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.1260804935954136) {
	    p = SpeechDetector.N44702455100(i);
	    } else if (((Double) i[7]).doubleValue() > 1.1260804935954136) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N44702455100(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.7846581607575357) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.7846581607575357) {
	    p = SpeechDetector.N1e616b8d101(i);
	    } 
	    return p;
	  }
	  static double N1e616b8d101(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 0.12579458744739558) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 0.12579458744739558) {
	    p = SpeechDetector.Nddc0590102(i);
	    } 
	    return p;
	  }
	  static double Nddc0590102(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -4.719864790022636) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > -4.719864790022636) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N67f1380b103(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -2.2481512273517223) {
	    p = SpeechDetector.Nd968f7d104(i);
	    } else if (((Double) i[2]).doubleValue() > -2.2481512273517223) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd968f7d104(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.7464021055550399) {
	    p = SpeechDetector.N17a65e83105(i);
	    } else if (((Double) i[10]).doubleValue() > -0.7464021055550399) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N17a65e83105(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.05791949593423229) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 0.05791949593423229) {
	    p = SpeechDetector.N2b86f696106(i);
	    } 
	    return p;
	  }
	  static double N2b86f696106(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.7380778646741772) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 2.7380778646741772) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N29a7082d107(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.1570230135103239) {
	    p = SpeechDetector.N1509d7b8108(i);
	    } else if (((Double) i[4]).doubleValue() > -1.1570230135103239) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1509d7b8108(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.635178653861374) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 0.635178653861374) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N39317bd2109(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -4.0741761111692245) {
	    p = SpeechDetector.N5fb83553110(i);
	    } else if (((Double) i[5]).doubleValue() > -4.0741761111692245) {
	    p = SpeechDetector.N70e4a539139(i);
	    } 
	    return p;
	  }
	  static double N5fb83553110(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -7.977353213916028) {
	    p = SpeechDetector.N36b50d3d111(i);
	    } else if (((Double) i[5]).doubleValue() > -7.977353213916028) {
	    p = SpeechDetector.N3d8b7339115(i);
	    } 
	    return p;
	  }
	  static double N36b50d3d111(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 66.89930832571132) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 66.89930832571132) {
	    p = SpeechDetector.N28783bda112(i);
	    } 
	    return p;
	  }
	  static double N28783bda112(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -1.9482442130306121) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -1.9482442130306121) {
	    p = SpeechDetector.N6da179f7113(i);
	    } 
	    return p;
	  }
	  static double N6da179f7113(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -1.770020992371092) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -1.770020992371092) {
	    p = SpeechDetector.N44e7f5c114(i);
	    } 
	    return p;
	  }
	  static double N44e7f5c114(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 3.990045194616129) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 3.990045194616129) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3d8b7339115(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 58.34416014893247) {
	    p = SpeechDetector.Ne39c2c0116(i);
	    } else if (((Double) i[0]).doubleValue() > 58.34416014893247) {
	    p = SpeechDetector.N42e13ec6120(i);
	    } 
	    return p;
	  }
	  static double Ne39c2c0116(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.6151935086980035) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -0.6151935086980035) {
	    p = SpeechDetector.N7220d28b117(i);
	    } 
	    return p;
	  }
	  static double N7220d28b117(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -5.529129200157704) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -5.529129200157704) {
	    p = SpeechDetector.N48dede36118(i);
	    } 
	    return p;
	  }
	  static double N48dede36118(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 0.5351010971424714) {
	    p = SpeechDetector.N1fced09a119(i);
	    } else if (((Double) i[8]).doubleValue() > 0.5351010971424714) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1fced09a119(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.61866155752682) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 1.61866155752682) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N42e13ec6120(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7.317986372475848) {
	    p = SpeechDetector.N51e05b77121(i);
	    } else if (((Double) i[2]).doubleValue() > 7.317986372475848) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N51e05b77121(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.20458089077023) {
	    p = SpeechDetector.N60950b9f122(i);
	    } else if (((Double) i[11]).doubleValue() > -2.20458089077023) {
	    p = SpeechDetector.N1f3640d4128(i);
	    } 
	    return p;
	  }
	  static double N60950b9f122(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.2621082001254362) {
	    p = SpeechDetector.N592e2542123(i);
	    } else if (((Double) i[6]).doubleValue() > 2.2621082001254362) {
	    p = SpeechDetector.N3fe24170127(i);
	    } 
	    return p;
	  }
	  static double N592e2542123(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 3.243748821280207) {
	    p = SpeechDetector.N64903dcb124(i);
	    } else if (((Double) i[7]).doubleValue() > 3.243748821280207) {
	    p = SpeechDetector.N39c90e01125(i);
	    } 
	    return p;
	  }
	  static double N64903dcb124(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.5013355913834807) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 0.5013355913834807) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N39c90e01125(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -3.9433266653650114) {
	    p = SpeechDetector.N3eb6814a126(i);
	    } else if (((Double) i[11]).doubleValue() > -3.9433266653650114) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3eb6814a126(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -1.7417140683165246) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -1.7417140683165246) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3fe24170127(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 3.5649826289333495) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > 3.5649826289333495) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1f3640d4128(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 2.254036054929856) {
	    p = SpeechDetector.N22da2e4e129(i);
	    } else if (((Double) i[8]).doubleValue() > 2.254036054929856) {
	    p = SpeechDetector.N6d513e98138(i);
	    } 
	    return p;
	  }
	  static double N22da2e4e129(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -4.71039432108894) {
	    p = SpeechDetector.N221614c2130(i);
	    } else if (((Double) i[10]).doubleValue() > -4.71039432108894) {
	    p = SpeechDetector.N57acde09131(i);
	    } 
	    return p;
	  }
	  static double N221614c2130(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.16842060638452544) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 0.16842060638452544) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N57acde09131(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -2.1186569540226348) {
	    p = SpeechDetector.N16254dd7132(i);
	    } else if (((Double) i[7]).doubleValue() > -2.1186569540226348) {
	    p = SpeechDetector.N2af01366136(i);
	    } 
	    return p;
	  }
	  static double N16254dd7132(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.4676772417588958) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -0.4676772417588958) {
	    p = SpeechDetector.N6b19699c133(i);
	    } 
	    return p;
	  }
	  static double N6b19699c133(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -3.456508851546646) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -3.456508851546646) {
	    p = SpeechDetector.N5164b7b2134(i);
	    } 
	    return p;
	  }
	  static double N5164b7b2134(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -1.7789727144966023) {
	    p = SpeechDetector.N2b5830dd135(i);
	    } else if (((Double) i[10]).doubleValue() > -1.7789727144966023) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b5830dd135(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -2.5532095844852325) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -2.5532095844852325) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2af01366136(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 7.413381935834056) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 7.413381935834056) {
	    p = SpeechDetector.N7789a38f137(i);
	    } 
	    return p;
	  }
	  static double N7789a38f137(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -0.15335070763140166) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > -0.15335070763140166) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6d513e98138(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 64.79208238180168) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 64.79208238180168) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N70e4a539139(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 69.68628343385677) {
	    p = SpeechDetector.N331b7b16140(i);
	    } else if (((Double) i[0]).doubleValue() > 69.68628343385677) {
	    p = SpeechDetector.N738c2576231(i);
	    } 
	    return p;
	  }
	  static double N331b7b16140(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 3.622433903228744) {
	    p = SpeechDetector.N512dfb90141(i);
	    } else if (((Double) i[6]).doubleValue() > 3.622433903228744) {
	    p = SpeechDetector.N676f3f55214(i);
	    } 
	    return p;
	  }
	  static double N512dfb90141(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.545687563028618) {
	    p = SpeechDetector.N21ded493142(i);
	    } else if (((Double) i[3]).doubleValue() > 2.545687563028618) {
	    p = SpeechDetector.N911a011166(i);
	    } 
	    return p;
	  }
	  static double N21ded493142(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -1.8831137371943865) {
	    p = SpeechDetector.N2c561044143(i);
	    } else if (((Double) i[7]).doubleValue() > -1.8831137371943865) {
	    p = SpeechDetector.N110d66fa150(i);
	    } 
	    return p;
	  }
	  static double N2c561044143(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -1.534558005851755) {
	    p = SpeechDetector.N4645f719144(i);
	    } else if (((Double) i[5]).doubleValue() > -1.534558005851755) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4645f719144(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.6000665511277791) {
	    p = SpeechDetector.N1b61ae5a145(i);
	    } else if (((Double) i[11]).doubleValue() > -0.6000665511277791) {
	    p = SpeechDetector.N4863d07f149(i);
	    } 
	    return p;
	  }
	  static double N1b61ae5a145(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -4.261986776614731) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > -4.261986776614731) {
	    p = SpeechDetector.N29fda4c1146(i);
	    } 
	    return p;
	  }
	  static double N29fda4c1146(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.0771285671579298) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.0771285671579298) {
	    p = SpeechDetector.N4b4b9070147(i);
	    } 
	    return p;
	  }
	  static double N4b4b9070147(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.913037994707845) {
	    p = SpeechDetector.N4df7cfae148(i);
	    } else if (((Double) i[9]).doubleValue() > 2.913037994707845) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4df7cfae148(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.9044172963359352) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 1.9044172963359352) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4863d07f149(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -3.6971319616443843) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -3.6971319616443843) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N110d66fa150(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.8832550568261892) {
	    p = SpeechDetector.N6e3afd5151(i);
	    } else if (((Double) i[11]).doubleValue() > -0.8832550568261892) {
	    p = SpeechDetector.N3f8f6434163(i);
	    } 
	    return p;
	  }
	  static double N6e3afd5151(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.37630633648725215) {
	    p = SpeechDetector.N4e2ccc7b152(i);
	    } else if (((Double) i[2]).doubleValue() > 0.37630633648725215) {
	    p = SpeechDetector.N334d405b159(i);
	    } 
	    return p;
	  }
	  static double N4e2ccc7b152(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 2.009065776680362) {
	    p = SpeechDetector.N5f24c755153(i);
	    } else if (((Double) i[4]).doubleValue() > 2.009065776680362) {
	    p = SpeechDetector.N1c12f9d156(i);
	    } 
	    return p;
	  }
	  static double N5f24c755153(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -2.879698827051088) {
	    p = SpeechDetector.N679ace3f154(i);
	    } else if (((Double) i[11]).doubleValue() > -2.879698827051088) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N679ace3f154(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.1792562763032173) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -2.1792562763032173) {
	    p = SpeechDetector.N645abf3c155(i);
	    } 
	    return p;
	  }
	  static double N645abf3c155(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.2051077739397313) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 1.2051077739397313) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1c12f9d156(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.5648665316416395) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.5648665316416395) {
	    p = SpeechDetector.N321ced51157(i);
	    } 
	    return p;
	  }
	  static double N321ced51157(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.318327458990464) {
	    p = SpeechDetector.N9207a8b158(i);
	    } else if (((Double) i[3]).doubleValue() > 1.318327458990464) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N9207a8b158(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.9869520067264241) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > -0.9869520067264241) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N334d405b159(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 4.4088504124406604) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 4.4088504124406604) {
	    p = SpeechDetector.N14bc30ad160(i);
	    } 
	    return p;
	  }
	  static double N14bc30ad160(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 3.5069617531586137) {
	    p = SpeechDetector.N4f1fb87d161(i);
	    } else if (((Double) i[8]).doubleValue() > 3.5069617531586137) {
	    p = SpeechDetector.N2b893f20162(i);
	    } 
	    return p;
	  }
	  static double N4f1fb87d161(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.599328260641302) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -2.599328260641302) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b893f20162(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.809366065940845) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.809366065940845) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f8f6434163(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.570124648470688) {
	    p = SpeechDetector.N5efbb285164(i);
	    } else if (((Double) i[1]).doubleValue() > 2.570124648470688) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5efbb285164(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 53.80550430654203) {
	    p = SpeechDetector.N5e856a7a165(i);
	    } else if (((Double) i[0]).doubleValue() > 53.80550430654203) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5e856a7a165(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 2.015029985336829) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 2.015029985336829) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N911a011166(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 53.611260619460275) {
	    p = SpeechDetector.N6423c0bd167(i);
	    } else if (((Double) i[0]).doubleValue() > 53.611260619460275) {
	    p = SpeechDetector.N13500587178(i);
	    } 
	    return p;
	  }
	  static double N6423c0bd167(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.446925975777734) {
	    p = SpeechDetector.N6742eba7168(i);
	    } else if (((Double) i[3]).doubleValue() > 3.446925975777734) {
	    p = SpeechDetector.N484c15cd175(i);
	    } 
	    return p;
	  }
	  static double N6742eba7168(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 49.83606621875279) {
	    p = SpeechDetector.N5a7d55e7169(i);
	    } else if (((Double) i[0]).doubleValue() > 49.83606621875279) {
	    p = SpeechDetector.N3675de9f172(i);
	    } 
	    return p;
	  }
	  static double N5a7d55e7169(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 0.3564953549407167) {
	    p = SpeechDetector.N5a92df1a170(i);
	    } else if (((Double) i[10]).doubleValue() > 0.3564953549407167) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5a92df1a170(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.106998385197106) {
	    p = SpeechDetector.N6075526a171(i);
	    } else if (((Double) i[3]).doubleValue() > 3.106998385197106) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6075526a171(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.1141740820092636) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.1141740820092636) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3675de9f172(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 0.9671635881720441) {
	    p = SpeechDetector.N746ab4a7173(i);
	    } else if (((Double) i[11]).doubleValue() > 0.9671635881720441) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N746ab4a7173(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.088058309619362) {
	    p = SpeechDetector.N97a7ba7174(i);
	    } else if (((Double) i[2]).doubleValue() > 5.088058309619362) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N97a7ba7174(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.9956418780352476) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.9956418780352476) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N484c15cd175(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.6519941321084818) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 0.6519941321084818) {
	    p = SpeechDetector.N7b2b6acf176(i);
	    } 
	    return p;
	  }
	  static double N7b2b6acf176(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 3.431484096709457) {
	    p = SpeechDetector.N5f717b35177(i);
	    } else if (((Double) i[4]).doubleValue() > 3.431484096709457) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5f717b35177(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.9657236856202887) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 3.9657236856202887) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N13500587178(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -1.2747371827235163) {
	    p = SpeechDetector.N6a9aebf8179(i);
	    } else if (((Double) i[7]).doubleValue() > -1.2747371827235163) {
	    p = SpeechDetector.N58b762d5194(i);
	    } 
	    return p;
	  }
	  static double N6a9aebf8179(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.5042937181162537) {
	    p = SpeechDetector.N60fa1d75180(i);
	    } else if (((Double) i[11]).doubleValue() > -0.5042937181162537) {
	    p = SpeechDetector.N30497b4c190(i);
	    } 
	    return p;
	  }
	  static double N60fa1d75180(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -5.220777304374537) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -5.220777304374537) {
	    p = SpeechDetector.N44a41e10181(i);
	    } 
	    return p;
	  }
	  static double N44a41e10181(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -3.728571904797902) {
	    p = SpeechDetector.N72b1cfa4182(i);
	    } else if (((Double) i[7]).doubleValue() > -3.728571904797902) {
	    p = SpeechDetector.N249dd170184(i);
	    } 
	    return p;
	  }
	  static double N72b1cfa4182(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 3.6265863043295856) {
	    p = SpeechDetector.N77b752cf183(i);
	    } else if (((Double) i[2]).doubleValue() > 3.6265863043295856) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N77b752cf183(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.18213172265622) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 62.18213172265622) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N249dd170184(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.759453802946116) {
	    p = SpeechDetector.N752122d7185(i);
	    } else if (((Double) i[3]).doubleValue() > 2.759453802946116) {
	    p = SpeechDetector.N52768d54186(i);
	    } 
	    return p;
	  }
	  static double N752122d7185(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 0.11994083581798647) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > 0.11994083581798647) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52768d54186(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -3.458774787636654) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -3.458774787636654) {
	    p = SpeechDetector.N6538b017187(i);
	    } 
	    return p;
	  }
	  static double N6538b017187(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 2.527862878153469) {
	    p = SpeechDetector.N6cb0e9eb188(i);
	    } else if (((Double) i[10]).doubleValue() > 2.527862878153469) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6cb0e9eb188(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.619204928612936) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 6.619204928612936) {
	    p = SpeechDetector.N52cd7b0c189(i);
	    } 
	    return p;
	  }
	  static double N52cd7b0c189(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.4368333514386724) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.4368333514386724) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N30497b4c190(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 1.305273583929706) {
	    p = SpeechDetector.N283dd358191(i);
	    } else if (((Double) i[1]).doubleValue() > 1.305273583929706) {
	    p = SpeechDetector.N72fe4b0b192(i);
	    } 
	    return p;
	  }
	  static double N283dd358191(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 2.482337506972944) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > 2.482337506972944) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N72fe4b0b192(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 3.0291760528803118) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 3.0291760528803118) {
	    p = SpeechDetector.N14f0fa28193(i);
	    } 
	    return p;
	  }
	  static double N14f0fa28193(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 62.6007824867037) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 62.6007824867037) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N58b762d5194(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.828316146289049) {
	    p = SpeechDetector.N6fb9bb73195(i);
	    } else if (((Double) i[2]).doubleValue() > 4.828316146289049) {
	    p = SpeechDetector.N3c5ea542208(i);
	    } 
	    return p;
	  }
	  static double N6fb9bb73195(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 2.985365494667103) {
	    p = SpeechDetector.Nac1b453196(i);
	    } else if (((Double) i[4]).doubleValue() > 2.985365494667103) {
	    p = SpeechDetector.N331439e5204(i);
	    } 
	    return p;
	  }
	  static double Nac1b453196(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -2.890373673891559) {
	    p = SpeechDetector.N3325baa9197(i);
	    } else if (((Double) i[11]).doubleValue() > -2.890373673891559) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3325baa9197(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -0.7923647470960499) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -0.7923647470960499) {
	    p = SpeechDetector.N7201c77a198(i);
	    } 
	    return p;
	  }
	  static double N7201c77a198(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 55.582099370434776) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 55.582099370434776) {
	    p = SpeechDetector.N52cf550f199(i);
	    } 
	    return p;
	  }
	  static double N52cf550f199(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.651443635089071) {
	    p = SpeechDetector.N29d97642200(i);
	    } else if (((Double) i[2]).doubleValue() > 3.651443635089071) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N29d97642200(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -0.39334145328858955) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > -0.39334145328858955) {
	    p = SpeechDetector.N3e2fc85201(i);
	    } 
	    return p;
	  }
	  static double N3e2fc85201(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -1.2339273471269132) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -1.2339273471269132) {
	    p = SpeechDetector.N2b3081c1202(i);
	    } 
	    return p;
	  }
	  static double N2b3081c1202(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.8048031295210821) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 0.8048031295210821) {
	    p = SpeechDetector.N7d96bc0d203(i);
	    } 
	    return p;
	  }
	  static double N7d96bc0d203(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 68.1948705842749) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 68.1948705842749) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N331439e5204(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.4485784779730737) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 0.4485784779730737) {
	    p = SpeechDetector.N74e50395205(i);
	    } 
	    return p;
	  }
	  static double N74e50395205(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.133318998145317) {
	    p = SpeechDetector.N674e6727206(i);
	    } else if (((Double) i[1]).doubleValue() > 3.133318998145317) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N674e6727206(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.30356302293048) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 62.30356302293048) {
	    p = SpeechDetector.N4c56666d207(i);
	    } 
	    return p;
	  }
	  static double N4c56666d207(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -1.6384663046872536) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -1.6384663046872536) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3c5ea542208(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 56.561776953785746) {
	    p = SpeechDetector.N69b3af04209(i);
	    } else if (((Double) i[0]).doubleValue() > 56.561776953785746) {
	    p = SpeechDetector.N13a765d3210(i);
	    } 
	    return p;
	  }
	  static double N69b3af04209(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 4.478128776384755) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 4.478128776384755) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N13a765d3210(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -1.1251658022104154) {
	    p = SpeechDetector.N530e09b9211(i);
	    } else if (((Double) i[8]).doubleValue() > -1.1251658022104154) {
	    p = SpeechDetector.N19fdd417213(i);
	    } 
	    return p;
	  }
	  static double N530e09b9211(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -4.767349137837295) {
	    p = SpeechDetector.N3ea07b48212(i);
	    } else if (((Double) i[11]).doubleValue() > -4.767349137837295) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ea07b48212(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.45313602904506) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 64.45313602904506) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N19fdd417213(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 8.491488381199202) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 8.491488381199202) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N676f3f55214(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 3.340381519902467) {
	    p = SpeechDetector.N38a71a80215(i);
	    } else if (((Double) i[4]).doubleValue() > 3.340381519902467) {
	    p = SpeechDetector.N6d1ef2bf227(i);
	    } 
	    return p;
	  }
	  static double N38a71a80215(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.6891202437134) {
	    p = SpeechDetector.N62bce68e216(i);
	    } else if (((Double) i[11]).doubleValue() > -2.6891202437134) {
	    p = SpeechDetector.N5fc4a746217(i);
	    } 
	    return p;
	  }
	  static double N62bce68e216(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 5.0046449129917026) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 5.0046449129917026) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5fc4a746217(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 50.80808323657203) {
	    p = SpeechDetector.N67c215c8218(i);
	    } else if (((Double) i[0]).doubleValue() > 50.80808323657203) {
	    p = SpeechDetector.N772432af219(i);
	    } 
	    return p;
	  }
	  static double N67c215c8218(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.6510849341792143) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 0.6510849341792143) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N772432af219(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 5.389513756546701) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 5.389513756546701) {
	    p = SpeechDetector.N697bbc44220(i);
	    } 
	    return p;
	  }
	  static double N697bbc44220(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.4623086075444611) {
	    p = SpeechDetector.N3a854a76221(i);
	    } else if (((Double) i[3]).doubleValue() > 1.4623086075444611) {
	    p = SpeechDetector.N4f955775224(i);
	    } 
	    return p;
	  }
	  static double N3a854a76221(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.3026636574490141) {
	    p = SpeechDetector.N4dba6fe222(i);
	    } else if (((Double) i[11]).doubleValue() > -0.3026636574490141) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4dba6fe222(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.483564399681917) {
	    p = SpeechDetector.N70b0702f223(i);
	    } else if (((Double) i[1]).doubleValue() > 4.483564399681917) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N70b0702f223(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -0.4496919754000871) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -0.4496919754000871) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4f955775224(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.26042383762918) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 61.26042383762918) {
	    p = SpeechDetector.N55a0eb24225(i);
	    } 
	    return p;
	  }
	  static double N55a0eb24225(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -1.752568949960426) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -1.752568949960426) {
	    p = SpeechDetector.N37adb467226(i);
	    } 
	    return p;
	  }
	  static double N37adb467226(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.613479593694267) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.613479593694267) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6d1ef2bf227(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 55.52624483366204) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 55.52624483366204) {
	    p = SpeechDetector.Nad31191228(i);
	    } 
	    return p;
	  }
	  static double Nad31191228(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -3.6835794484448967) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -3.6835794484448967) {
	    p = SpeechDetector.N27264c24229(i);
	    } 
	    return p;
	  }
	  static double N27264c24229(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.672310609398523) {
	    p = SpeechDetector.N4350e390230(i);
	    } else if (((Double) i[3]).doubleValue() > 3.672310609398523) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4350e390230(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.2252587293114088) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.2252587293114088) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N738c2576231(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.831659413478263) {
	    p = SpeechDetector.N75efa13d232(i);
	    } else if (((Double) i[1]).doubleValue() > 6.831659413478263) {
	    p = SpeechDetector.N4af92404271(i);
	    } 
	    return p;
	  }
	  static double N75efa13d232(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 8.139897411807347) {
	    p = SpeechDetector.N4742e848233(i);
	    } else if (((Double) i[2]).doubleValue() > 8.139897411807347) {
	    p = SpeechDetector.N77c219c268(i);
	    } 
	    return p;
	  }
	  static double N4742e848233(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 4.228535881529738) {
	    p = SpeechDetector.N799ff384234(i);
	    } else if (((Double) i[6]).doubleValue() > 4.228535881529738) {
	    p = SpeechDetector.N47ffd910264(i);
	    } 
	    return p;
	  }
	  static double N799ff384234(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 1.429362279388432) {
	    p = SpeechDetector.N742c9d7d235(i);
	    } else if (((Double) i[8]).doubleValue() > 1.429362279388432) {
	    p = SpeechDetector.N65ce9dc5250(i);
	    } 
	    return p;
	  }
	  static double N742c9d7d235(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.311898970052219) {
	    p = SpeechDetector.N1d17b521236(i);
	    } else if (((Double) i[1]).doubleValue() > 4.311898970052219) {
	    p = SpeechDetector.N3fc4a5bd238(i);
	    } 
	    return p;
	  }
	  static double N1d17b521236(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.9808309458924858) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 2.9808309458924858) {
	    p = SpeechDetector.N7f749872237(i);
	    } 
	    return p;
	  }
	  static double N7f749872237(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -0.48470589971097766) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -0.48470589971097766) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3fc4a5bd238(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 2.431136300695378) {
	    p = SpeechDetector.N75d3c00239(i);
	    } else if (((Double) i[2]).doubleValue() > 2.431136300695378) {
	    p = SpeechDetector.N6328dc1f244(i);
	    } 
	    return p;
	  }
	  static double N75d3c00239(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.4882999511642176) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.4882999511642176) {
	    p = SpeechDetector.N7a0e27c6240(i);
	    } 
	    return p;
	  }
	  static double N7a0e27c6240(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 75.919272756591) {
	    p = SpeechDetector.N375576c4241(i);
	    } else if (((Double) i[0]).doubleValue() > 75.919272756591) {
	    p = SpeechDetector.N37c81ba243(i);
	    } 
	    return p;
	  }
	  static double N375576c4241(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.6476210906572768) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 1.6476210906572768) {
	    p = SpeechDetector.N4be85a3d242(i);
	    } 
	    return p;
	  }
	  static double N4be85a3d242(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.04154413632310384) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 0.04154413632310384) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N37c81ba243(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -1.813327381753437) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > -1.813327381753437) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6328dc1f244(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.108818877117963) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 2.108818877117963) {
	    p = SpeechDetector.Nf8baa15245(i);
	    } 
	    return p;
	  }
	  static double Nf8baa15245(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -1.4175551679032676) {
	    p = SpeechDetector.N1a4b50ac246(i);
	    } else if (((Double) i[8]).doubleValue() > -1.4175551679032676) {
	    p = SpeechDetector.N46b5608248(i);
	    } 
	    return p;
	  }
	  static double N1a4b50ac246(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -3.8359836896703023) {
	    p = SpeechDetector.N469d59b0247(i);
	    } else if (((Double) i[9]).doubleValue() > -3.8359836896703023) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N469d59b0247(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -0.3483369631006366) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -0.3483369631006366) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N46b5608248(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -0.5749127351816253) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -0.5749127351816253) {
	    p = SpeechDetector.N22dd297c249(i);
	    } 
	    return p;
	  }
	  static double N22dd297c249(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 1.3846656385022342) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 1.3846656385022342) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N65ce9dc5250(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.6437243382459323) {
	    p = SpeechDetector.N5fd824ba251(i);
	    } else if (((Double) i[6]).doubleValue() > 2.6437243382459323) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5fd824ba251(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.8984014242865996) {
	    p = SpeechDetector.N6753607e252(i);
	    } else if (((Double) i[7]).doubleValue() > 1.8984014242865996) {
	    p = SpeechDetector.N5df91314260(i);
	    } 
	    return p;
	  }
	  static double N6753607e252(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 2.745951948537693) {
	    p = SpeechDetector.N12e42531253(i);
	    } else if (((Double) i[5]).doubleValue() > 2.745951948537693) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N12e42531253(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.176915134929334) {
	    p = SpeechDetector.N4045bda7254(i);
	    } else if (((Double) i[1]).doubleValue() > 6.176915134929334) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4045bda7254(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 3.845557986236272) {
	    p = SpeechDetector.N22a63fe8255(i);
	    } else if (((Double) i[8]).doubleValue() > 3.845557986236272) {
	    p = SpeechDetector.N5ae2740f258(i);
	    } 
	    return p;
	  }
	  static double N22a63fe8255(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.6259829129865162) {
	    p = SpeechDetector.N50adaa1d256(i);
	    } else if (((Double) i[4]).doubleValue() > -1.6259829129865162) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50adaa1d256(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.0087367219000403) {
	    p = SpeechDetector.N397b7f4c257(i);
	    } else if (((Double) i[7]).doubleValue() > 1.0087367219000403) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N397b7f4c257(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.382183305650428) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.382183305650428) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5ae2740f258(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.1607283357467) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.1607283357467) {
	    p = SpeechDetector.N4931b366259(i);
	    } 
	    return p;
	  }
	  static double N4931b366259(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.259834417563883) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -2.259834417563883) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5df91314260(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 0.38264649622951397) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > 0.38264649622951397) {
	    p = SpeechDetector.Nb53b63f261(i);
	    } 
	    return p;
	  }
	  static double Nb53b63f261(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 0.7413333126868185) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 0.7413333126868185) {
	    p = SpeechDetector.N24e1e7e8262(i);
	    } 
	    return p;
	  }
	  static double N24e1e7e8262(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 1.944411619086855) {
	    p = SpeechDetector.N6b404342263(i);
	    } else if (((Double) i[8]).doubleValue() > 1.944411619086855) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b404342263(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 5.424122215143335) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 5.424122215143335) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N47ffd910264(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.7493223714306567) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 1.7493223714306567) {
	    p = SpeechDetector.N6e03ce5d265(i);
	    } 
	    return p;
	  }
	  static double N6e03ce5d265(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 1.5822788964463284) {
	    p = SpeechDetector.N3be17418266(i);
	    } else if (((Double) i[8]).doubleValue() > 1.5822788964463284) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3be17418266(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.5490547951987956) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 3.5490547951987956) {
	    p = SpeechDetector.N4e8cf25e267(i);
	    } 
	    return p;
	  }
	  static double N4e8cf25e267(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 5.261456127187361) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 5.261456127187361) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N77c219c268(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -3.900945466749199) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -3.900945466749199) {
	    p = SpeechDetector.N66828c9a269(i);
	    } 
	    return p;
	  }
	  static double N66828c9a269(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.860116486090383) {
	    p = SpeechDetector.N4dd070a270(i);
	    } else if (((Double) i[5]).doubleValue() > -2.860116486090383) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4dd070a270(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 73.10699636258434) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 73.10699636258434) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4af92404271(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.3478614410169952) {
	    p = SpeechDetector.N2aaba910272(i);
	    } else if (((Double) i[7]).doubleValue() > 0.3478614410169952) {
	    p = SpeechDetector.N13d20ed4277(i);
	    } 
	    return p;
	  }
	  static double N2aaba910272(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -0.31623017371257023) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > -0.31623017371257023) {
	    p = SpeechDetector.N6be86f52273(i);
	    } 
	    return p;
	  }
	  static double N6be86f52273(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 7.025669842017889) {
	    p = SpeechDetector.N68e4a7d6274(i);
	    } else if (((Double) i[1]).doubleValue() > 7.025669842017889) {
	    p = SpeechDetector.N7bc70866275(i);
	    } 
	    return p;
	  }
	  static double N68e4a7d6274(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 73.56505708948555) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 73.56505708948555) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7bc70866275(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 0.6468299114544868) {
	    p = SpeechDetector.N47f8a006276(i);
	    } else if (((Double) i[4]).doubleValue() > 0.6468299114544868) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N47f8a006276(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.1245188985826056) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 1.1245188985826056) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N13d20ed4277(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.310075616964446) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 2.310075616964446) {
	    p = SpeechDetector.N43cb8a76278(i);
	    } 
	    return p;
	  }
	  static double N43cb8a76278(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -0.442258080612659) {
	    p = SpeechDetector.N67ef6bbf279(i);
	    } else if (((Double) i[8]).doubleValue() > -0.442258080612659) {
	    p = SpeechDetector.N6a685e5c282(i);
	    } 
	    return p;
	  }
	  static double N67ef6bbf279(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -3.2704321376217727) {
	    p = SpeechDetector.N178afde8280(i);
	    } else if (((Double) i[11]).doubleValue() > -3.2704321376217727) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N178afde8280(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 1.7857857960380694) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > 1.7857857960380694) {
	    p = SpeechDetector.N2623966b281(i);
	    } 
	    return p;
	  }
	  static double N2623966b281(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.879765122827182) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 3.879765122827182) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a685e5c282(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 0.46677010961677784) {
	    p = SpeechDetector.N6a0b2097283(i);
	    } else if (((Double) i[4]).doubleValue() > 0.46677010961677784) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a0b2097283(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.8170933229897157) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.8170933229897157) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N88cfe5284(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 66.97713944000579) {
	    p = SpeechDetector.N1608c3a9285(i);
	    } else if (((Double) i[0]).doubleValue() > 66.97713944000579) {
	    p = SpeechDetector.N3f8ddfb4295(i);
	    } 
	    return p;
	  }
	  static double N1608c3a9285(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.639752653405851) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -3.639752653405851) {
	    p = SpeechDetector.N1965978c286(i);
	    } 
	    return p;
	  }
	  static double N1965978c286(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.09520289610881916) {
	    p = SpeechDetector.N5cc0755a287(i);
	    } else if (((Double) i[11]).doubleValue() > -0.09520289610881916) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5cc0755a287(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -2.7289389821241348) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -2.7289389821241348) {
	    p = SpeechDetector.N5f589748288(i);
	    } 
	    return p;
	  }
	  static double N5f589748288(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.4012801147494811) {
	    p = SpeechDetector.N313428df289(i);
	    } else if (((Double) i[6]).doubleValue() > -0.4012801147494811) {
	    p = SpeechDetector.N443fdee7291(i);
	    } 
	    return p;
	  }
	  static double N313428df289(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 9.030431490340247) {
	    p = SpeechDetector.N576761b5290(i);
	    } else if (((Double) i[1]).doubleValue() > 9.030431490340247) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N576761b5290(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 8.660617918654092) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 8.660617918654092) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N443fdee7291(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -0.4060388347915908) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -0.4060388347915908) {
	    p = SpeechDetector.N3d4332b2292(i);
	    } 
	    return p;
	  }
	  static double N3d4332b2292(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 0.5633871423731139) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > 0.5633871423731139) {
	    p = SpeechDetector.N6b5638a293(i);
	    } 
	    return p;
	  }
	  static double N6b5638a293(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 60.53124890424123) {
	    p = SpeechDetector.N6e99fc76294(i);
	    } else if (((Double) i[0]).doubleValue() > 60.53124890424123) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6e99fc76294(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 0.04657824448065307) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > 0.04657824448065307) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f8ddfb4295(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 71.38467915794381) {
	    p = SpeechDetector.N7b59c304296(i);
	    } else if (((Double) i[0]).doubleValue() > 71.38467915794381) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b59c304296(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 10.778444447086681) {
	    p = SpeechDetector.N42127ae0297(i);
	    } else if (((Double) i[1]).doubleValue() > 10.778444447086681) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N42127ae0297(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.7355329702843065) {
	    p = SpeechDetector.N4b412a03298(i);
	    } else if (((Double) i[4]).doubleValue() > 1.7355329702843065) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4b412a03298(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.5042519462757695) {
	    p = SpeechDetector.N232d518e299(i);
	    } else if (((Double) i[5]).doubleValue() > 0.5042519462757695) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N232d518e299(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 0.16145426146952102) {
	    p = SpeechDetector.N744553ac300(i);
	    } else if (((Double) i[8]).doubleValue() > 0.16145426146952102) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N744553ac300(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.6320120535299529) {
	    p = SpeechDetector.N73787cd6301(i);
	    } else if (((Double) i[7]).doubleValue() > 0.6320120535299529) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N73787cd6301(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.3646221440182617) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.3646221440182617) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b4c00d3302(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 6.64162089726935) {
	    p = SpeechDetector.N4aca53ad303(i);
	    } else if (((Double) i[4]).doubleValue() > 6.64162089726935) {
	    p = SpeechDetector.N5c91e33c334(i);
	    } 
	    return p;
	  }
	  static double N4aca53ad303(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 3.1813989027547183) {
	    p = SpeechDetector.N293ba937304(i);
	    } else if (((Double) i[9]).doubleValue() > 3.1813989027547183) {
	    p = SpeechDetector.N5011bafa332(i);
	    } 
	    return p;
	  }
	  static double N293ba937304(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 3.609782626053694) {
	    p = SpeechDetector.Nbe26f07305(i);
	    } else if (((Double) i[6]).doubleValue() > 3.609782626053694) {
	    p = SpeechDetector.N10bcf083330(i);
	    } 
	    return p;
	  }
	  static double Nbe26f07305(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 52.11038132448654) {
	    p = SpeechDetector.N3ee73aa9306(i);
	    } else if (((Double) i[0]).doubleValue() > 52.11038132448654) {
	    p = SpeechDetector.N2bc0f4c7309(i);
	    } 
	    return p;
	  }
	  static double N3ee73aa9306(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.0143494573438536) {
	    p = SpeechDetector.N3ebc4d82307(i);
	    } else if (((Double) i[3]).doubleValue() > 2.0143494573438536) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3ebc4d82307(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.3696717757344058) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.3696717757344058) {
	    p = SpeechDetector.N3c84b1fb308(i);
	    } 
	    return p;
	  }
	  static double N3c84b1fb308(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.5961962177814205) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -0.5961962177814205) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2bc0f4c7309(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 72.16487834434716) {
	    p = SpeechDetector.N9064b42310(i);
	    } else if (((Double) i[0]).doubleValue() > 72.16487834434716) {
	    p = SpeechDetector.N47908a5c328(i);
	    } 
	    return p;
	  }
	  static double N9064b42310(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -5.0903281843098975) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -5.0903281843098975) {
	    p = SpeechDetector.N7c36deae311(i);
	    } 
	    return p;
	  }
	  static double N7c36deae311(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -2.279798448733724) {
	    p = SpeechDetector.N7655b137312(i);
	    } else if (((Double) i[2]).doubleValue() > -2.279798448733724) {
	    p = SpeechDetector.N745d0eaf314(i);
	    } 
	    return p;
	  }
	  static double N7655b137312(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 1.3235245783310194) {
	    p = SpeechDetector.N73e5ce92313(i);
	    } else if (((Double) i[1]).doubleValue() > 1.3235245783310194) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N73e5ce92313(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 5.53195469875959) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 5.53195469875959) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N745d0eaf314(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 8.491454004199852) {
	    p = SpeechDetector.N96f3ed8315(i);
	    } else if (((Double) i[1]).doubleValue() > 8.491454004199852) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N96f3ed8315(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.4968975629594279) {
	    p = SpeechDetector.N6686dbbe316(i);
	    } else if (((Double) i[7]).doubleValue() > 1.4968975629594279) {
	    p = SpeechDetector.N2217c56e324(i);
	    } 
	    return p;
	  }
	  static double N6686dbbe316(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.3831223945377866) {
	    p = SpeechDetector.N1fc4cb88317(i);
	    } else if (((Double) i[3]).doubleValue() > 3.3831223945377866) {
	    p = SpeechDetector.N1335924c323(i);
	    } 
	    return p;
	  }
	  static double N1fc4cb88317(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -3.322490216905266) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -3.322490216905266) {
	    p = SpeechDetector.N310e5e03318(i);
	    } 
	    return p;
	  }
	  static double N310e5e03318(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 1.0898854067756039) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 1.0898854067756039) {
	    p = SpeechDetector.N263e301e319(i);
	    } 
	    return p;
	  }
	  static double N263e301e319(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.4100485982558704) {
	    p = SpeechDetector.N3cc9152f320(i);
	    } else if (((Double) i[11]).doubleValue() > 1.4100485982558704) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3cc9152f320(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 1.4672318916236842) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 1.4672318916236842) {
	    p = SpeechDetector.N358ddfd6321(i);
	    } 
	    return p;
	  }
	  static double N358ddfd6321(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -0.19219397630600174) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -0.19219397630600174) {
	    p = SpeechDetector.N75627611322(i);
	    } 
	    return p;
	  }
	  static double N75627611322(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.7676367589732968) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.7676367589732968) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1335924c323(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.278452865854928) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 4.278452865854928) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2217c56e324(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 54.303973801709255) {
	    p = SpeechDetector.N46a2ca3e325(i);
	    } else if (((Double) i[0]).doubleValue() > 54.303973801709255) {
	    p = SpeechDetector.N698bd0ac326(i);
	    } 
	    return p;
	  }
	  static double N46a2ca3e325(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 1.6038758510320898) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 1.6038758510320898) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N698bd0ac326(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.634429903503639) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 6.634429903503639) {
	    p = SpeechDetector.N5a310256327(i);
	    } 
	    return p;
	  }
	  static double N5a310256327(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.0829942024173915) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 1.0829942024173915) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N47908a5c328(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.07660159732843) {
	    p = SpeechDetector.N626bc2b8329(i);
	    } else if (((Double) i[1]).doubleValue() > 4.07660159732843) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N626bc2b8329(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.315106404682187) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 0.315106404682187) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N10bcf083330(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 5.344109157355799) {
	    p = SpeechDetector.N6452310a331(i);
	    } else if (((Double) i[4]).doubleValue() > 5.344109157355799) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6452310a331(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 62.17962407188137) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 62.17962407188137) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5011bafa332(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 4.9331162127937915) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 4.9331162127937915) {
	    p = SpeechDetector.N3c0a9c27333(i);
	    } 
	    return p;
	  }
	  static double N3c0a9c27333(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 59.62264589570132) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 59.62264589570132) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c91e33c334(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -2.4972285877466103) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -2.4972285877466103) {
	    p = SpeechDetector.N6ddda79e335(i);
	    } 
	    return p;
	  }
	  static double N6ddda79e335(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.5308882855605794) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 1.5308882855605794) {
	    p = SpeechDetector.N7327ae6b336(i);
	    } 
	    return p;
	  }
	  static double N7327ae6b336(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 58.72331915874951) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 58.72331915874951) {
	    p = SpeechDetector.N322c2ddd337(i);
	    } 
	    return p;
	  }
	  static double N322c2ddd337(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.8123431825480923) {
	    p = SpeechDetector.N727721e6338(i);
	    } else if (((Double) i[2]).doubleValue() > 0.8123431825480923) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N727721e6338(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.484472313999154) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 2.484472313999154) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6b52bdbf339(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 57.166078010524274) {
	    p = SpeechDetector.N5277da5340(i);
	    } else if (((Double) i[0]).doubleValue() > 57.166078010524274) {
	    p = SpeechDetector.N653498ff351(i);
	    } 
	    return p;
	  }
	  static double N5277da5340(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 5.062041558246751) {
	    p = SpeechDetector.N63a9de47341(i);
	    } else if (((Double) i[3]).doubleValue() > 5.062041558246751) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N63a9de47341(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 53.26805522064642) {
	    p = SpeechDetector.N25403a6f342(i);
	    } else if (((Double) i[0]).doubleValue() > 53.26805522064642) {
	    p = SpeechDetector.N6c648855344(i);
	    } 
	    return p;
	  }
	  static double N25403a6f342(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.518497172350477) {
	    p = SpeechDetector.N1bbc6084343(i);
	    } else if (((Double) i[3]).doubleValue() > 4.518497172350477) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1bbc6084343(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.28250576747167283) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 0.28250576747167283) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6c648855344(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.563547095538702) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.563547095538702) {
	    p = SpeechDetector.N3c32bc0b345(i);
	    } 
	    return p;
	  }
	  static double N3c32bc0b345(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.6285602828498837) {
	    p = SpeechDetector.N26d7950d346(i);
	    } else if (((Double) i[2]).doubleValue() > 3.6285602828498837) {
	    p = SpeechDetector.N4e868079349(i);
	    } 
	    return p;
	  }
	  static double N26d7950d346(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 6.020274094033307) {
	    p = SpeechDetector.N137a9c67347(i);
	    } else if (((Double) i[4]).doubleValue() > 6.020274094033307) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N137a9c67347(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.232251755758912) {
	    p = SpeechDetector.N56b2382e348(i);
	    } else if (((Double) i[8]).doubleValue() > -2.232251755758912) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N56b2382e348(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.1463870007527195) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.1463870007527195) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e868079349(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.7190135458760059) {
	    p = SpeechDetector.N605cb035350(i);
	    } else if (((Double) i[6]).doubleValue() > 0.7190135458760059) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N605cb035350(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.07046684798246625) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 0.07046684798246625) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N653498ff351(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.746266353196396) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -1.746266353196396) {
	    p = SpeechDetector.N6028c141352(i);
	    } 
	    return p;
	  }
	  static double N6028c141352(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.7546818836527864) {
	    p = SpeechDetector.N13a7c3b9353(i);
	    } else if (((Double) i[2]).doubleValue() > -0.7546818836527864) {
	    p = SpeechDetector.N38ce3b00356(i);
	    } 
	    return p;
	  }
	  static double N13a7c3b9353(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.4565903227287748) {
	    p = SpeechDetector.N6b22b0c3354(i);
	    } else if (((Double) i[9]).doubleValue() > 0.4565903227287748) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6b22b0c3354(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -1.0814104315289155) {
	    p = SpeechDetector.N32830928355(i);
	    } else if (((Double) i[4]).doubleValue() > -1.0814104315289155) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N32830928355(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -4.339810345753707) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -4.339810345753707) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N38ce3b00356(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.658397705792316) {
	    p = SpeechDetector.N6b839a22357(i);
	    } else if (((Double) i[1]).doubleValue() > 6.658397705792316) {
	    p = SpeechDetector.N71100043413(i);
	    } 
	    return p;
	  }
	  static double N6b839a22357(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 4.503869758656691) {
	    p = SpeechDetector.Ncfc6553358(i);
	    } else if (((Double) i[4]).doubleValue() > 4.503869758656691) {
	    p = SpeechDetector.N7cac5ecd402(i);
	    } 
	    return p;
	  }
	  static double Ncfc6553358(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -5.160877101802702) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -5.160877101802702) {
	    p = SpeechDetector.Ne6032ce359(i);
	    } 
	    return p;
	  }
	  static double Ne6032ce359(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -5.822037050199723) {
	    p = SpeechDetector.N4da779c1360(i);
	    } else if (((Double) i[4]).doubleValue() > -5.822037050199723) {
	    p = SpeechDetector.N7c67ea36363(i);
	    } 
	    return p;
	  }
	  static double N4da779c1360(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.6014030888373215) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -0.6014030888373215) {
	    p = SpeechDetector.N2e2a95bb361(i);
	    } 
	    return p;
	  }
	  static double N2e2a95bb361(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -8.006103869026498) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -8.006103869026498) {
	    p = SpeechDetector.N6dcc3faa362(i);
	    } 
	    return p;
	  }
	  static double N6dcc3faa362(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7.578927830481171) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 7.578927830481171) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7c67ea36363(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.188665748796483) {
	    p = SpeechDetector.Na41bf09364(i);
	    } else if (((Double) i[6]).doubleValue() > 2.188665748796483) {
	    p = SpeechDetector.N89e2002378(i);
	    } 
	    return p;
	  }
	  static double Na41bf09364(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7.01597411646159) {
	    p = SpeechDetector.N6264ed21365(i);
	    } else if (((Double) i[2]).doubleValue() > 7.01597411646159) {
	    p = SpeechDetector.N6cf662b4372(i);
	    } 
	    return p;
	  }
	  static double N6264ed21365(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 2.960893815475117) {
	    p = SpeechDetector.N500c43fe366(i);
	    } else if (((Double) i[2]).doubleValue() > 2.960893815475117) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N500c43fe366(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 3.342328652143284) {
	    p = SpeechDetector.N554401c0367(i);
	    } else if (((Double) i[4]).doubleValue() > 3.342328652143284) {
	    p = SpeechDetector.N1118b490371(i);
	    } 
	    return p;
	  }
	  static double N554401c0367(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 2.2442986099688214) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 2.2442986099688214) {
	    p = SpeechDetector.N63cf0ffb368(i);
	    } 
	    return p;
	  }
	  static double N63cf0ffb368(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 68.25653523113306) {
	    p = SpeechDetector.N2f225aee369(i);
	    } else if (((Double) i[0]).doubleValue() > 68.25653523113306) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2f225aee369(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 4.32171632419384) {
	    p = SpeechDetector.N787fd76e370(i);
	    } else if (((Double) i[9]).doubleValue() > 4.32171632419384) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N787fd76e370(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 2.501628967072438) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 2.501628967072438) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1118b490371(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 5.325869989199179) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 5.325869989199179) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6cf662b4372(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 0.7106311018659032) {
	    p = SpeechDetector.N23ca4f4f373(i);
	    } else if (((Double) i[5]).doubleValue() > 0.7106311018659032) {
	    p = SpeechDetector.N304a6504376(i);
	    } 
	    return p;
	  }
	  static double N23ca4f4f373(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -2.384289543379197) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -2.384289543379197) {
	    p = SpeechDetector.N371cdde4374(i);
	    } 
	    return p;
	  }
	  static double N371cdde4374(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.0937110806635792) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.0937110806635792) {
	    p = SpeechDetector.N482bc000375(i);
	    } 
	    return p;
	  }
	  static double N482bc000375(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.838577040353925) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 62.838577040353925) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N304a6504376(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 5.051328071715192) {
	    p = SpeechDetector.N642e0260377(i);
	    } else if (((Double) i[3]).doubleValue() > 5.051328071715192) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N642e0260377(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.3188683854579303) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.3188683854579303) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N89e2002378(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.817986462218431) {
	    p = SpeechDetector.N454767b9379(i);
	    } else if (((Double) i[11]).doubleValue() > -2.817986462218431) {
	    p = SpeechDetector.N279de6fb385(i);
	    } 
	    return p;
	  }
	  static double N454767b9379(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 6.7755425538568455) {
	    p = SpeechDetector.N52eac637380(i);
	    } else if (((Double) i[3]).doubleValue() > 6.7755425538568455) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N52eac637380(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.4284199564628723) {
	    p = SpeechDetector.N337b6f68381(i);
	    } else if (((Double) i[4]).doubleValue() > 1.4284199564628723) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N337b6f68381(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.371209918933385) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.371209918933385) {
	    p = SpeechDetector.N6ccf2f3f382(i);
	    } 
	    return p;
	  }
	  static double N6ccf2f3f382(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.151474571570114) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 2.151474571570114) {
	    p = SpeechDetector.N162708e8383(i);
	    } 
	    return p;
	  }
	  static double N162708e8383(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -0.32353893834357267) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -0.32353893834357267) {
	    p = SpeechDetector.N5cb9c2b4384(i);
	    } 
	    return p;
	  }
	  static double N5cb9c2b4384(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 73.19614829075476) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 73.19614829075476) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N279de6fb385(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 4.684802754203823) {
	    p = SpeechDetector.N6fa77d0e386(i);
	    } else if (((Double) i[6]).doubleValue() > 4.684802754203823) {
	    p = SpeechDetector.N55b86414397(i);
	    } 
	    return p;
	  }
	  static double N6fa77d0e386(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.16827536078332) {
	    p = SpeechDetector.N5d035b66387(i);
	    } else if (((Double) i[0]).doubleValue() > 61.16827536078332) {
	    p = SpeechDetector.N7572fe69390(i);
	    } 
	    return p;
	  }
	  static double N5d035b66387(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 5.73467653825376) {
	    p = SpeechDetector.N765b53f388(i);
	    } else if (((Double) i[3]).doubleValue() > 5.73467653825376) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N765b53f388(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.099333128645787) {
	    p = SpeechDetector.N265e3ee4389(i);
	    } else if (((Double) i[1]).doubleValue() > 6.099333128645787) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N265e3ee4389(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.816696055804708) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.816696055804708) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7572fe69390(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 5.973665967536033) {
	    p = SpeechDetector.N509cdbbc391(i);
	    } else if (((Double) i[3]).doubleValue() > 5.973665967536033) {
	    p = SpeechDetector.N6a1e3cfc392(i);
	    } 
	    return p;
	  }
	  static double N509cdbbc391(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 3.3891356798185104) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 3.3891356798185104) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a1e3cfc392(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 1.589199091758495) {
	    p = SpeechDetector.N6735fad1393(i);
	    } else if (((Double) i[5]).doubleValue() > 1.589199091758495) {
	    p = SpeechDetector.N3aa99dd2396(i);
	    } 
	    return p;
	  }
	  static double N6735fad1393(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 2.733998667092387) {
	    p = SpeechDetector.N8e5e447394(i);
	    } else if (((Double) i[7]).doubleValue() > 2.733998667092387) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N8e5e447394(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 68.8585699434167) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 68.8585699434167) {
	    p = SpeechDetector.N2cedf5e1395(i);
	    } 
	    return p;
	  }
	  static double N2cedf5e1395(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.072350422981294) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.072350422981294) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3aa99dd2396(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.2946439406434793) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 2.2946439406434793) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N55b86414397(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.083260377543744) {
	    p = SpeechDetector.N3cb28903398(i);
	    } else if (((Double) i[5]).doubleValue() > 2.083260377543744) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3cb28903398(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -4.081205372702191) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -4.081205372702191) {
	    p = SpeechDetector.N6d414316399(i);
	    } 
	    return p;
	  }
	  static double N6d414316399(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -1.8482000711717426) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -1.8482000711717426) {
	    p = SpeechDetector.N579b9163400(i);
	    } 
	    return p;
	  }
	  static double N579b9163400(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -0.42676888316050465) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > -0.42676888316050465) {
	    p = SpeechDetector.N26662784401(i);
	    } 
	    return p;
	  }
	  static double N26662784401(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 5.553602021926863) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 5.553602021926863) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7cac5ecd402(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 6.776682437972223) {
	    p = SpeechDetector.N188424ad403(i);
	    } else if (((Double) i[4]).doubleValue() > 6.776682437972223) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N188424ad403(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 7.249870665328402) {
	    p = SpeechDetector.Nb83e66e404(i);
	    } else if (((Double) i[3]).doubleValue() > 7.249870665328402) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nb83e66e404(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= -4.614965092893187) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > -4.614965092893187) {
	    p = SpeechDetector.N8d45aa405(i);
	    } 
	    return p;
	  }
	  static double N8d45aa405(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.017425078716438) {
	    p = SpeechDetector.N3ad89c2e406(i);
	    } else if (((Double) i[2]).doubleValue() > 4.017425078716438) {
	    p = SpeechDetector.N75cc1f9d411(i);
	    } 
	    return p;
	  }
	  static double N3ad89c2e406(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -2.8127014897250446) {
	    p = SpeechDetector.N62f5ae30407(i);
	    } else if (((Double) i[8]).doubleValue() > -2.8127014897250446) {
	    p = SpeechDetector.N7be43146409(i);
	    } 
	    return p;
	  }
	  static double N62f5ae30407(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 70.59080864029652) {
	    p = SpeechDetector.N6f7f0411408(i);
	    } else if (((Double) i[0]).doubleValue() > 70.59080864029652) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f7f0411408(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.3635406906396845) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.3635406906396845) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7be43146409(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.791994980681651) {
	    p = SpeechDetector.N425f2a35410(i);
	    } else if (((Double) i[3]).doubleValue() > 4.791994980681651) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N425f2a35410(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 60.58555797889092) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 60.58555797889092) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N75cc1f9d411(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.1552705563116117) {
	    p = SpeechDetector.N2c2fb8d6412(i);
	    } else if (((Double) i[7]).doubleValue() > 1.1552705563116117) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c2fb8d6412(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 71.47997317907002) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 71.47997317907002) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N71100043413(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -2.9982727310277797) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -2.9982727310277797) {
	    p = SpeechDetector.N518168b2414(i);
	    } 
	    return p;
	  }
	  static double N518168b2414(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 5.316762510584311) {
	    p = SpeechDetector.N700a7ec415(i);
	    } else if (((Double) i[2]).doubleValue() > 5.316762510584311) {
	    p = SpeechDetector.N5e460b57420(i);
	    } 
	    return p;
	  }
	  static double N700a7ec415(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 7.218529923245912) {
	    p = SpeechDetector.N3c107a8b416(i);
	    } else if (((Double) i[3]).doubleValue() > 7.218529923245912) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3c107a8b416(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 1.5097850885725799) {
	    p = SpeechDetector.N5ddd5a7b417(i);
	    } else if (((Double) i[6]).doubleValue() > 1.5097850885725799) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5ddd5a7b417(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.3132927452161735) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.3132927452161735) {
	    p = SpeechDetector.N6f5f7161418(i);
	    } 
	    return p;
	  }
	  static double N6f5f7161418(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.164278934909738) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 2.164278934909738) {
	    p = SpeechDetector.N630cd066419(i);
	    } 
	    return p;
	  }
	  static double N630cd066419(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 5.519508358484107) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 5.519508358484107) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5e460b57420(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.8152216319706875) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.8152216319706875) {
	    p = SpeechDetector.N4892ad1b421(i);
	    } 
	    return p;
	  }
	  static double N4892ad1b421(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 1.2601273407622764) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 1.2601273407622764) {
	    p = SpeechDetector.N15a2ecd6422(i);
	    } 
	    return p;
	  }
	  static double N15a2ecd6422(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.9030138527467737) {
	    p = SpeechDetector.N7b6ae0b2423(i);
	    } else if (((Double) i[6]).doubleValue() > 2.9030138527467737) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b6ae0b2423(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 5.264601523880797) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 5.264601523880797) {
	    p = SpeechDetector.N25c6056b424(i);
	    } 
	    return p;
	  }
	  static double N25c6056b424(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 8.534785884699328) {
	    p = SpeechDetector.N6b8dc72c425(i);
	    } else if (((Double) i[1]).doubleValue() > 8.534785884699328) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b8dc72c425(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.21557723120522368) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 0.21557723120522368) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N290f50de426(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.001224521786436) {
	    p = SpeechDetector.N2c8633e1427(i);
	    } else if (((Double) i[1]).doubleValue() > 5.001224521786436) {
	    p = SpeechDetector.N7bca8054472(i);
	    } 
	    return p;
	  }
	  static double N2c8633e1427(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -5.20644954628261) {
	    p = SpeechDetector.N1eb80f9d428(i);
	    } else if (((Double) i[4]).doubleValue() > -5.20644954628261) {
	    p = SpeechDetector.N5505c606432(i);
	    } 
	    return p;
	  }
	  static double N1eb80f9d428(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 0.013121647654628487) {
	    p = SpeechDetector.N46091c2c429(i);
	    } else if (((Double) i[8]).doubleValue() > 0.013121647654628487) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N46091c2c429(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 87.93146947520776) {
	    p = SpeechDetector.N18b0a0430(i);
	    } else if (((Double) i[0]).doubleValue() > 87.93146947520776) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N18b0a0430(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.753315918479157) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 1.753315918479157) {
	    p = SpeechDetector.N54f3d86c431(i);
	    } 
	    return p;
	  }
	  static double N54f3d86c431(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.149421900377448) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 5.149421900377448) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5505c606432(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.9133492433503775) {
	    p = SpeechDetector.N6e0bdf85433(i);
	    } else if (((Double) i[2]).doubleValue() > -0.9133492433503775) {
	    p = SpeechDetector.N24f87069446(i);
	    } 
	    return p;
	  }
	  static double N6e0bdf85433(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.6625478913061613) {
	    p = SpeechDetector.N4d7fcd34434(i);
	    } else if (((Double) i[1]).doubleValue() > 1.6625478913061613) {
	    p = SpeechDetector.N3865a7c4444(i);
	    } 
	    return p;
	  }
	  static double N4d7fcd34434(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 4.068886958714542) {
	    p = SpeechDetector.N17938ac435(i);
	    } else if (((Double) i[5]).doubleValue() > 4.068886958714542) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N17938ac435(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -4.90106403378457) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -4.90106403378457) {
	    p = SpeechDetector.N3d77a4f5436(i);
	    } 
	    return p;
	  }
	  static double N3d77a4f5436(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -5.9073940822354025) {
	    p = SpeechDetector.N79eef059437(i);
	    } else if (((Double) i[8]).doubleValue() > -5.9073940822354025) {
	    p = SpeechDetector.N76d45f73439(i);
	    } 
	    return p;
	  }
	  static double N79eef059437(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -1.2404038789438043) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -1.2404038789438043) {
	    p = SpeechDetector.N35e5a199438(i);
	    } 
	    return p;
	  }
	  static double N35e5a199438(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 87.19208745404576) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 87.19208745404576) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N76d45f73439(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 3.465994588724532) {
	    p = SpeechDetector.N70c6b3f7440(i);
	    } else if (((Double) i[9]).doubleValue() > 3.465994588724532) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N70c6b3f7440(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.5364584934232541) {
	    p = SpeechDetector.N55156f9441(i);
	    } else if (((Double) i[6]).doubleValue() > -1.5364584934232541) {
	    p = SpeechDetector.N1f24f829442(i);
	    } 
	    return p;
	  }
	  static double N55156f9441(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -3.526236087089449) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -3.526236087089449) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1f24f829442(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.5719754769400813) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 0.5719754769400813) {
	    p = SpeechDetector.N34205bb8443(i);
	    } 
	    return p;
	  }
	  static double N34205bb8443(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.9128698812608176) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > -0.9128698812608176) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3865a7c4444(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -2.034267744537483) {
	    p = SpeechDetector.N19e951c9445(i);
	    } else if (((Double) i[7]).doubleValue() > -2.034267744537483) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N19e951c9445(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 2.2403375593585215) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 2.2403375593585215) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N24f87069446(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7.858376665412138) {
	    p = SpeechDetector.N329c1075447(i);
	    } else if (((Double) i[2]).doubleValue() > 7.858376665412138) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N329c1075447(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 1.6447103238529714) {
	    p = SpeechDetector.N23fc8b48448(i);
	    } else if (((Double) i[5]).doubleValue() > 1.6447103238529714) {
	    p = SpeechDetector.N56ed051c468(i);
	    } 
	    return p;
	  }
	  static double N23fc8b48448(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 3.5311882557189076) {
	    p = SpeechDetector.N191c366d449(i);
	    } else if (((Double) i[6]).doubleValue() > 3.5311882557189076) {
	    p = SpeechDetector.N785187dd463(i);
	    } 
	    return p;
	  }
	  static double N191c366d449(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -0.363927929859521) {
	    p = SpeechDetector.Nb393afc450(i);
	    } else if (((Double) i[3]).doubleValue() > -0.363927929859521) {
	    p = SpeechDetector.N4674b826457(i);
	    } 
	    return p;
	  }
	  static double Nb393afc450(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -3.250302532247651) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -3.250302532247651) {
	    p = SpeechDetector.N5a4f7c25451(i);
	    } 
	    return p;
	  }
	  static double N5a4f7c25451(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -4.27466843902346) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -4.27466843902346) {
	    p = SpeechDetector.N185f8f75452(i);
	    } 
	    return p;
	  }
	  static double N185f8f75452(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -3.836608960015824) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -3.836608960015824) {
	    p = SpeechDetector.N29c356d3453(i);
	    } 
	    return p;
	  }
	  static double N29c356d3453(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.606419177815476) {
	    p = SpeechDetector.N57794c10454(i);
	    } else if (((Double) i[1]).doubleValue() > 4.606419177815476) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N57794c10454(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 82.11241703517597) {
	    p = SpeechDetector.N5c70db4d455(i);
	    } else if (((Double) i[0]).doubleValue() > 82.11241703517597) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c70db4d455(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -4.688187178863432) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -4.688187178863432) {
	    p = SpeechDetector.N754dcba4456(i);
	    } 
	    return p;
	  }
	  static double N754dcba4456(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.961290261298409) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 3.961290261298409) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4674b826457(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 0.6405599835547724) {
	    p = SpeechDetector.N18e5eaed458(i);
	    } else if (((Double) i[7]).doubleValue() > 0.6405599835547724) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N18e5eaed458(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.6968623347830065) {
	    p = SpeechDetector.N1ea27a60459(i);
	    } else if (((Double) i[4]).doubleValue() > -2.6968623347830065) {
	    p = SpeechDetector.N76f6896b461(i);
	    } 
	    return p;
	  }
	  static double N1ea27a60459(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.13416347062342796) {
	    p = SpeechDetector.N3d104456460(i);
	    } else if (((Double) i[10]).doubleValue() > -0.13416347062342796) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3d104456460(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 6.729051972797532) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 6.729051972797532) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N76f6896b461(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -5.7945171194927685) {
	    p = SpeechDetector.N33b80cd1462(i);
	    } else if (((Double) i[5]).doubleValue() > -5.7945171194927685) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N33b80cd1462(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.42876849885037) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.42876849885037) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N785187dd463(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.067652556693709) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -1.067652556693709) {
	    p = SpeechDetector.N30aefbe1464(i);
	    } 
	    return p;
	  }
	  static double N30aefbe1464(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -2.9350576703393174) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -2.9350576703393174) {
	    p = SpeechDetector.N301a89bf465(i);
	    } 
	    return p;
	  }
	  static double N301a89bf465(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 4.421804065228345) {
	    p = SpeechDetector.N1e497345466(i);
	    } else if (((Double) i[6]).doubleValue() > 4.421804065228345) {
	    p = SpeechDetector.N682ec68b467(i);
	    } 
	    return p;
	  }
	  static double N1e497345466(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -4.175342086336821) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -4.175342086336821) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N682ec68b467(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -2.6367669384428365) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > -2.6367669384428365) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N56ed051c468(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -0.2603740684554637) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -0.2603740684554637) {
	    p = SpeechDetector.N62ea9dd9469(i);
	    } 
	    return p;
	  }
	  static double N62ea9dd9469(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.8611956651079421) {
	    p = SpeechDetector.N1921444b470(i);
	    } else if (((Double) i[10]).doubleValue() > -0.8611956651079421) {
	    p = SpeechDetector.N570aa4d0471(i);
	    } 
	    return p;
	  }
	  static double N1921444b470(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -0.23104776228176183) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -0.23104776228176183) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N570aa4d0471(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 1.3144934435054614) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 1.3144934435054614) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7bca8054472(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 7.105821533838352) {
	    p = SpeechDetector.N2baf4a4a473(i);
	    } else if (((Double) i[1]).doubleValue() > 7.105821533838352) {
	    p = SpeechDetector.Na90eb7d498(i);
	    } 
	    return p;
	  }
	  static double N2baf4a4a473(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.6495090028232213) {
	    p = SpeechDetector.N13656ae474(i);
	    } else if (((Double) i[4]).doubleValue() > -1.6495090028232213) {
	    p = SpeechDetector.N6f624059481(i);
	    } 
	    return p;
	  }
	  static double N13656ae474(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 81.89466505477391) {
	    p = SpeechDetector.N1674ba21475(i);
	    } else if (((Double) i[0]).doubleValue() > 81.89466505477391) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1674ba21475(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 3.8104028700818424) {
	    p = SpeechDetector.N4967d80b476(i);
	    } else if (((Double) i[2]).doubleValue() > 3.8104028700818424) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4967d80b476(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -1.5460648265426407) {
	    p = SpeechDetector.N4098dfd3477(i);
	    } else if (((Double) i[9]).doubleValue() > -1.5460648265426407) {
	    p = SpeechDetector.N748eb6c6478(i);
	    } 
	    return p;
	  }
	  static double N4098dfd3477(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 78.97616739091787) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 78.97616739091787) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N748eb6c6478(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.166006434074089) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -3.166006434074089) {
	    p = SpeechDetector.N4581bcf2479(i);
	    } 
	    return p;
	  }
	  static double N4581bcf2479(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.79666021108569) {
	    p = SpeechDetector.N489bd784480(i);
	    } else if (((Double) i[6]).doubleValue() > 2.79666021108569) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N489bd784480(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 0.943331544137258) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 0.943331544137258) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f624059481(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.603757518621452) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.603757518621452) {
	    p = SpeechDetector.N1b6ecc30482(i);
	    } 
	    return p;
	  }
	  static double N1b6ecc30482(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 3.2687386309759754) {
	    p = SpeechDetector.N71f7162483(i);
	    } else if (((Double) i[5]).doubleValue() > 3.2687386309759754) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N71f7162483(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.839620502481244) {
	    p = SpeechDetector.N214cdc95484(i);
	    } else if (((Double) i[6]).doubleValue() > -2.839620502481244) {
	    p = SpeechDetector.N7c44c1ad486(i);
	    } 
	    return p;
	  }
	  static double N214cdc95484(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 92.13815367172903) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 92.13815367172903) {
	    p = SpeechDetector.N3d25cb47485(i);
	    } 
	    return p;
	  }
	  static double N3d25cb47485(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 94.1952312362029) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 94.1952312362029) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7c44c1ad486(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 3.786582982429494) {
	    p = SpeechDetector.N6078498487(i);
	    } else if (((Double) i[6]).doubleValue() > 3.786582982429494) {
	    p = SpeechDetector.Nd57f8d3497(i);
	    } 
	    return p;
	  }
	  static double N6078498487(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.470300634368174) {
	    p = SpeechDetector.N57921a3f488(i);
	    } else if (((Double) i[2]).doubleValue() > 5.470300634368174) {
	    p = SpeechDetector.N59aafe69493(i);
	    } 
	    return p;
	  }
	  static double N57921a3f488(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -4.273657283521044) {
	    p = SpeechDetector.N38f94b03489(i);
	    } else if (((Double) i[8]).doubleValue() > -4.273657283521044) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N38f94b03489(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -1.595165248679433) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -1.595165248679433) {
	    p = SpeechDetector.N76abcf2d490(i);
	    } 
	    return p;
	  }
	  static double N76abcf2d490(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -1.645179043144086) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -1.645179043144086) {
	    p = SpeechDetector.N9aed039491(i);
	    } 
	    return p;
	  }
	  static double N9aed039491(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 94.95961050864479) {
	    p = SpeechDetector.N33e85326492(i);
	    } else if (((Double) i[0]).doubleValue() > 94.95961050864479) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N33e85326492(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.5499572241962282) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -0.5499572241962282) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N59aafe69493(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 0.7372784234651973) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 0.7372784234651973) {
	    p = SpeechDetector.N6924cd7c494(i);
	    } 
	    return p;
	  }
	  static double N6924cd7c494(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.39185890662510237) {
	    p = SpeechDetector.N6f2ebdd1495(i);
	    } else if (((Double) i[9]).doubleValue() > 0.39185890662510237) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6f2ebdd1495(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.952282742979117) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -0.952282742979117) {
	    p = SpeechDetector.N65b01d5d496(i);
	    } 
	    return p;
	  }
	  static double N65b01d5d496(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 82.38583674932764) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 82.38583674932764) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nd57f8d3497(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.440760251268279) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.440760251268279) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Na90eb7d498(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.24140579047518143) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.24140579047518143) {
	    p = SpeechDetector.N305460f6499(i);
	    } 
	    return p;
	  }
	  static double N305460f6499(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.2371990944902236) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.2371990944902236) {
	    p = SpeechDetector.N73a9cf43500(i);
	    } 
	    return p;
	  }
	  static double N73a9cf43500(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.8347952888427957) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.8347952888427957) {
	    p = SpeechDetector.N11667308501(i);
	    } 
	    return p;
	  }
	  static double N11667308501(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.9207308833696555) {
	    p = SpeechDetector.N5d0a1b24502(i);
	    } else if (((Double) i[3]).doubleValue() > 4.9207308833696555) {
	    p = SpeechDetector.N72390d8f508(i);
	    } 
	    return p;
	  }
	  static double N5d0a1b24502(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.0901201976828387) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -2.0901201976828387) {
	    p = SpeechDetector.N427c0834503(i);
	    } 
	    return p;
	  }
	  static double N427c0834503(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.082472520155011) {
	    p = SpeechDetector.N5cfeb005504(i);
	    } else if (((Double) i[11]).doubleValue() > -2.082472520155011) {
	    p = SpeechDetector.N400e5156506(i);
	    } 
	    return p;
	  }
	  static double N5cfeb005504(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.1391884671770507) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 2.1391884671770507) {
	    p = SpeechDetector.N54d647f5505(i);
	    } 
	    return p;
	  }
	  static double N54d647f5505(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 8.641696712821052) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 8.641696712821052) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N400e5156506(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.6244479847736435) {
	    p = SpeechDetector.N6bfe05f4507(i);
	    } else if (((Double) i[9]).doubleValue() > 0.6244479847736435) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6bfe05f4507(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 91.41149923758886) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 91.41149923758886) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N72390d8f508(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -2.286776615703954) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -2.286776615703954) {
	    p = SpeechDetector.N7fa961de509(i);
	    } 
	    return p;
	  }
	  static double N7fa961de509(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 6.936613411632326) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 6.936613411632326) {
	      p = 0;
	    } 
	    return p;
	  }
	}
