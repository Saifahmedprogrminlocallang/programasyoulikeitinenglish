
/**********

package programinlocallang;

import java.util.*;  
import java.io.*; 

public class Mapper{  
	
	public static void main(String args[]) throws Exception{  
		  
		 // Computer language keyword mapper
		
		  String InputLangKeywordFilename = "D:\\Saif\\LocallangProgram\\Inputlangkeywordfile.txt";

	      String strCurrentLinenew2 = "";
	      String keyword2=""; 
		  String keywordstartpattern2 = "-";
		  
		  int keywordhyphenstartpattern2 =0;
		  
		  int counter2 =0;
		  
	      Hashtable<Integer,String> hm2=new Hashtable<Integer,String>();  
		  
	      try {

			  BufferedReader br_inputlanglkfile = new BufferedReader(new FileReader(InputLangKeywordFilename ));
					  
			    while ((strCurrentLinenew2 = br_inputlanglkfile.readLine()) != null) {
			        System.out.println("strCurrentLinenew2 " + strCurrentLinenew2);
			    	
			        keywordhyphenstartpattern2 = strCurrentLinenew2.indexOf(keywordstartpattern2)	;
			    	if (keywordhyphenstartpattern2>0) {
			        keyword2 = strCurrentLinenew2.substring(keywordhyphenstartpattern2);
			    	keyword2 = keyword2.substring(2, keyword2.length());
			    	keyword2 = keyword2.trim();
			    	counter2 = counter2 + 1;
			    	hm2.put(counter2, keyword2);
			    	System.out.println("keyword2 - " +keyword2);
			    	}
			    }
			    br_inputlanglkfile.close();
			   } catch (Exception e) {
				e.getStackTrace();   
			   } 		
*************/

/*		Hashtable<Integer,String> hm1=new Hashtable<Integer,String>();  

	  hm1.put(1,"abstract");		//9
	  hm1.put(2,"assert");	 	//18
	  hm1.put(3,"boolean");	 	//27
	  hm1.put(4,"break");	 	//36
	  hm1.put(5,"byte");	 		//45
	  hm1.put(6,"case");	 		//54
	  hm1.put(7,"catch");	 	//63
	  hm1.put(8,"char");	 		//72
	  hm1.put(9,"class");	 	//81
	  hm1.put(10,"const");	 	//21

	  hm1.put(11,"continue");		  
	  hm1.put(12,"default");			  
	  hm1.put(13,"do");		
	  hm1.put(14,"double");			
	  hm1.put(15,"else");			
	  hm1.put(16,"enum");			
	  hm1.put(17,"extends");		
	  hm1.put(18,"final");		
	  hm1.put(19,"finally");		
	  hm1.put(20,"float");		

	  hm1.put(21,"for");		
	  hm1.put(22,"goto");		
	  hm1.put(23,"if");		
	  hm1.put(24,"implements");	
	  hm1.put(25,"import");		
	  hm1.put(26,"instanceof");	
	  hm1.put(27,"int");		
	  hm1.put(28,"interface");	
	  hm1.put(29,"long");		
	  hm1.put(30,"native");		

	  hm1.put(31,"new");		
	  hm1.put(32,"package");		
	  hm1.put(33,"private");		
	  hm1.put(34,"protected");	
	  hm1.put(35,"public");		
	  hm1.put(36,"return");		
	  hm1.put(37,"short");		
	  hm1.put(38,"static");		
	  hm1.put(39,"strictfp");	
	  hm1.put(40,"super");		

	  hm1.put(41,"switch");		
	  hm1.put(42,"synchronized");	
	  hm1.put(43,"this");		
	  hm1.put(44,"throw");	 
	  hm1.put(45,"throws");		
	  hm1.put(46,"transient");		
	  hm1.put(47,"try");		
	  hm1.put(48,"void");	
	  hm1.put(49,"volatile");	
	  hm1.put(50,"while");	

*/

/******
		  String AlgorthmMapperFilename = "D:\\Saif\\LocallangProgram\\AlgorthmMapperfile.txt";
		  String ApiMapperFilename = "D:\\Saif\\LocallangProgram\\ApiMapperfile.txt";
		  
	      String strCurrentLinenew32 = "";
	      String keyword32=""; 
		  String keywordstartpattern32 = "-";

		  String strCurrentLinenew31 = "";
	      String keyword31=""; 
		  String keywordstartpattern31 = "-";
		  
		  int keywordhyphenstartpattern3 =0;
		  
		  int counter3 =0;
		  
	      Hashtable<Integer,String> hm5 = new Hashtable<Integer,String>(); //5-53   
	      Hashtable<Integer,String> hm52 = new Hashtable<Integer,String>(); //52   
		  
	      try {

			  BufferedReader br_apimapperfile = new BufferedReader(new FileReader(ApiMapperFilename));
					  
			    while ((strCurrentLinenew32 = br_apimapperfile.readLine()) != null) {
			        System.out.println("strCurrentLinenew32 " + strCurrentLinenew32);
			    	
			        keywordhyphenstartpattern3 = strCurrentLinenew32.indexOf(keywordstartpattern32);
			    	if (keywordhyphenstartpattern3>0) {
			        keyword32 = strCurrentLinenew32.substring(keywordhyphenstartpattern3); //api
			    	keyword32 = keyword32.substring(2, keyword32.length()); //hashtable
			    	System.out.println("keyword32 - "+ keyword32);
			    	
			    	keyword31 = strCurrentLinenew32.substring(0,keywordhyphenstartpattern3-1); //customapitobemapped
			    	keyword31 = keyword31.trim();
			    	System.out.println("keyword31 - "+ keyword31);			    	
			    	
			    	keyword32 = keyword32.trim();
			    	counter3 = counter3 + 1;
			    	hm5.put(counter3, keyword32); // api
			    	hm52.put(counter3, keyword31); // custom api tobemapped
			    	System.out.println("keyword32 - " +keyword32);
			    	System.out.println("keyword31 - " +keyword31);			    	
			    	}
			    	else
			    	{
			    		keywordhyphenstartpattern3=0;
			    	}
			    }
			    br_apimapperfile.close();
			   } catch (Exception e) {
				e.getStackTrace();   
			   } 	      
	      
	 // print api mapper hashtables     
	      for(Map.Entry oq:hm5.entrySet()){  
			   System.out.println("o-q " + oq.getKey()+" "+oq.getValue());  
			  } 	  

	      for(Map.Entry ov:hm52.entrySet()){  
			   System.out.println("o-v " + ov.getKey()+" "+ov.getValue());  
			  }
	      
	      
	 // Local language keyword mapper 
	  String localLangKeywordFilename = "D:\\Saif\\LocallangProgram\\Keywordfile.txt";

      String strCurrentLinenew = "";
      String keyword=""; 
	  String keywordstartpattern = "-";
	  
	  int keywordhyphenstartpattern =0;
	  
	  int counter =0;
	  
      Hashtable<Integer,String> ht2=new Hashtable<Integer,String>();  
	  
      try {

		  BufferedReader br_loclanglkfile = new BufferedReader(new FileReader(localLangKeywordFilename));
				  
		    while ((strCurrentLinenew = br_loclanglkfile.readLine()) != null) {
		        System.out.println("strCurrentLinenew " + strCurrentLinenew);
		    	
		        keywordhyphenstartpattern = strCurrentLinenew.indexOf(keywordstartpattern)	;
		    	if (keywordhyphenstartpattern>0) {
		        keyword = strCurrentLinenew.substring(keywordhyphenstartpattern);
		    	keyword = keyword.substring(2, keyword.length());
		    	keyword = keyword.trim();
		    	counter = counter + 1;
		    	ht2.put(counter, keyword);
		    	System.out.println("keyword - " +keyword);
		    	}
		    }
		    br_loclanglkfile.close();
		   } catch (Exception e) {
			e.getStackTrace();   
		   } 
***************/	  
	  
	  // local lang details
/*      Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();  
	  
	  ht1.put(1,"ekcheezjoabibaninahihai");	//9 abstract
	  ht1.put(2,"yehsahihaiyanahinai");	 	//18 assert
	  ht1.put(3,"ekyazeroshuniyamuttai");	 	//27 boolean
	  ht1.put(4,"roko");	 	//36 break
	  ht1.put(5,"byte");	 	//45 
	  ht1.put(6,"aisaaisakaro");	 	//54 case
	  ht1.put(7,"galtikopakdoaurhandlekaro");	 	//63 catch
	  ht1.put(8,"huroofkocomputermeinrakhnekeliye");	    //72 char
	  ht1.put(9,"cheezjocomputerkeliyebanyigayihai");	 	//81 class
	  ht1.put(10,"huroofselavsjobadaltanahi");	 	//21 const

	  ht1.put(11,"kamchalukkaro");		  //continue 
	  ht1.put(12,"yechkarna");			  //default
	  ht1.put(13,"karo");				  //do
	  ht1.put(14,"badanumber2");		  //double
	  ht1.put(15,"yehnahitohwohkaro");	  //else 		
	  ht1.put(16,"enum");				  //enum
	  ht1.put(17,"iskejaisa");			  //extends
	  ht1.put(18,"badalnahisakta");		  //final
	  ht1.put(19,"galtipakadnekebaadyehkaro");	//finally 	
	  ht1.put(20,"badanumber1");		 //float 

	  ht1.put(21,"itnebaarkaro");		//for
	  ht1.put(22,"yahanjaowhanjao");	//goto	
	  ht1.put(23,"agar");		        //if
	  ht1.put(24,"iseistemalmeinlao");	//implements
	  ht1.put(25,"yehprogramkolaoapikolao");	//import	
	  ht1.put(26,"kyayehischeezkejaisahai");	//instanceof
	  ht1.put(27,"ekdokiginti");		//int
	  ht1.put(28,"yehbatatahaikiyehkaamkartahai");	//interface
	  ht1.put(29,"badaekdokiginti");		//long
	  ht1.put(30,"cc++jaisacomputerkanative");		//native

	  ht1.put(31,"naya");		//new
	  ht1.put(32,"eksaathkaamkarnewaleprogramkicheezjocomputerkeliyebanayigayihain");		//package
	  ht1.put(33,"zaativariable");		//private
	  ht1.put(34,"bachakerakhagayavariable");	//protected
	  ht1.put(35,"sabkeliye");		//public
	  ht1.put(36,"wapasjaobhejo");		//return
	  ht1.put(37,"ekdokigintichota1");		//short
	  ht1.put(38,"badaltanahinaiso");		//static
	  ht1.put(39,"strictfp");	//
	  ht1.put(40,"baapka");		//super

	  ht1.put(41,"aisakaroyaaisakaro");			//switch
	  ht1.put(42,"ekbaarkoekhi");	//synchronized
	  ht1.put(43,"yehise");		//this
	  ht1.put(44,"galtipakdo");	 //throw
	  ht1.put(45,"galtiphekoaurpakdo");	//throws	
	  ht1.put(46,"transient");		//
	  ht1.put(47,"aazmao");		//try
	  ht1.put(48,"kuchnahi");	//void
	  ht1.put(49,"volatile");	//
	  ht1.put(50,"jabtakyehsahihaiyehkaro");	//while
	  
*/	  

/*******************

	  for(Map.Entry m:hm2.entrySet()){  
		   System.out.println("k " + m.getKey()+" "+m.getValue());  
		  } 	  
	    		  
	  for(Map.Entry n:ht2.entrySet()){  
		   System.out.println("j " + n.getKey()+" "+n.getValue());  
		  } 	  	  
	  
	  // program to map
	  
	  String localLangFilename = "D:\\Saif\\LocallangProgram\\Inputfile.java";

      String strCurrentLine = "";
	  String strFile = "";
	  String strFilereplaced = "";
	  
	  try {

		  BufferedReader br = new BufferedReader(new FileReader(localLangFilename));
				  
		    while ((strCurrentLine = br.readLine()) != null) {
		    // System.out.println(strCurrentLine);
		    strFile = strFile + " \n" + strCurrentLine ;
		    }
		    br.close();
		   } catch (Exception e) {
			e.getStackTrace();   
		   } 
	  
	  		System.out.println("before replace" + strFile);

		    Set yourSet = hm2.keySet(); // hm 
		    							// it 
		    							// hmt
		    							// mSet
		    Iterator it1 = yourSet.iterator();
		    
		    //Set replaceSet = ht1.keySet(); 
		    Set replaceSet = ht2.keySet(); 
		    // hm 
			// it 
			// hmt
		    // pSet, tSet
		    Iterator it2 = replaceSet.iterator();

		    Set customapireplaceSet = hm52.keySet(); 
		    // hm 
			// it 
			// hmt
		    // pSet, tSet
		    Iterator ithm53 = customapireplaceSet.iterator();

		    Set apireplaceSet = hm5.keySet(); 
		    // hm 
			// it 
			// hmt
		    // pSet, tSet
		    Iterator ithm552 = apireplaceSet.iterator();
		   		    
		    
//		hm5.put(counter3, keyword32); // api
//	    hm52.put(counter3, keyword31); // custom api tobemapped
		    
		    String kString ="";
		    String jString ="";
		    
		    while(it2.hasNext())
		    {
		      Object k = it1.next();
		      Object v = hm2.get(k);
		      System.out.println(k + " : " + v);
		      kString =  v.toString();

		      Object j = it2.next();
		      Object p = ht2.get(j); //ht1.get(j);
		      System.out.println(j + " : " + p);
		      jString = p.toString();

			  if (strFile.contains(jString)) {
				  
				    System.out.println("jString - " + jString);
				    System.out.println("kString - " + kString);

				    strFilereplaced = strFile.replaceAll(jString, kString); //replaceAll(jString, kString); 
				    strFile = strFilereplaced;
				    System.out.println("found.");
				//    System.out.println("strFilereplaced - " + strFilereplaced);
				//    System.out.println("strFile - " + strFile);
				}else{

					System.out.println("jString - " + jString);
				    System.out.println("kString - " + kString);

					System.out.println("not found!");
			//	    System.out.println("strFile - " + strFile);
				}

		       }		      

		   //api replace
		    String oqpString ="";
		    String oqvString ="";
		    String oqsString ="";
		    
		    while(ithm53.hasNext())
		    {
		      Object oqp = ithm53.next();
		      Object oqv = hm52.get(oqp);
		      System.out.println(oqp + " : " + oqv);
		      oqpString = oqv.toString(); //customapi

		      Object oqs = ithm552.next();
		      Object oqtu = hm5.get(oqs); //ht1.get(j);
		      System.out.println(oqs + " : " + oqtu);
		      oqsString = oqtu.toString(); //api
		      
		      
		      if (strFile.contains(oqvString)) {
				  
				    System.out.println("oqvString - " + oqvString);
				    System.out.println("oqpString - " + oqpString);

				    strFilereplaced = strFile.replaceAll(oqpString, oqsString); //replaceAll(jString, kString); 
				    strFile = strFilereplaced;
				    System.out.println("found.");
				//    System.out.println("strFilereplaced - " + strFilereplaced);
				//    System.out.println("strFile - " + strFile);
				}else{

					System.out.println("oqpString - " + oqpString);
				    System.out.println("oqsString - " + oqsString);

					System.out.println("not found!");
			//	    System.out.println("strFile - " + strFile);
				}

		       }		    
		    
		    System.out.println("replaced file" + strFile); 
					  		    
	  // mapped program
		    
	  String localLangoutputFilename = "D:\\Saif\\LocallangProgram\\Outputfile.java";
	  try {
		  BufferedWriter bw = new BufferedWriter(new FileWriter(localLangoutputFilename));
		  bw.write(strFile); 
		  bw.close();
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }  

	}
}

**********/